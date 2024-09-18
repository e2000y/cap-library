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

import junit.framework.TestCase;

/**
 * Tests for {@link CapXmlBuilder}.
 *
* @author shakusa@google.com (Steve Hakusa)
 */
public class CapXmlBuilderTest extends TestCase {

  private static final String XML_DECLARATION =
      "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

  private CapXmlBuilder builder = new CapXmlBuilder(null);

  public CapXmlBuilderTest(String s) {
    super(s);
  }

  public void testAlert() {
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP_LATEST_XMLNS)
        .setIdentifier("43b080713727")
        .setSender("hsas@dhs.gov")
        .setSent("2003-04-02T14:39:01-05:00")
        .setStatus(Alert.Status.ACTUAL)
        .setMsgType(Alert.MsgType.ALERT)
        .setSource("a source")
        .setScope(Alert.Scope.PUBLIC)
        .setRestriction("a restriction")
        .setAddresses(Group.newBuilder().addValue("address 1").addValue("address2").build())
        .addCode("abcde")
        .addCode("fghij")
        .setNote("a note")
        .setReferences(Group.newBuilder().addValue("reference1").addValue("reference 2").build())
        .setIncidents(Group.newBuilder().addValue("incident1").addValue("incident2").build())
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP_LATEST_XMLNS + "\">"
        + "<identifier>43b080713727</identifier>"
        + "<sender>hsas@dhs.gov</sender>"
        + "<sent>2003-04-02T14:39:01-05:00</sent>"
        + "<status>Actual</status>"
        + "<msgType>Alert</msgType>"
        + "<source>a source</source>"
        + "<scope>Public</scope>"
        + "<restriction>a restriction</restriction>"
        + "<addresses>\"address 1\" address2</addresses>"
        + "<code>abcde</code>"
        + "<code>fghij</code>"
        + "<note>a note</note>"
        + "<references>reference1 \"reference 2\"</references>"
        + "<incidents>incident1 incident2</incidents>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testInfo() throws Exception {
    Info info1 = Info.newBuilder()
        .addCategory(Info.Category.SECURITY)
        .addCategory(Info.Category.SAFETY)
        .setEvent("Homeland Security Advisory System Update")
        .setUrgency(Info.Urgency.UNKNOWN_URGENCY)
        .setSeverity(Info.Severity.UNKNOWN_SEVERITY)
        .setCertainty(Info.Certainty.UNKNOWN_CERTAINTY)
        .setSenderName("Department of Homeland Security")
        .setHeadline("Homeland Security Sets Code ORANGE")
        .setDescription("DHS has set the threat level to ORANGE.")
        .setInstruction("Take Protective Measures.")
        .setWeb("http://www.dhs.gov/dhspublic/display?theme=29")
        .addParameter(ValuePair.newBuilder()
            .setValueName("HSAS").setValue("ORANGE").build())
        .addParameter(ValuePair.newBuilder()
            .setValueName("p2").setValue("v2").build())
        .buildPartial();

