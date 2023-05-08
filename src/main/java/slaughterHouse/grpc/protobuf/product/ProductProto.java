// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products.proto

package slaughterHouse.grpc.protobuf.product;

/**
 * Protobuf type {@code ProductProto}
 */
public  final class ProductProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProductProto)
    ProductProtoOrBuilder {
  // Use ProductProto.newBuilder() to construct.
  private ProductProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductProto() {
    productId_ = 0L;
    productWeight_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductProto(
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

            productId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (productType_ != null) {
              subBuilder = productType_.toBuilder();
            }
            productType_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(productType_);
              productType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            productWeight_ = input.readInt32();
            break;
          }
          case 34: {
            slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder subBuilder = null;
            if (involvedAnimals_ != null) {
              subBuilder = involvedAnimals_.toBuilder();
            }
            involvedAnimals_ = input.readMessage(slaughterHouse.grpc.protobuf.animals.AnimalListProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(involvedAnimals_);
              involvedAnimals_ = subBuilder.buildPartial();
            }

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
    return slaughterHouse.grpc.protobuf.product.Products.internal_static_ProductProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return slaughterHouse.grpc.protobuf.product.Products.internal_static_ProductProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            slaughterHouse.grpc.protobuf.product.ProductProto.class, slaughterHouse.grpc.protobuf.product.ProductProto.Builder.class);
  }

  public static final int PRODUCTID_FIELD_NUMBER = 1;
  private long productId_;
  /**
   * <code>optional int64 productId = 1;</code>
   */
  public long getProductId() {
    return productId_;
  }

  public static final int PRODUCTTYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue productType_;
  /**
   * <code>optional .google.protobuf.StringValue productType = 2;</code>
   */
  public boolean hasProductType() {
    return productType_ != null;
  }
  /**
   * <code>optional .google.protobuf.StringValue productType = 2;</code>
   */
  public com.google.protobuf.StringValue getProductType() {
    return productType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : productType_;
  }
  /**
   * <code>optional .google.protobuf.StringValue productType = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getProductTypeOrBuilder() {
    return getProductType();
  }

  public static final int PRODUCTWEIGHT_FIELD_NUMBER = 3;
  private int productWeight_;
  /**
   * <code>optional int32 productWeight = 3;</code>
   */
  public int getProductWeight() {
    return productWeight_;
  }

  public static final int INVOLVEDANIMALS_FIELD_NUMBER = 4;
  private slaughterHouse.grpc.protobuf.animals.AnimalListProto involvedAnimals_;
  /**
   * <code>optional .AnimalListProto involvedAnimals = 4;</code>
   */
  public boolean hasInvolvedAnimals() {
    return involvedAnimals_ != null;
  }
  /**
   * <code>optional .AnimalListProto involvedAnimals = 4;</code>
   */
  public slaughterHouse.grpc.protobuf.animals.AnimalListProto getInvolvedAnimals() {
    return involvedAnimals_ == null ? slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance() : involvedAnimals_;
  }
  /**
   * <code>optional .AnimalListProto involvedAnimals = 4;</code>
   */
  public slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder getInvolvedAnimalsOrBuilder() {
    return getInvolvedAnimals();
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
    if (productId_ != 0L) {
      output.writeInt64(1, productId_);
    }
    if (productType_ != null) {
      output.writeMessage(2, getProductType());
    }
    if (productWeight_ != 0) {
      output.writeInt32(3, productWeight_);
    }
    if (involvedAnimals_ != null) {
      output.writeMessage(4, getInvolvedAnimals());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, productId_);
    }
    if (productType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProductType());
    }
    if (productWeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, productWeight_);
    }
    if (involvedAnimals_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getInvolvedAnimals());
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
    if (!(obj instanceof slaughterHouse.grpc.protobuf.product.ProductProto)) {
      return super.equals(obj);
    }
    slaughterHouse.grpc.protobuf.product.ProductProto other = (slaughterHouse.grpc.protobuf.product.ProductProto) obj;

    boolean result = true;
    result = result && (getProductId()
        == other.getProductId());
    result = result && (hasProductType() == other.hasProductType());
    if (hasProductType()) {
      result = result && getProductType()
          .equals(other.getProductType());
    }
    result = result && (getProductWeight()
        == other.getProductWeight());
    result = result && (hasInvolvedAnimals() == other.hasInvolvedAnimals());
    if (hasInvolvedAnimals()) {
      result = result && getInvolvedAnimals()
          .equals(other.getInvolvedAnimals());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProductId());
    if (hasProductType()) {
      hash = (37 * hash) + PRODUCTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getProductType().hashCode();
    }
    hash = (37 * hash) + PRODUCTWEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getProductWeight();
    if (hasInvolvedAnimals()) {
      hash = (37 * hash) + INVOLVEDANIMALS_FIELD_NUMBER;
      hash = (53 * hash) + getInvolvedAnimals().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static slaughterHouse.grpc.protobuf.product.ProductProto parseFrom(
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
  public static Builder newBuilder(slaughterHouse.grpc.protobuf.product.ProductProto prototype) {
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
   * Protobuf type {@code ProductProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProductProto)
      slaughterHouse.grpc.protobuf.product.ProductProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slaughterHouse.grpc.protobuf.product.Products.internal_static_ProductProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slaughterHouse.grpc.protobuf.product.Products.internal_static_ProductProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              slaughterHouse.grpc.protobuf.product.ProductProto.class, slaughterHouse.grpc.protobuf.product.ProductProto.Builder.class);
    }

    // Construct using slaughterHouse.grpc.protobuf.product.ProductProto.newBuilder()
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
      productId_ = 0L;

      if (productTypeBuilder_ == null) {
        productType_ = null;
      } else {
        productType_ = null;
        productTypeBuilder_ = null;
      }
      productWeight_ = 0;

      if (involvedAnimalsBuilder_ == null) {
        involvedAnimals_ = null;
      } else {
        involvedAnimals_ = null;
        involvedAnimalsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return slaughterHouse.grpc.protobuf.product.Products.internal_static_ProductProto_descriptor;
    }

    public slaughterHouse.grpc.protobuf.product.ProductProto getDefaultInstanceForType() {
      return slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance();
    }

    public slaughterHouse.grpc.protobuf.product.ProductProto build() {
      slaughterHouse.grpc.protobuf.product.ProductProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public slaughterHouse.grpc.protobuf.product.ProductProto buildPartial() {
      slaughterHouse.grpc.protobuf.product.ProductProto result = new slaughterHouse.grpc.protobuf.product.ProductProto(this);
      result.productId_ = productId_;
      if (productTypeBuilder_ == null) {
        result.productType_ = productType_;
      } else {
        result.productType_ = productTypeBuilder_.build();
      }
      result.productWeight_ = productWeight_;
      if (involvedAnimalsBuilder_ == null) {
        result.involvedAnimals_ = involvedAnimals_;
      } else {
        result.involvedAnimals_ = involvedAnimalsBuilder_.build();
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
      if (other instanceof slaughterHouse.grpc.protobuf.product.ProductProto) {
        return mergeFrom((slaughterHouse.grpc.protobuf.product.ProductProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(slaughterHouse.grpc.protobuf.product.ProductProto other) {
      if (other == slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance()) return this;
      if (other.getProductId() != 0L) {
        setProductId(other.getProductId());
      }
      if (other.hasProductType()) {
        mergeProductType(other.getProductType());
      }
      if (other.getProductWeight() != 0) {
        setProductWeight(other.getProductWeight());
      }
      if (other.hasInvolvedAnimals()) {
        mergeInvolvedAnimals(other.getInvolvedAnimals());
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
      slaughterHouse.grpc.protobuf.product.ProductProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (slaughterHouse.grpc.protobuf.product.ProductProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long productId_ ;
    /**
     * <code>optional int64 productId = 1;</code>
     */
    public long getProductId() {
      return productId_;
    }
    /**
     * <code>optional int64 productId = 1;</code>
     */
    public Builder setProductId(long value) {
      
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 productId = 1;</code>
     */
    public Builder clearProductId() {
      
      productId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue productType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> productTypeBuilder_;
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public boolean hasProductType() {
      return productTypeBuilder_ != null || productType_ != null;
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public com.google.protobuf.StringValue getProductType() {
      if (productTypeBuilder_ == null) {
        return productType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : productType_;
      } else {
        return productTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public Builder setProductType(com.google.protobuf.StringValue value) {
      if (productTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productType_ = value;
        onChanged();
      } else {
        productTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public Builder setProductType(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (productTypeBuilder_ == null) {
        productType_ = builderForValue.build();
        onChanged();
      } else {
        productTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public Builder mergeProductType(com.google.protobuf.StringValue value) {
      if (productTypeBuilder_ == null) {
        if (productType_ != null) {
          productType_ =
            com.google.protobuf.StringValue.newBuilder(productType_).mergeFrom(value).buildPartial();
        } else {
          productType_ = value;
        }
        onChanged();
      } else {
        productTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public Builder clearProductType() {
      if (productTypeBuilder_ == null) {
        productType_ = null;
        onChanged();
      } else {
        productType_ = null;
        productTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getProductTypeBuilder() {
      
      onChanged();
      return getProductTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getProductTypeOrBuilder() {
      if (productTypeBuilder_ != null) {
        return productTypeBuilder_.getMessageOrBuilder();
      } else {
        return productType_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : productType_;
      }
    }
    /**
     * <code>optional .google.protobuf.StringValue productType = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getProductTypeFieldBuilder() {
      if (productTypeBuilder_ == null) {
        productTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getProductType(),
                getParentForChildren(),
                isClean());
        productType_ = null;
      }
      return productTypeBuilder_;
    }

    private int productWeight_ ;
    /**
     * <code>optional int32 productWeight = 3;</code>
     */
    public int getProductWeight() {
      return productWeight_;
    }
    /**
     * <code>optional int32 productWeight = 3;</code>
     */
    public Builder setProductWeight(int value) {
      
      productWeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 productWeight = 3;</code>
     */
    public Builder clearProductWeight() {
      
      productWeight_ = 0;
      onChanged();
      return this;
    }

    private slaughterHouse.grpc.protobuf.animals.AnimalListProto involvedAnimals_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        slaughterHouse.grpc.protobuf.animals.AnimalListProto, slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder> involvedAnimalsBuilder_;
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public boolean hasInvolvedAnimals() {
      return involvedAnimalsBuilder_ != null || involvedAnimals_ != null;
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto getInvolvedAnimals() {
      if (involvedAnimalsBuilder_ == null) {
        return involvedAnimals_ == null ? slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance() : involvedAnimals_;
      } else {
        return involvedAnimalsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public Builder setInvolvedAnimals(slaughterHouse.grpc.protobuf.animals.AnimalListProto value) {
      if (involvedAnimalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        involvedAnimals_ = value;
        onChanged();
      } else {
        involvedAnimalsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public Builder setInvolvedAnimals(
        slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder builderForValue) {
      if (involvedAnimalsBuilder_ == null) {
        involvedAnimals_ = builderForValue.build();
        onChanged();
      } else {
        involvedAnimalsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public Builder mergeInvolvedAnimals(slaughterHouse.grpc.protobuf.animals.AnimalListProto value) {
      if (involvedAnimalsBuilder_ == null) {
        if (involvedAnimals_ != null) {
          involvedAnimals_ =
            slaughterHouse.grpc.protobuf.animals.AnimalListProto.newBuilder(involvedAnimals_).mergeFrom(value).buildPartial();
        } else {
          involvedAnimals_ = value;
        }
        onChanged();
      } else {
        involvedAnimalsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public Builder clearInvolvedAnimals() {
      if (involvedAnimalsBuilder_ == null) {
        involvedAnimals_ = null;
        onChanged();
      } else {
        involvedAnimals_ = null;
        involvedAnimalsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder getInvolvedAnimalsBuilder() {
      
      onChanged();
      return getInvolvedAnimalsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder getInvolvedAnimalsOrBuilder() {
      if (involvedAnimalsBuilder_ != null) {
        return involvedAnimalsBuilder_.getMessageOrBuilder();
      } else {
        return involvedAnimals_ == null ?
            slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance() : involvedAnimals_;
      }
    }
    /**
     * <code>optional .AnimalListProto involvedAnimals = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        slaughterHouse.grpc.protobuf.animals.AnimalListProto, slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder> 
        getInvolvedAnimalsFieldBuilder() {
      if (involvedAnimalsBuilder_ == null) {
        involvedAnimalsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            slaughterHouse.grpc.protobuf.animals.AnimalListProto, slaughterHouse.grpc.protobuf.animals.AnimalListProto.Builder, slaughterHouse.grpc.protobuf.animals.AnimalListProtoOrBuilder>(
                getInvolvedAnimals(),
                getParentForChildren(),
                isClean());
        involvedAnimals_ = null;
      }
      return involvedAnimalsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ProductProto)
  }

  // @@protoc_insertion_point(class_scope:ProductProto)
  private static final slaughterHouse.grpc.protobuf.product.ProductProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new slaughterHouse.grpc.protobuf.product.ProductProto();
  }

  public static slaughterHouse.grpc.protobuf.product.ProductProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductProto>
      PARSER = new com.google.protobuf.AbstractParser<ProductProto>() {
    public ProductProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductProto> getParserForType() {
    return PARSER;
  }

  public slaughterHouse.grpc.protobuf.product.ProductProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

