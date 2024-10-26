// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cap.proto
// Protobuf Java Version: 4.28.1

package com.google.publicalerts.cap;

/**
 * <pre>
 * The paired values of a point and radius delineating the affected area of
 * the alert message.
 * </pre>
 *
 * Protobuf type {@code publicalerts.cap.Circle}
 */
public final class Circle extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:publicalerts.cap.Circle)
    CircleOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      Circle.class.getName());
  }
  // Use Circle.newBuilder() to construct.
  private Circle(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Circle() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Circle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Circle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.publicalerts.cap.Circle.class, com.google.publicalerts.cap.Circle.Builder.class);
  }

  private int bitField0_;
  public static final int POINT_FIELD_NUMBER = 1;
  private com.google.publicalerts.cap.Point point_;
  /**
   * <code>required .publicalerts.cap.Point point = 1;</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required .publicalerts.cap.Point point = 1;</code>
   * @return The point.
   */
  @java.lang.Override
  public com.google.publicalerts.cap.Point getPoint() {
    return point_ == null ? com.google.publicalerts.cap.Point.getDefaultInstance() : point_;
  }
  /**
   * <code>required .publicalerts.cap.Point point = 1;</code>
   */
  @java.lang.Override
  public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder() {
    return point_ == null ? com.google.publicalerts.cap.Point.getDefaultInstance() : point_;
  }

  public static final int RADIUS_FIELD_NUMBER = 2;
  private double radius_ = 0D;
  /**
   * <pre>
   * Radius is expressed in kilometers.
   * </pre>
   *
   * <code>required double radius = 2;</code>
   * @return Whether the radius field is set.
   */
  @java.lang.Override
  public boolean hasRadius() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Radius is expressed in kilometers.
   * </pre>
   *
   * <code>required double radius = 2;</code>
   * @return The radius.
   */
  @java.lang.Override
  public double getRadius() {
    return radius_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasPoint()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasRadius()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getPoint().isInitialized()) {
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
      output.writeMessage(1, getPoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, radius_);
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
        .computeMessageSize(1, getPoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, radius_);
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
    if (!(obj instanceof com.google.publicalerts.cap.Circle)) {
      return super.equals(obj);
    }
    com.google.publicalerts.cap.Circle other = (com.google.publicalerts.cap.Circle) obj;

    if (hasPoint() != other.hasPoint()) return false;
    if (hasPoint()) {
      if (!getPoint()
          .equals(other.getPoint())) return false;
    }
    if (hasRadius() != other.hasRadius()) return false;
    if (hasRadius()) {
      if (java.lang.Double.doubleToLongBits(getRadius())
          != java.lang.Double.doubleToLongBits(
              other.getRadius())) return false;
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
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    if (hasRadius()) {
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getRadius()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.publicalerts.cap.Circle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.publicalerts.cap.Circle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.publicalerts.cap.Circle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.publicalerts.cap.Circle parseFrom(
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
  public static Builder newBuilder(com.google.publicalerts.cap.Circle prototype) {
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
   * The paired values of a point and radius delineating the affected area of
   * the alert message.
   * </pre>
   *
   * Protobuf type {@code publicalerts.cap.Circle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicalerts.cap.Circle)
      com.google.publicalerts.cap.CircleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Circle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Circle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.publicalerts.cap.Circle.class, com.google.publicalerts.cap.Circle.Builder.class);
    }

    // Construct using com.google.publicalerts.cap.Circle.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getPointFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      radius_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.publicalerts.cap.Cap.internal_static_publicalerts_cap_Circle_descriptor;
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Circle getDefaultInstanceForType() {
      return com.google.publicalerts.cap.Circle.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Circle build() {
      com.google.publicalerts.cap.Circle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.publicalerts.cap.Circle buildPartial() {
      com.google.publicalerts.cap.Circle result = new com.google.publicalerts.cap.Circle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.publicalerts.cap.Circle result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.point_ = pointBuilder_ == null
            ? point_
            : pointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.radius_ = radius_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.publicalerts.cap.Circle) {
        return mergeFrom((com.google.publicalerts.cap.Circle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.publicalerts.cap.Circle other) {
      if (other == com.google.publicalerts.cap.Circle.getDefaultInstance()) return this;
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      if (other.hasRadius()) {
        setRadius(other.getRadius());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasPoint()) {
        return false;
      }
      if (!hasRadius()) {
        return false;
      }
      if (!getPoint().isInitialized()) {
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
            case 10: {
              input.readMessage(
                  getPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              radius_ = input.readDouble();
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

    private com.google.publicalerts.cap.Point point_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> pointBuilder_;
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     * @return Whether the point field is set.
     */
    public boolean hasPoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     * @return The point.
     */
    public com.google.publicalerts.cap.Point getPoint() {
      if (pointBuilder_ == null) {
        return point_ == null ? com.google.publicalerts.cap.Point.getDefaultInstance() : point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public Builder setPoint(com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
      } else {
        pointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public Builder setPoint(
        com.google.publicalerts.cap.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public Builder mergePoint(com.google.publicalerts.cap.Point value) {
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          point_ != null &&
          point_ != com.google.publicalerts.cap.Point.getDefaultInstance()) {
          getPointBuilder().mergeFrom(value);
        } else {
          point_ = value;
        }
      } else {
        pointBuilder_.mergeFrom(value);
      }
      if (point_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public Builder clearPoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public com.google.publicalerts.cap.Point.Builder getPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    public com.google.publicalerts.cap.PointOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_ == null ?
            com.google.publicalerts.cap.Point.getDefaultInstance() : point_;
      }
    }
    /**
     * <code>required .publicalerts.cap.Point point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.publicalerts.cap.Point, com.google.publicalerts.cap.Point.Builder, com.google.publicalerts.cap.PointOrBuilder>(
                getPoint(),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }

    private double radius_ ;
    /**
     * <pre>
     * Radius is expressed in kilometers.
     * </pre>
     *
     * <code>required double radius = 2;</code>
     * @return Whether the radius field is set.
     */
    @java.lang.Override
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Radius is expressed in kilometers.
     * </pre>
     *
     * <code>required double radius = 2;</code>
     * @return The radius.
     */
    @java.lang.Override
    public double getRadius() {
      return radius_;
    }
    /**
     * <pre>
     * Radius is expressed in kilometers.
     * </pre>
     *
     * <code>required double radius = 2;</code>
     * @param value The radius to set.
     * @return This builder for chaining.
     */
    public Builder setRadius(double value) {

      radius_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Radius is expressed in kilometers.
     * </pre>
     *
     * <code>required double radius = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRadius() {
      bitField0_ = (bitField0_ & ~0x00000002);
      radius_ = 0D;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:publicalerts.cap.Circle)
  }

  // @@protoc_insertion_point(class_scope:publicalerts.cap.Circle)
  private static final com.google.publicalerts.cap.Circle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.publicalerts.cap.Circle();
  }

  public static com.google.publicalerts.cap.Circle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Circle>
      PARSER = new com.google.protobuf.AbstractParser<Circle>() {
    @java.lang.Override
    public Circle parsePartialFrom(
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

  public static com.google.protobuf.Parser<Circle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Circle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.publicalerts.cap.Circle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

