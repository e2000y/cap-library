/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.publicalerts.cap;

import com.google.common.collect.ImmutableList;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.io.Writer;

import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Utility methods working with XML parsing and building.
 *
 * @author shakusa@google.com (Steve Hakusa)
 */
public class XmlUtil {

  /** XML parser features related to fetching external content. */
  private static final List<String> XML_EXTERNAL_FEATURES = ImmutableList.of(
      "http://xml.org/sax/features/external-general-entities",
      "http://xml.org/sax/features/external-parameter-entities",
      "http://apache.org/xml/features/nonvalidating/load-external-dtd");

  private XmlUtil() {}

  /**
   * Returns a new {@link DocumentBuilder}.
   *
   * @return a document builder
   * @throws RuntimeException on ParserConfigurationError
   */
  public static DocumentBuilder newDocumentBuilder() {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setNamespaceAware(true);

    for (String feature : XML_EXTERNAL_FEATURES) {
      try {
        dbf.setFeature(feature, false);
      } catch (ParserConfigurationException e) {
        throw new RuntimeException(
            "DocumentBuilderFactory doesn't support the required security features: "
            + e.getMessage(), e);
      }
    }

    try {
      dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    } catch (ParserConfigurationException e) {
      throw new RuntimeException(
          "DocumentBuilderFactory doesn't support the required security features: "
          + e.getMessage(), e);
    }

    try {
      return dbf.newDocumentBuilder();
    } catch (ParserConfigurationException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Parses the given {@link InputSource} into a {@link Document}.
   *
   * @param is the input to parse
   * @return the document
   * @throws SAXParseException on parse exception
   * @throws RuntimeException on IOException or non-parse-related SAXException
   */
  public static Document parseDocument(InputSource is)
      throws SAXParseException {
    DocumentBuilder builder = newDocumentBuilder();
    try {
      return builder.parse(is);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (SAXException e) {
      if (e instanceof SAXParseException) {
        throw (SAXParseException) e;
      }
      throw new RuntimeException(e);
    }
  }

  /**
   * Returns an XMLReader that prevents XEE attacks by not loading external features.
   */
  public static XMLReader getXMLReader(SAXParserFactory factory)
      throws ParserConfigurationException, SAXException {
    XMLReader xmlReader = factory.newSAXParser().getXMLReader();
    for (String feature : XML_EXTERNAL_FEATURES) {
      try {
        xmlReader.setFeature(feature, false);
      } catch (SAXNotRecognizedException e) {
        // Only FEATURE_SECURE_PROCESSING is required.
        // We handle this enforcement below.
      } catch (SAXNotSupportedException e) {
        throw new SAXException(
            "SAXParser doesn't support the required security features: "
            + e.getMessage(), e);
      }
    }

    try {
      xmlReader.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    } catch (SAXNotRecognizedException e) {
      throw new SAXException(
          "Wrapped XMLReader doesn't support the required security features: "
          + e.getMessage(), e);
    } catch (SAXNotSupportedException e) {
      throw new SAXException(
          "Wrapped XMLReader doesn't support the required security features: "
          + e.getMessage(), e);
    }

    return xmlReader;
  }

  /**
   * Writes the given document to the given writer.
   *
   * @param document the document to write
   * @param writer receives the written document
   * @param indent number of spaces to indent, null means don't indent
   */
  public static void writeDocument(
      Document document, Writer writer, Integer indent) {
    TransformerFactory tf = TransformerFactory.newInstance();
    try {
      Transformer trans = tf.newTransformer();
      if (indent != null) {
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
            String.valueOf(indent));
      }
      trans.transform(new DOMSource(document), new StreamResult(writer));
    } catch (TransformerConfigurationException e) {
      throw new RuntimeException(e);
    } catch (TransformerException e) {
      throw new RuntimeException(e);
    }
  }
}
