// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cap.proto
// Protobuf Java Version: 4.28.1

package com.google.publicalerts.cap;

public interface AreaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:publicalerts.cap.Area)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A text description of the affected area.
   * </pre>
   *
   * <code>required string area_desc = 1;</code>
   * @return Whether the areaDesc field is set.
   */
  boolean hasAreaDesc();
  /**
   * <pre>
   * A text description of the affected area.
   * </pre>
   *
   * <code>required string area_desc = 1;</code>
   * @return The areaDesc.
   */
  java.lang.String getAreaDesc();
  /**
   * <pre>
   * A text description of the affected area.
   * </pre>
   *
   * <code>required string area_desc = 1;</code>
   * @return The bytes for areaDesc.
   */
  com.google.protobuf.ByteString
      getAreaDescBytes();

  /**
   * <pre>
   * The paired values of points defining a polygon that delineates the affected
   * area of the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Polygon polygon = 2;</code>
   */
  java.util.List<com.google.publicalerts.cap.Polygon> 
      getPolygonList();
  /**
   * <pre>
   * The paired values of points defining a polygon that delineates the affected
   * area of the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Polygon polygon = 2;</code>
   */
  com.google.publicalerts.cap.Polygon getPolygon(int index);
  /**
   * <pre>
   * The paired values of points defining a polygon that delineates the affected
   * area of the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Polygon polygon = 2;</code>
   */
  int getPolygonCount();
  /**
   * <pre>
   * The paired values of points defining a polygon that delineates the affected
   * area of the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Polygon polygon = 2;</code>
   */
  java.util.List<? extends com.google.publicalerts.cap.PolygonOrBuilder> 
      getPolygonOrBuilderList();
  /**
   * <pre>
   * The paired values of points defining a polygon that delineates the affected
   * area of the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Polygon polygon = 2;</code>
   */
  com.google.publicalerts.cap.PolygonOrBuilder getPolygonOrBuilder(
      int index);

  /**
   * <pre>
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Circle circle = 3;</code>
   */
  java.util.List<com.google.publicalerts.cap.Circle> 
      getCircleList();
  /**
   * <pre>
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Circle circle = 3;</code>
   */
  com.google.publicalerts.cap.Circle getCircle(int index);
  /**
   * <pre>
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Circle circle = 3;</code>
   */
  int getCircleCount();
  /**
   * <pre>
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Circle circle = 3;</code>
   */
  java.util.List<? extends com.google.publicalerts.cap.CircleOrBuilder> 
      getCircleOrBuilderList();
  /**
   * <pre>
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.Circle circle = 3;</code>
   */
  com.google.publicalerts.cap.CircleOrBuilder getCircleOrBuilder(
      int index);

  /**
   * <pre>
   * The geographic code delineating the affected area of the alert message,
   * where the content of ?valueName? is a user-assigned string designating
   * the domain of the code, and the content of ?value? is a string (which
   * may represent a number) denoting the value itself
   * (e.g., valueName="SAME" and value="006113").
   * This element is primarily for compatibility with other systems. Use of
   * this element presumes knowledge of the coding system on the part of
   * recipients; therefore, for interoperability, it SHOULD be used in
   * concert with an equivalent description in the more universally understood
   * &lt;polygon&gt; and &lt;circle&gt; forms whenever possible.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.ValuePair geocode = 4;</code>
   */
  java.util.List<com.google.publicalerts.cap.ValuePair> 
      getGeocodeList();
  /**
   * <pre>
   * The geographic code delineating the affected area of the alert message,
   * where the content of ?valueName? is a user-assigned string designating
   * the domain of the code, and the content of ?value? is a string (which
   * may represent a number) denoting the value itself
   * (e.g., valueName="SAME" and value="006113").
   * This element is primarily for compatibility with other systems. Use of
   * this element presumes knowledge of the coding system on the part of
   * recipients; therefore, for interoperability, it SHOULD be used in
   * concert with an equivalent description in the more universally understood
   * &lt;polygon&gt; and &lt;circle&gt; forms whenever possible.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.ValuePair geocode = 4;</code>
   */
  com.google.publicalerts.cap.ValuePair getGeocode(int index);
  /**
   * <pre>
   * The geographic code delineating the affected area of the alert message,
   * where the content of ?valueName? is a user-assigned string designating
   * the domain of the code, and the content of ?value? is a string (which
   * may represent a number) denoting the value itself
   * (e.g., valueName="SAME" and value="006113").
   * This element is primarily for compatibility with other systems. Use of
   * this element presumes knowledge of the coding system on the part of
   * recipients; therefore, for interoperability, it SHOULD be used in
   * concert with an equivalent description in the more universally understood
   * &lt;polygon&gt; and &lt;circle&gt; forms whenever possible.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.ValuePair geocode = 4;</code>
   */
  int getGeocodeCount();
  /**
   * <pre>
   * The geographic code delineating the affected area of the alert message,
   * where the content of ?valueName? is a user-assigned string designating
   * the domain of the code, and the content of ?value? is a string (which
   * may represent a number) denoting the value itself
   * (e.g., valueName="SAME" and value="006113").
   * This element is primarily for compatibility with other systems. Use of
   * this element presumes knowledge of the coding system on the part of
   * recipients; therefore, for interoperability, it SHOULD be used in
   * concert with an equivalent description in the more universally understood
   * &lt;polygon&gt; and &lt;circle&gt; forms whenever possible.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.ValuePair geocode = 4;</code>
   */
  java.util.List<? extends com.google.publicalerts.cap.ValuePairOrBuilder> 
      getGeocodeOrBuilderList();
  /**
   * <pre>
   * The geographic code delineating the affected area of the alert message,
   * where the content of ?valueName? is a user-assigned string designating
   * the domain of the code, and the content of ?value? is a string (which
   * may represent a number) denoting the value itself
   * (e.g., valueName="SAME" and value="006113").
   * This element is primarily for compatibility with other systems. Use of
   * this element presumes knowledge of the coding system on the part of
   * recipients; therefore, for interoperability, it SHOULD be used in
   * concert with an equivalent description in the more universally understood
   * &lt;polygon&gt; and &lt;circle&gt; forms whenever possible.
   * </pre>
   *
   * <code>repeated .publicalerts.cap.ValuePair geocode = 4;</code>
   */
  com.google.publicalerts.cap.ValuePairOrBuilder getGeocodeOrBuilder(
      int index);

  /**
   * <pre>
   * The specific or minimum altitude of the affected area of the alert
   * message. If used with the &lt;ceiling&gt; element this value is the lower limit
   * of a range. Otherwise, this value specifies a specific altitude.
   * The altitude measure is in feet above mean sea level per the [WGS-84]
   * datum.
   * </pre>
   *
   * <code>optional double altitude = 5;</code>
   * @return Whether the altitude field is set.
   */
  boolean hasAltitude();
  /**
   * <pre>
   * The specific or minimum altitude of the affected area of the alert
   * message. If used with the &lt;ceiling&gt; element this value is the lower limit
   * of a range. Otherwise, this value specifies a specific altitude.
   * The altitude measure is in feet above mean sea level per the [WGS-84]
   * datum.
   * </pre>
   *
   * <code>optional double altitude = 5;</code>
   * @return The altitude.
   */
  double getAltitude();

  /**
   * <pre>
   * The maximum altitude of the affected area of the alert message.
   * MUST NOT be used except in combination with the &lt;altitude&gt; element.
   * The ceiling measure is in feet above mean sea level per the [WGS-84]
   * datum.
   * </pre>
   *
   * <code>optional double ceiling = 6;</code>
   * @return Whether the ceiling field is set.
   */
  boolean hasCeiling();
  /**
   * <pre>
   * The maximum altitude of the affected area of the alert message.
   * MUST NOT be used except in combination with the &lt;altitude&gt; element.
   * The ceiling measure is in feet above mean sea level per the [WGS-84]
   * datum.
   * </pre>
   *
   * <code>optional double ceiling = 6;</code>
   * @return The ceiling.
   */
  double getCeiling();
}
