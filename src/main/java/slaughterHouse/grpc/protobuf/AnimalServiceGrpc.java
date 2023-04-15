package slaughterHouse.grpc.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: animal.proto")
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.id,
      slaughterHouse.grpc.protobuf.AnimalProto> getFindAnimalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAnimalById",
      requestType = slaughterHouse.grpc.protobuf.id.class,
      responseType = slaughterHouse.grpc.protobuf.AnimalProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.id,
      slaughterHouse.grpc.protobuf.AnimalProto> getFindAnimalByIdMethod() {
    io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.id, slaughterHouse.grpc.protobuf.AnimalProto> getFindAnimalByIdMethod;
    if ((getFindAnimalByIdMethod = AnimalServiceGrpc.getFindAnimalByIdMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getFindAnimalByIdMethod = AnimalServiceGrpc.getFindAnimalByIdMethod) == null) {
          AnimalServiceGrpc.getFindAnimalByIdMethod = getFindAnimalByIdMethod =
              io.grpc.MethodDescriptor.<slaughterHouse.grpc.protobuf.id, slaughterHouse.grpc.protobuf.AnimalProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAnimalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.AnimalProto.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("findAnimalById"))
              .build();
        }
      }
    }
    return getFindAnimalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.empty,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAllAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllAnimals",
      requestType = slaughterHouse.grpc.protobuf.empty.class,
      responseType = slaughterHouse.grpc.protobuf.AnimalListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.empty,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAllAnimalsMethod() {
    io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.empty, slaughterHouse.grpc.protobuf.AnimalListProto> getFindAllAnimalsMethod;
    if ((getFindAllAnimalsMethod = AnimalServiceGrpc.getFindAllAnimalsMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getFindAllAnimalsMethod = AnimalServiceGrpc.getFindAllAnimalsMethod) == null) {
          AnimalServiceGrpc.getFindAllAnimalsMethod = getFindAllAnimalsMethod =
              io.grpc.MethodDescriptor.<slaughterHouse.grpc.protobuf.empty, slaughterHouse.grpc.protobuf.AnimalListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.AnimalListProto.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("findAllAnimals"))
              .build();
        }
      }
    }
    return getFindAllAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.origin,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAnimalsByOrigin",
      requestType = slaughterHouse.grpc.protobuf.origin.class,
      responseType = slaughterHouse.grpc.protobuf.AnimalListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.origin,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByOriginMethod() {
    io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.origin, slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByOriginMethod;
    if ((getFindAnimalsByOriginMethod = AnimalServiceGrpc.getFindAnimalsByOriginMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getFindAnimalsByOriginMethod = AnimalServiceGrpc.getFindAnimalsByOriginMethod) == null) {
          AnimalServiceGrpc.getFindAnimalsByOriginMethod = getFindAnimalsByOriginMethod =
              io.grpc.MethodDescriptor.<slaughterHouse.grpc.protobuf.origin, slaughterHouse.grpc.protobuf.AnimalListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAnimalsByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.origin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.AnimalListProto.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("findAnimalsByOrigin"))
              .build();
        }
      }
    }
    return getFindAnimalsByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.type,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAnimalsByType",
      requestType = slaughterHouse.grpc.protobuf.type.class,
      responseType = slaughterHouse.grpc.protobuf.AnimalListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.type,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByTypeMethod() {
    io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.type, slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByTypeMethod;
    if ((getFindAnimalsByTypeMethod = AnimalServiceGrpc.getFindAnimalsByTypeMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getFindAnimalsByTypeMethod = AnimalServiceGrpc.getFindAnimalsByTypeMethod) == null) {
          AnimalServiceGrpc.getFindAnimalsByTypeMethod = getFindAnimalsByTypeMethod =
              io.grpc.MethodDescriptor.<slaughterHouse.grpc.protobuf.type, slaughterHouse.grpc.protobuf.AnimalListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAnimalsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.type.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.AnimalListProto.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("findAnimalsByType"))
              .build();
        }
      }
    }
    return getFindAnimalsByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.date,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAnimalsByDate",
      requestType = slaughterHouse.grpc.protobuf.date.class,
      responseType = slaughterHouse.grpc.protobuf.AnimalListProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.date,
      slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByDateMethod() {
    io.grpc.MethodDescriptor<slaughterHouse.grpc.protobuf.date, slaughterHouse.grpc.protobuf.AnimalListProto> getFindAnimalsByDateMethod;
    if ((getFindAnimalsByDateMethod = AnimalServiceGrpc.getFindAnimalsByDateMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getFindAnimalsByDateMethod = AnimalServiceGrpc.getFindAnimalsByDateMethod) == null) {
          AnimalServiceGrpc.getFindAnimalsByDateMethod = getFindAnimalsByDateMethod =
              io.grpc.MethodDescriptor.<slaughterHouse.grpc.protobuf.date, slaughterHouse.grpc.protobuf.AnimalListProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAnimalsByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.date.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  slaughterHouse.grpc.protobuf.AnimalListProto.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("findAnimalsByDate"))
              .build();
        }
      }
    }
    return getFindAnimalsByDateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAnimalById(slaughterHouse.grpc.protobuf.id request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAnimalByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllAnimals(slaughterHouse.grpc.protobuf.empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void findAnimalsByOrigin(slaughterHouse.grpc.protobuf.origin request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAnimalsByOriginMethod(), responseObserver);
    }

    /**
     */
    public void findAnimalsByType(slaughterHouse.grpc.protobuf.type request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAnimalsByTypeMethod(), responseObserver);
    }

    /**
     */
    public void findAnimalsByDate(slaughterHouse.grpc.protobuf.date request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAnimalsByDateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAnimalByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.id,
                slaughterHouse.grpc.protobuf.AnimalProto>(
                  this, METHODID_FIND_ANIMAL_BY_ID)))
          .addMethod(
            getFindAllAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.empty,
                slaughterHouse.grpc.protobuf.AnimalListProto>(
                  this, METHODID_FIND_ALL_ANIMALS)))
          .addMethod(
            getFindAnimalsByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.origin,
                slaughterHouse.grpc.protobuf.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_ORIGIN)))
          .addMethod(
            getFindAnimalsByTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.type,
                slaughterHouse.grpc.protobuf.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_TYPE)))
          .addMethod(
            getFindAnimalsByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                slaughterHouse.grpc.protobuf.date,
                slaughterHouse.grpc.protobuf.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_DATE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAnimalById(slaughterHouse.grpc.protobuf.id request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAnimalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimals(slaughterHouse.grpc.protobuf.empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByOrigin(slaughterHouse.grpc.protobuf.origin request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAnimalsByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByType(slaughterHouse.grpc.protobuf.type request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAnimalsByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByDate(slaughterHouse.grpc.protobuf.date request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAnimalsByDateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.AnimalProto findAnimalById(slaughterHouse.grpc.protobuf.id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAnimalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.AnimalListProto findAllAnimals(slaughterHouse.grpc.protobuf.empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.AnimalListProto findAnimalsByOrigin(slaughterHouse.grpc.protobuf.origin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAnimalsByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.AnimalListProto findAnimalsByType(slaughterHouse.grpc.protobuf.type request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAnimalsByTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.AnimalListProto findAnimalsByDate(slaughterHouse.grpc.protobuf.date request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAnimalsByDateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.AnimalProto> findAnimalById(
        slaughterHouse.grpc.protobuf.id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAnimalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.AnimalListProto> findAllAnimals(
        slaughterHouse.grpc.protobuf.empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.AnimalListProto> findAnimalsByOrigin(
        slaughterHouse.grpc.protobuf.origin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAnimalsByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.AnimalListProto> findAnimalsByType(
        slaughterHouse.grpc.protobuf.type request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAnimalsByTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.AnimalListProto> findAnimalsByDate(
        slaughterHouse.grpc.protobuf.date request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAnimalsByDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ANIMAL_BY_ID = 0;
  private static final int METHODID_FIND_ALL_ANIMALS = 1;
  private static final int METHODID_FIND_ANIMALS_BY_ORIGIN = 2;
  private static final int METHODID_FIND_ANIMALS_BY_TYPE = 3;
  private static final int METHODID_FIND_ANIMALS_BY_DATE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ANIMAL_BY_ID:
          serviceImpl.findAnimalById((slaughterHouse.grpc.protobuf.id) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalProto>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMALS:
          serviceImpl.findAllAnimals((slaughterHouse.grpc.protobuf.empty) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_ORIGIN:
          serviceImpl.findAnimalsByOrigin((slaughterHouse.grpc.protobuf.origin) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_TYPE:
          serviceImpl.findAnimalsByType((slaughterHouse.grpc.protobuf.type) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_DATE:
          serviceImpl.findAnimalsByDate((slaughterHouse.grpc.protobuf.date) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.AnimalListProto>) responseObserver);
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

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return slaughterHouse.grpc.protobuf.Animal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getFindAnimalByIdMethod())
              .addMethod(getFindAllAnimalsMethod())
              .addMethod(getFindAnimalsByOriginMethod())
              .addMethod(getFindAnimalsByTypeMethod())
              .addMethod(getFindAnimalsByDateMethod())
              .build();
        }
      }
    }
    return result;
  }
}