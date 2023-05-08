// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: animal.proto

package slaughterHouse.grpc.protobuf.animals;

/**
 * Protobuf type {@code AnimalListProto}
 */
public  final class AnimalListProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalListProto)
    AnimalListProtoOrBuilder {
  // Use AnimalListProto.newBuilder() to construct.
  private AnimalListProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalListProto() {
    allAnimals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AnimalListProto(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              allAnimals_ = new java.util.ArrayList<slaughterHouse.grpc.protobuf.animals.AnimalProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            allAnimals_.add(
                input.readMessage(slaughterHouse.grpc.protobuf.animals.AnimalProto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        allAnimals_ = java.util.Collections.unmodifiableList(allAnimals_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalListProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalListProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            slaughterHouse.grpc.protobuf.animals.AnimalListProto.class, slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder.class);
  }

  public static final int ALLANIMALS_FIELD_NUMBER = 1;
  private java.util.List<slaughterHouse.grpc.protobuf.animals.AnimalProto> allAnimals_;
  /**
   * <code>repeated .AnimalProto allAnimals = 1;</code>
   */
  public java.util.List<slaughterHouse.grpc.protobuf.animals.AnimalProto> getAllAnimalsList() {
    return allAnimals_;
  }
  /**
   * <code>repeated .AnimalProto allAnimals = 1;</code>
   */
  public java.util.List<? extends slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder> 
      getAllAnimalsOrBuilderList() {
    return allAnimals_;
  }
  /**
   * <code>repeated .AnimalProto allAnimals = 1;</code>
   */
  public int getAllAnimalsCount() {
    return allAnimals_.size();
  }
  /**
   * <code>repeated .AnimalProto allAnimals = 1;</code>
   */
  public slaughterHouse.grpc.protobuf.animals.AnimalProto getAllAnimals(int index) {
    return allAnimals_.get(index);
  }
  /**
   * <code>repeated .AnimalProto allAnimals = 1;</code>
   */
  public slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder getAllAnimalsOrBuilder(
      int index) {
    return allAnimals_.get(index);
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
    for (int i = 0; i < allAnimals_.size(); i++) {
      output.writeMessage(1, allAnimals_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < allAnimals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, allAnimals_.get(i));
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
    if (!(obj instanceof slaughterHouse.grpc.protobuf.animals.AnimalListProto)) {
      return super.equals(obj);
    }
    slaughterHouse.grpc.protobuf.animals.AnimalListProto other = (slaughterHouse.grpc.protobuf.animals.AnimalListProto) obj;

    boolean result = true;
    result = result && getAllAnimalsList()
        .equals(other.getAllAnimalsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getAllAnimalsCount() > 0) {
      hash = (37 * hash) + ALLANIMALS_FIELD_NUMBER;
      hash = (53 * hash) + getAllAnimalsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto parseFrom(
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
  public static Builder newBuilder(slaughterHouse.grpc.protobuf.animals.AnimalListProto prototype) {
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
   * Protobuf type {@code AnimalListProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalListProto)
      slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalListProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalListProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              slaughterHouse.grpc.protobuf.animals.AnimalListProto.class, slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder.class);
    }

    // Construct using slaughterHouse.grpc.protobuf.animals.AnimalListProto.newBuilder()
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
        getAllAnimalsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (allAnimalsBuilder_ == null) {
        allAnimals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        allAnimalsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return slaughterHouse.grpc.protobuf.animals.Animal.internal_static_AnimalListProto_descriptor;
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalListProto getDefaultInstanceForType() {
      return slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance();
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalListProto build() {
      slaughterHouse.grpc.protobuf.animals.AnimalListProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public slaughterHouse.grpc.protobuf.animals.AnimalListProto buildPartial() {
      slaughterHouse.grpc.protobuf.animals.AnimalListProto result = new slaughterHouse.grpc.protobuf.animals.AnimalListProto(this);
      int from_bitField0_ = bitField0_;
      if (allAnimalsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          allAnimals_ = java.util.Collections.unmodifiableList(allAnimals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.allAnimals_ = allAnimals_;
      } else {
        result.allAnimals_ = allAnimalsBuilder_.build();
      }
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
      if (other instanceof slaughterHouse.grpc.protobuf.animals.AnimalListProto) {
        return mergeFrom((slaughterHouse.grpc.protobuf.animals.AnimalListProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(slaughterHouse.grpc.protobuf.animals.AnimalListProto other) {
      if (other == slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()) return this;
      if (allAnimalsBuilder_ == null) {
        if (!other.allAnimals_.isEmpty()) {
          if (allAnimals_.isEmpty()) {
            allAnimals_ = other.allAnimals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAllAnimalsIsMutable();
            allAnimals_.addAll(other.allAnimals_);
          }
          onChanged();
        }
      } else {
        if (!other.allAnimals_.isEmpty()) {
          if (allAnimalsBuilder_.isEmpty()) {
            allAnimalsBuilder_.dispose();
            allAnimalsBuilder_ = null;
            allAnimals_ = other.allAnimals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            allAnimalsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllAnimalsFieldBuilder() : null;
          } else {
            allAnimalsBuilder_.addAllMessages(other.allAnimals_);
          }
        }
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
      slaughterHouse.grpc.protobuf.animals.AnimalListProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (slaughterHouse.grpc.protobuf.animals.AnimalListProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<slaughterHouse.grpc.protobuf.animals.AnimalProto> allAnimals_ =
      java.util.Collections.emptyList();
    private void ensureAllAnimalsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        allAnimals_ = new java.util.ArrayList<slaughterHouse.grpc.protobuf.animals.AnimalProto>(allAnimals_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        slaughterHouse.grpc.protobuf.animals.AnimalProto, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder> allAnimalsBuilder_;

    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public java.util.List<slaughterHouse.grpc.protobuf.animals.AnimalProto> getAllAnimalsList() {
      if (allAnimalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allAnimals_);
      } else {
        return allAnimalsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public int getAllAnimalsCount() {
      if (allAnimalsBuilder_ == null) {
        return allAnimals_.size();
      } else {
        return allAnimalsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProto getAllAnimals(int index) {
      if (allAnimalsBuilder_ == null) {
        return allAnimals_.get(index);
      } else {
        return allAnimalsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder setAllAnimals(
        int index, slaughterHouse.grpc.protobuf.animals.AnimalProto value) {
      if (allAnimalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllAnimalsIsMutable();
        allAnimals_.set(index, value);
        onChanged();
      } else {
        allAnimalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder setAllAnimals(
        int index, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder builderForValue) {
      if (allAnimalsBuilder_ == null) {
        ensureAllAnimalsIsMutable();
        allAnimals_.set(index, builderForValue.build());
        onChanged();
      } else {
        allAnimalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder addAllAnimals(slaughterHouse.grpc.protobuf.animals.AnimalProto value) {
      if (allAnimalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllAnimalsIsMutable();
        allAnimals_.add(value);
        onChanged();
      } else {
        allAnimalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder addAllAnimals(
        int index, slaughterHouse.grpc.protobuf.animals.AnimalProto value) {
      if (allAnimalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllAnimalsIsMutable();
        allAnimals_.add(index, value);
        onChanged();
      } else {
        allAnimalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder addAllAnimals(
        slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder builderForValue) {
      if (allAnimalsBuilder_ == null) {
        ensureAllAnimalsIsMutable();
        allAnimals_.add(builderForValue.build());
        onChanged();
      } else {
        allAnimalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder addAllAnimals(
        int index, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder builderForValue) {
      if (allAnimalsBuilder_ == null) {
        ensureAllAnimalsIsMutable();
        allAnimals_.add(index, builderForValue.build());
        onChanged();
      } else {
        allAnimalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder addAllAllAnimals(
        java.lang.Iterable<? extends slaughterHouse.grpc.protobuf.animals.AnimalProto> values) {
      if (allAnimalsBuilder_ == null) {
        ensureAllAnimalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allAnimals_);
        onChanged();
      } else {
        allAnimalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder clearAllAnimals() {
      if (allAnimalsBuilder_ == null) {
        allAnimals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        allAnimalsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public Builder removeAllAnimals(int index) {
      if (allAnimalsBuilder_ == null) {
        ensureAllAnimalsIsMutable();
        allAnimals_.remove(index);
        onChanged();
      } else {
        allAnimalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder getAllAnimalsBuilder(
        int index) {
      return getAllAnimalsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder getAllAnimalsOrBuilder(
        int index) {
      if (allAnimalsBuilder_ == null) {
        return allAnimals_.get(index);  } else {
        return allAnimalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public java.util.List<? extends slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder> 
         getAllAnimalsOrBuilderList() {
      if (allAnimalsBuilder_ != null) {
        return allAnimalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allAnimals_);
      }
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder addAllAnimalsBuilder() {
      return getAllAnimalsFieldBuilder().addBuilder(
          slaughterHouse.grpc.protobuf.animals.AnimalProto.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder addAllAnimalsBuilder(
        int index) {
      return getAllAnimalsFieldBuilder().addBuilder(
          index, slaughterHouse.grpc.protobuf.animals.AnimalProto.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalProto allAnimals = 1;</code>
     */
    public java.util.List<slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder> 
         getAllAnimalsBuilderList() {
      return getAllAnimalsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        slaughterHouse.grpc.protobuf.animals.AnimalProto, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder> 
        getAllAnimalsFieldBuilder() {
      if (allAnimalsBuilder_ == null) {
        allAnimalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            slaughterHouse.grpc.protobuf.animals.AnimalProto, slaughterHouse.grpc.protobuf.animals.AnimalProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalProtoOrBuilder>(
                allAnimals_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        allAnimals_ = null;
      }
      return allAnimalsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:AnimalListProto)
  }

  // @@protoc_insertion_point(class_scope:AnimalListProto)
  private static final slaughterHouse.grpc.protobuf.animals.AnimalListProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new slaughterHouse.grpc.protobuf.animals.AnimalListProto();
  }

  public static slaughterHouse.grpc.protobuf.animals.AnimalListProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalListProto>
      PARSER = new com.google.protobuf.AbstractParser<AnimalListProto>() {
    public AnimalListProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnimalListProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalListProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalListProto> getParserForType() {
    return PARSER;
  }

  public slaughterHouse.grpc.protobuf.animals.AnimalListProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

