// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: animal.proto

package slaughterHouse.grpc.protobuf.animals;

/**
 * Protobuf type {@code AnimalProto}
 */
public  final class AnimalProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalProto)
    AnimalProtoOrBuilder {
  // Use AnimalProto.newBuilder() to construct.
  private AnimalProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalProto() {
    registrationNumber_ = 0L;
    weight_ = 0;
    arrivalDate_ = "";
    origin_ = "";
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AnimalProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            registrationNumber_ = input.readInt64();
            break;
          }
          case 16: {

            weight_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            arrivalDate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            origin_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            slaughterHouse.grpc.protobuf.animals.AnimalProto.class, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder.class);
  }

  public static final int REGISTRATIONNUMBER_FIELD_NUMBER = 1;
  private long registrationNumber_;
  /**
   * <code>optional int64 registrationNumber = 1;</code>
   */
  public long getRegistrationNumber() {
    return registrationNumber_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private int weight_;
  /**
   * <code>optional int32 weight = 2;</code>
   */
  public int getWeight() {
    return weight_;
  }

  public static final int ARRIVALDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object arrivalDate_;
  /**
   * <code>optional string arrivalDate = 3;</code>
   */
  public java.lang.String getArrivalDate() {
    java.lang.Object ref = arrivalDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arrivalDate_ = s;
      return s;
    }
  }
  /**
   * <code>optional string arrivalDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getArrivalDateBytes() {
    java.lang.Object ref = arrivalDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arrivalDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIGIN_FIELD_NUMBER = 4;
  private volatile java.lang.Object origin_;
  /**
   * <code>optional string origin = 4;</code>
   */
  public java.lang.String getOrigin() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      origin_ = s;
      return s;
    }
  }
  /**
   * <code>optional string origin = 4;</code>
   */
  public com.google.protobuf.ByteString
      getOriginBytes() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      origin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object type_;
  /**
   * <code>optional string type = 5;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>optional string type = 5;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (registrationNumber_ != 0L) {
      output.writeInt64(1, registrationNumber_);
    }
    if (weight_ != 0) {
      output.writeInt32(2, weight_);
    }
    if (!getArrivalDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, arrivalDate_);
    }
    if (!getOriginBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, origin_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, type_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (registrationNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, registrationNumber_);
    }
    if (weight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, weight_);
    }
    if (!getArrivalDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, arrivalDate_);
    }
    if (!getOriginBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, origin_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, type_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof slaughterHouse.grpc.protobuf.animals.AnimalProto)) {
      return super.equals(obj);
    }
    slaughterHouse.grpc.protobuf.animals.AnimalProto other = (slaughterHouse.grpc.protobuf.animals.AnimalProto) obj;

    boolean result = true;
    result = result && (getRegistrationNumber()
        == other.getRegistrationNumber());
    result = result && (getWeight()
        == other.getWeight());
    result = result && getArrivalDate()
        .equals(other.getArrivalDate());
    result = result && getOrigin()
        .equals(other.getOrigin());
    result = result && getType()
        .equals(other.getType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + REGISTRATIONNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegistrationNumber());
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight();
    hash = (37 * hash) + ARRIVALDATE_FIELD_NUMBER;
    hash = (53 * hash) + getArrivalDate().hashCode();
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigin().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(slaughterHouse.grpc.protobuf.animals.AnimalProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AnimalProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalProto)
      slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              slaughterHouse.grpc.protobuf.animals.AnimalProto.class, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder.class);
    }

    // Construct using slaughterHouse.grpc.protobuf.animals.AnimalProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      registrationNumber_ = 0L;

      weight_ = 0;

      arrivalDate_ = "";

      origin_ = "";

      type_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalProto_descriptor;
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalProto getDefaultInstanceForType() {
      return slaughterHouse.grpc.protobuf.animals.AnimalProto.getDefaultInstance();
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalProto build() {
      slaughterHouse.grpc.protobuf.animals.AnimalProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalProto buildPartial() {
      slaughterHouse.grpc.protobuf.animals.AnimalProto result = new slaughterHouse.grpc.protobuf.animals.AnimalProto(this);
      result.registrationNumber_ = registrationNumber_;
      result.weight_ = weight_;
      result.arrivalDate_ = arrivalDate_;
      result.origin_ = origin_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof slaughterHouse.grpc.protobuf.animals.AnimalProto) {
        return mergeFrom((slaughterHouse.grpc.protobuf.animals.AnimalProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(slaughterHouse.grpc.protobuf.animals.AnimalProto other) {
      if (other == slaughterHouse.grpc.protobuf.animals.AnimalProto.getDefaultInstance()) return this;
      if (other.getRegistrationNumber() != 0L) {
        setRegistrationNumber(other.getRegistrationNumber());
      }
      if (other.getWeight() != 0) {
        setWeight(other.getWeight());
      }
      if (!other.getArrivalDate().isEmpty()) {
        arrivalDate_ = other.arrivalDate_;
        onChanged();
      }
      if (!other.getOrigin().isEmpty()) {
        origin_ = other.origin_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      slaughterHouse.grpc.protobuf.animals.AnimalProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (slaughterHouse.grpc.protobuf.animals.AnimalProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long registrationNumber_ ;
    /**
     * <code>optional int64 registrationNumber = 1;</code>
     */
    public long getRegistrationNumber() {
      return registrationNumber_;
    }
    /**
     * <code>optional int64 registrationNumber = 1;</code>
     */
    public Builder setRegistrationNumber(long value) {
      
      registrationNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 registrationNumber = 1;</code>
     */
    public Builder clearRegistrationNumber() {
      
      registrationNumber_ = 0L;
      onChanged();
      return this;
    }

    private int weight_ ;
    /**
     * <code>optional int32 weight = 2;</code>
     */
    public int getWeight() {
      return weight_;
    }
    /**
     * <code>optional int32 weight = 2;</code>
     */
    public Builder setWeight(int value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 weight = 2;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object arrivalDate_ = "";
    /**
     * <code>optional string arrivalDate = 3;</code>
     */
    public java.lang.String getArrivalDate() {
      java.lang.Object ref = arrivalDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arrivalDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string arrivalDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getArrivalDateBytes() {
      java.lang.Object ref = arrivalDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arrivalDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string arrivalDate = 3;</code>
     */
    public Builder setArrivalDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      arrivalDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string arrivalDate = 3;</code>
     */
    public Builder clearArrivalDate() {
      
      arrivalDate_ = getDefaultInstance().getArrivalDate();
      onChanged();
      return this;
    }
    /**
     * <code>optional string arrivalDate = 3;</code>
     */
    public Builder setArrivalDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      arrivalDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object origin_ = "";
    /**
     * <code>optional string origin = 4;</code>
     */
    public java.lang.String getOrigin() {
      java.lang.Object ref = origin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        origin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string origin = 4;</code>
     */
    public com.google.protobuf.ByteString
        getOriginBytes() {
      java.lang.Object ref = origin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        origin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string origin = 4;</code>
     */
    public Builder setOrigin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      origin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string origin = 4;</code>
     */
    public Builder clearOrigin() {
      
      origin_ = getDefaultInstance().getOrigin();
      onChanged();
      return this;
    }
    /**
     * <code>optional string origin = 4;</code>
     */
    public Builder setOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      origin_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>optional string type = 5;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string type = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string type = 5;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string type = 5;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string type = 5;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:AnimalProto)
  }

  // @@protoc_insertion_point(class_scope:AnimalProto)
  private static final slaughterHouse.grpc.protobuf.animals.AnimalProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new slaughterHouse.grpc.protobuf.animals.AnimalProto();
  }

  public static slaughterHouse.grpc.protobuf.animals.AnimalProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalProto>
      PARSER = new com.google.protobuf.AbstractParser<AnimalProto>() {
    public AnimalProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnimalProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalProto> getParserForType() {
    return PARSER;
  }

  public slaughterHouse.grpc.protobuf.animals.AnimalProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