    Info info2 = Info.newBuilder()
        .setAudience("an audience")
        .setContact("a contact")
        .addEventCode(ValuePair.newBuilder()
            .setValueName("EC").setValue("v1").build())
        .addEventCode(ValuePair.newBuilder()
            .setValueName("EC2").setValue("v2").build())
        .setEffective("2003-04-02T14:39:01-05:00")
        .setOnset("2003-04-02T15:39:01+05:00")
        .setExpires("2003-04-02T16:39:01-00:00")
        .buildPartial();

    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP_LATEST_XMLNS)
        .addInfo(info1)
        .addInfo(info2)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP_LATEST_XMLNS + "\">"
        + "<info>"
        + "<category>Security</category>"
        + "<category>Safety</category>"
        + "<event>Homeland Security Advisory System Update</event>"
        + "<urgency>Unknown</urgency>"
        + "<severity>Unknown</severity>"
        + "<certainty>Unknown</certainty>"
        + "<senderName>Department of Homeland Security</senderName>"
        + "<headline>Homeland Security Sets Code ORANGE</headline>"
        + "<description>DHS has set the threat level to ORANGE.</description>"
        + "<instruction>Take Protective Measures.</instruction>"
        + "<web>http://www.dhs.gov/dhspublic/display?theme=29</web>"
        + "<parameter>"
        + "<valueName>HSAS</valueName>"
        + "<value>ORANGE</value>"
        + "</parameter>"
        + "<parameter>"
        + "<valueName>p2</valueName>"
        + "<value>v2</value>"
        + "</parameter>"
        + "</info>"
        + "<info>"
        + "<audience>an audience</audience>"
        + "<eventCode>"
        + "<valueName>EC</valueName>"
        + "<value>v1</value>"
        + "</eventCode>"
        + "<eventCode>"
        + "<valueName>EC2</valueName>"
        + "<value>v2</value>"
        + "</eventCode>"
        + "<effective>2003-04-02T14:39:01-05:00</effective>"
        + "<onset>2003-04-02T15:39:01+05:00</onset>"
        + "<expires>2003-04-02T16:39:01-00:00</expires>"
        + "<contact>a contact</contact>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }


  public void testArea() throws Exception {
    Area area1 = Area.newBuilder()
        .addPolygon(Polygon.newBuilder()
            .addPoint(Point.newBuilder().setLatitude(1).setLongitude(2).build())
            .addPoint(Point.newBuilder().setLatitude(3).setLongitude(4).build())
            .addPoint(Point.newBuilder().setLatitude(5).setLongitude(6).build())
            .addPoint(Point.newBuilder().setLatitude(1).setLongitude(2).build())
            .build())
        .addPolygon(Polygon.newBuilder()
            .addPoint(
                Point.newBuilder().setLatitude(11).setLongitude(12).build())
            .addPoint(
                Point.newBuilder().setLatitude(13).setLongitude(14).build())
            .addPoint(
                Point.newBuilder().setLatitude(15).setLongitude(16).build())
            .addPoint(
                Point.newBuilder().setLatitude(11).setLongitude(12).build())
            .build())
        .addCircle(Circle.newBuilder()
            .setPoint(Point.newBuilder().setLatitude(1).setLongitude(2).build())
            .setRadius(3).build())
        .addCircle(Circle.newBuilder()
            .setPoint(Point.newBuilder()
              .setLatitude(4).setLongitude(5).build()).setRadius(6).build())
        .addGeocode(ValuePair.newBuilder()
            .setValueName("G1").setValue("v1").build())
        .addGeocode(ValuePair.newBuilder()
            .setValueName("G2").setValue("v2").build())
        .setAltitude(5.5)
        .setCeiling(6.5)
        .buildPartial();
    Area area2 = Area.newBuilder().setAreaDesc("U.S. nationwide").build();
    Info info = Info.newBuilder().addArea(area1).addArea(area2).buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP_LATEST_XMLNS)
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP_LATEST_XMLNS + "\">"
        + "<info>"
        + "<area>"
        + "<polygon>1.0,2.0 3.0,4.0 5.0,6.0 1.0,2.0</polygon>"
        + "<polygon>11.0,12.0 13.0,14.0 15.0,16.0 11.0,12.0</polygon>"
        + "<circle>1.0,2.0 3.0</circle>"
        + "<circle>4.0,5.0 6.0</circle>"
        + "<geocode>"
        + "<valueName>G1</valueName>"
        + "<value>v1</value>"
        + "</geocode>"
        + "<geocode>"
        + "<valueName>G2</valueName>"
        + "<value>v2</value>"
        + "</geocode>"
        + "<altitude>5.5</altitude>"
        + "<ceiling>6.5</ceiling>"
        + "</area>"
        + "<area>"
        + "<areaDesc>U.S. nationwide</areaDesc>"
        + "</area>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testResource() throws Exception {
    Resource resource1 = Resource.newBuilder()
        .setMimeType("image/gif")
        .setSize(123)
        .setDerefUri("a deref uri")
        .setDigest("a digest")
        .buildPartial();
    Resource resource2 = Resource.newBuilder()
        .setResourceDesc("Image file (GIF)")
        .setUri("http://www.dhs.gov/dhspublic/getAdvisoryImage")
        .buildPartial();

    Info info = Info.newBuilder()
        .addResource(resource1)
        .addResource(resource2)
        .buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP_LATEST_XMLNS)
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP_LATEST_XMLNS + "\">"
        + "<info>"
        + "<resource>"
        + "<mimeType>image/gif</mimeType>"
        + "<size>123</size>"
        + "<derefUri>a deref uri</derefUri>"
        + "<digest>a digest</digest>"
        + "</resource>"
        + "<resource>"
        + "<resourceDesc>Image file (GIF)</resourceDesc>"
        + "<uri>http://www.dhs.gov/dhspublic/getAdvisoryImage</uri>"
        + "</resource>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  @SuppressWarnings("deprecation")
  public void testCap10() throws Exception {
    Area area = Area.newBuilder()
        .addGeocode(ValuePair.newBuilder()
            .setValueName("G1").setValue("v1").build())
        .buildPartial();

    Info info = Info.newBuilder()
        .setCertainty(Info.Certainty.VERY_LIKELY)
        .addParameter(ValuePair.newBuilder()
            .setValueName("HSAS").setValue("ORANGE").build())
        .addEventCode(ValuePair.newBuilder()
            .setValueName("EC").setValue("v1").build())
        .addArea(area)
        .buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP10_XMLNS)
        .setPassword("obsolete")
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP10_XMLNS + "\">"
        + "<password>obsolete</password>"
        + "<info>"
        + "<certainty>Very Likely</certainty>"
        + "<eventCode>EC=v1</eventCode>"
        + "<parameter>HSAS=ORANGE</parameter>"
        + "<area>"
        + "<geocode>G1=v1</geocode>"
        + "</area>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testCap11() throws Exception {
    Resource resource = Resource.newBuilder()
        .setDerefUri("deref uri")
        .buildPartial();
    Info info = Info.newBuilder()
        .addCategory(Info.Category.CBRNE)
        .addResponseType(Info.ResponseType.EVACUATE)
        .addResource(resource)
        .buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP11_XMLNS)
        .setStatus(Alert.Status.DRAFT)
        .setScope(Alert.Scope.PUBLIC)
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP11_XMLNS + "\">"
        + "<status>Draft</status>"
        + "<scope>Public</scope>"
        + "<info>"
        + "<category>CBRNE</category>"
        + "<responseType>Evacuate</responseType>"
        + "<resource>"
        + "<derefUri>deref uri</derefUri>"
        + "</resource>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testCap12() throws Exception {
    Info info = Info.newBuilder()
        .addResponseType(Info.ResponseType.AVOID)
        .addResponseType(Info.ResponseType.ALL_CLEAR)
        .buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP12_XMLNS)
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP12_XMLNS + "\">"
        + "<info>"
        + "<responseType>Avoid</responseType>"
        + "<responseType>AllClear</responseType>"
        + "</info>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testNoPrettyPrint() {
    builder = new CapXmlBuilder(null);
    Info info = Info.newBuilder()
        .setHeadline("headline")
        .buildPartial();
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP12_XMLNS)
        .addInfo(info)
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP12_XMLNS + "\">"
        + "<info><headline>headline</headline></info></alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testEscaping() {
    Alert alert = Alert.newBuilder().setXmlns(CapValidator.CAP12_XMLNS)
        .setNote("&<>\u0005")
        .buildPartial();

    String alertStr = XML_DECLARATION
        + "<alert xmlns=\"" + CapValidator.CAP12_XMLNS + "\">"
        + "<note>&amp;&lt;&gt;&#x5;</note>"
        + "</alert>";

    assertEquals(alertStr, builder.toXml(alert));
  }

  public void testMaybeQuote() {
    assertEquals("", builder.maybeQuote(""));
    assertEquals("foo", builder.maybeQuote("foo"));
    assertEquals("\"foo bar\"", builder.maybeQuote("foo bar"));
    assertEquals("\"foo\tbar\"", builder.maybeQuote("foo\tbar"));
  }
}
