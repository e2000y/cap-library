// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cap.proto
// Protobuf Java Version: 4.28.1

package com.google.publicalerts.cap;

/**
 * <pre>
 * WGS-84 coordinate pair
 * </pre>
 *
 * Protobuf type {@code publicalerts.cap.Point}
 */
public final class Point extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:publicalerts.cap.Point)
    PointOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      Point.class.getName());
  }
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Point() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.publicalerts.cap.Point.class, com.google.publicalerts.cap.Point.Builder.class);
  }

  private int bitField0_;
  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_ = 0D;
  /**
   * <code>required double latitude = 1;</code>
   * @return Whether the latitude field is set.
   */
  @java.lang.Override
  public boolean hasLatitude() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required double latitude = 1;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_ = 0D;
  /**
   * <code>required double longitude = 2;</code>
   * @return Whether the longitude field is set.
   */
  @java.lang.Override
  public boolean hasLongitude() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required double longitude = 2;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasLatitude()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasLongitude()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, latitude_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, longitude_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.publicalerts.cap.Point)) {
      return super.equals(obj);
    }
    com.google.publicalerts.cap.Point other = (com.google.publicalerts.cap.Point) obj;

    if (hasLatitude() != other.hasLatitude()) return false;
    if (hasLatitude()) {
      if (java.lang.Double.doubleToLongBits(getLatitude())
          != java.lang.Double.doubleToLongBits(
              other.getLatitude())) return false;
    }
    if (hasLongitude() != other.hasLongitude()) return false;
    if (hasLongitude()) {
      if (java.lang.Double.doubleToLongBits(getLongitude())
          != java.lang.Double.doubleToLongBits(
              other.getLongitude())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLatitude()) {
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLatitude()));
    }
    if (hasLongitude()) {
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLongitude()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.publicalerts.cap.Point parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.publicalerts.cap.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.publicalerts.cap.Point parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.publicalerts.cap.Point parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.publicalerts.cap.Point prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * WGS-84 coordinate pair
   * </pre>
   *
   * Protobuf type {@code publicalerts.cap.Point}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicalerts.cap.Point)
      com.google.publicalerts.cap.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.publicalerts.cap.Point.class, com.google.publicalerts.cap.Point.Builder.class);
    }

    // Construct using com.google.publicalerts.cap.Point.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      latitude_ = 0D;
      longitude_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Point_descriptor;
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Point getDefaultInstanceForType() {
      return com.google.publicalerts.cap.Point.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Point build() {
      com.google.publicalerts.cap.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Point buildPartial() {
      com.google.publicalerts.cap.Point result = new com.google.publicalerts.cap.Point(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.publicalerts.cap.Point result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.latitude_ = latitude_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.longitude_ = longitude_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.publicalerts.cap.Point) {
        return mergeFrom((com.google.publicalerts.cap.Point)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.publicalerts.cap.Point other) {
      if (other == com.google.publicalerts.cap.Point.getDefaultInstance()) return this;
      if (other.hasLatitude()) {
        setLatitude(other.getLatitude());
      }
      if (other.hasLongitude()) {
        setLongitude(other.getLongitude());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasLatitude()) {
        return false;
      }
      if (!hasLongitude()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {
              latitude_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              longitude_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private double latitude_ ;
    /**
     * <code>required double latitude = 1;</code>
     * @return Whether the latitude field is set.
     */
    @java.lang.Override
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required double latitude = 1;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>required double latitude = 1;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {

      latitude_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required double latitude = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      bitField0_ = (bitField0_ & ~0x00000001);
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>required double longitude = 2;</code>
     * @return Whether the longitude field is set.
     */
    @java.lang.Override
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required double longitude = 2;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>required double longitude = 2;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {

      longitude_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required double longitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      bitField0_ = (bitField0_ & ~0x00000002);
      longitude_ = 0D;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:publicalerts.cap.Point)
  }

  // @@protoc_insertion_point(class_scope:publicalerts.cap.Point)
  private static final com.google.publicalerts.cap.Point DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.publicalerts.cap.Point();
  }

  public static com.google.publicalerts.cap.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point>
      PARSER = new com.google.protobuf.AbstractParser<Point>() {
    @java.lang.Override
    public Point parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.publicalerts.cap.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

