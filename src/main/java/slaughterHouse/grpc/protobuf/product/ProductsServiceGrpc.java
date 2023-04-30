package slaughterHouse.grpc.protobuf.product;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: products.proto")
public class ProductsServiceGrpc {

  private ProductsServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.product.ProductProto,
      slaughterHouse.grpc.protobuf.product.ProductProto> METHOD_CREATE_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "createProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      slaughterHouse.grpc.protobuf.product.ProductProto> METHOD_FIND_PRODUCT_BY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "findProductById"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      slaughterHouse.grpc.protobuf.product.ProductListProto> METHOD_FIND_ALL_PRODUCTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "findAllProducts"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      slaughterHouse.grpc.protobuf.product.ProductListProto> METHOD_FIND_PRODUCTS_BY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "findProductsByType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      slaughterHouse.grpc.protobuf.animals.AnimalListProto> METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "findAnimalsInvolvedInProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> METHOD_DELETE_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "deleteProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.BoolValue.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      slaughterHouse.grpc.protobuf.product.ProductProto> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductsService", "updateProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.product.ProductProto.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductsServiceStub newStub(io.grpc.Channel channel) {
    return new ProductsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(slaughterHouse.grpc.protobuf.product.ProductProto request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void findProductById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_PRODUCT_BY_ID, responseObserver);
    }

    /**
     */
    public void findAllProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_PRODUCTS, responseObserver);
    }

    /**
     */
    public void findProductsByType(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_PRODUCTS_BY_TYPE, responseObserver);
    }

    /**
     */
    public void findAnimalsInvolvedInProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PRODUCT, responseObserver);
    }

    /**
     */
    public void updateProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.product.ProductProto,
                slaughterHouse.grpc.protobuf.product.ProductProto>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            METHOD_FIND_PRODUCT_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                slaughterHouse.grpc.protobuf.product.ProductProto>(
                  this, METHODID_FIND_PRODUCT_BY_ID)))
          .addMethod(
            METHOD_FIND_ALL_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                slaughterHouse.grpc.protobuf.product.ProductListProto>(
                  this, METHODID_FIND_ALL_PRODUCTS)))
          .addMethod(
            METHOD_FIND_PRODUCTS_BY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                slaughterHouse.grpc.protobuf.product.ProductListProto>(
                  this, METHODID_FIND_PRODUCTS_BY_TYPE)))
          .addMethod(
            METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                slaughterHouse.grpc.protobuf.animals.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_INVOLVED_IN_PRODUCT)))
          .addMethod(
            METHOD_DELETE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.google.protobuf.BoolValue>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                slaughterHouse.grpc.protobuf.product.ProductProto>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductsServiceStub extends io.grpc.stub.AbstractStub<ProductsServiceStub> {
    private ProductsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(slaughterHouse.grpc.protobuf.product.ProductProto request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findProductById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_PRODUCT_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_PRODUCTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findProductsByType(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_PRODUCTS_BY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsInvolvedInProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductsServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductsServiceBlockingStub> {
    private ProductsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.product.ProductProto createProduct(slaughterHouse.grpc.protobuf.product.ProductProto request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.product.ProductProto findProductById(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_PRODUCT_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.product.ProductListProto findAllProducts(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.product.ProductListProto findProductsByType(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_PRODUCTS_BY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto findAnimalsInvolvedInProduct(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue deleteProduct(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.product.ProductProto updateProduct(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductsServiceFutureStub extends io.grpc.stub.AbstractStub<ProductsServiceFutureStub> {
    private ProductsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.product.ProductProto> createProduct(
        slaughterHouse.grpc.protobuf.product.ProductProto request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.product.ProductProto> findProductById(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_PRODUCT_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.product.ProductListProto> findAllProducts(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_PRODUCTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.product.ProductListProto> findProductsByType(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_PRODUCTS_BY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalListProto> findAnimalsInvolvedInProduct(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> deleteProduct(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.product.ProductProto> updateProduct(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_FIND_PRODUCT_BY_ID = 1;
  private static final int METHODID_FIND_ALL_PRODUCTS = 2;
  private static final int METHODID_FIND_PRODUCTS_BY_TYPE = 3;
  private static final int METHODID_FIND_ANIMALS_INVOLVED_IN_PRODUCT = 4;
  private static final int METHODID_DELETE_PRODUCT = 5;
  private static final int METHODID_UPDATE_PRODUCT = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductsServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ProductsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((slaughterHouse.grpc.protobuf.product.ProductProto) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto>) responseObserver);
          break;
        case METHODID_FIND_PRODUCT_BY_ID:
          serviceImpl.findProductById((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto>) responseObserver);
          break;
        case METHODID_FIND_ALL_PRODUCTS:
          serviceImpl.findAllProducts((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto>) responseObserver);
          break;
        case METHODID_FIND_PRODUCTS_BY_TYPE:
          serviceImpl.findProductsByType((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_INVOLVED_IN_PRODUCT:
          serviceImpl.findAnimalsInvolvedInProduct((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.product.ProductProto>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_PRODUCT,
        METHOD_FIND_PRODUCT_BY_ID,
        METHOD_FIND_ALL_PRODUCTS,
        METHOD_FIND_PRODUCTS_BY_TYPE,
        METHOD_FIND_ANIMALS_INVOLVED_IN_PRODUCT,
        METHOD_DELETE_PRODUCT,
        METHOD_UPDATE_PRODUCT);
  }

}
