package slaughterHouse.grpc.protobuf.animals;

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
    comments = "Source: animal.proto")
public class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "AnimalService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      slaughterHouse.grpc.protobuf.animals.AnimalProto> METHOD_FIND_ANIMAL_BY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AnimalService", "findAnimalById"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      slaughterHouse.grpc.protobuf.animals.AnimalListProto> METHOD_FIND_ALL_ANIMALS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AnimalService", "findAllAnimals"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      slaughterHouse.grpc.protobuf.animals.AnimalListProto> METHOD_FIND_ANIMALS_BY_ORIGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AnimalService", "findAnimalsByOrigin"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      slaughterHouse.grpc.protobuf.animals.AnimalListProto> METHOD_FIND_ANIMALS_BY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AnimalService", "findAnimalsByType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      slaughterHouse.grpc.protobuf.animals.AnimalListProto> METHOD_FIND_ANIMALS_BY_DATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AnimalService", "findAnimalsByDate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(slaughterHouse.grpc.protobuf.animals.AnimalListProto.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    return new AnimalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnimalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnimalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAnimalById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ANIMAL_BY_ID, responseObserver);
    }

    /**
     */
    public void findAllAnimals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_ANIMALS, responseObserver);
    }

    /**
     */
    public void findAnimalsByOrigin(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ANIMALS_BY_ORIGIN, responseObserver);
    }

    /**
     */
    public void findAnimalsByType(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ANIMALS_BY_TYPE, responseObserver);
    }

    /**
     */
    public void findAnimalsByDate(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ANIMALS_BY_DATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_ANIMAL_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                slaughterHouse.grpc.protobuf.animals.AnimalProto>(
                  this, METHODID_FIND_ANIMAL_BY_ID)))
          .addMethod(
            METHOD_FIND_ALL_ANIMALS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                slaughterHouse.grpc.protobuf.animals.AnimalListProto>(
                  this, METHODID_FIND_ALL_ANIMALS)))
          .addMethod(
            METHOD_FIND_ANIMALS_BY_ORIGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                slaughterHouse.grpc.protobuf.animals.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_ORIGIN)))
          .addMethod(
            METHOD_FIND_ANIMALS_BY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                slaughterHouse.grpc.protobuf.animals.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_TYPE)))
          .addMethod(
            METHOD_FIND_ANIMALS_BY_DATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                slaughterHouse.grpc.protobuf.animals.AnimalListProto>(
                  this, METHODID_FIND_ANIMALS_BY_DATE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractStub<AnimalServiceStub> {
    private AnimalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAnimalById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMAL_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_ANIMALS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByOrigin(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_ORIGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByType(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAnimalsByDate(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_DATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalProto findAnimalById(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ANIMAL_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto findAllAnimals(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ALL_ANIMALS, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto findAnimalsByOrigin(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ANIMALS_BY_ORIGIN, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto findAnimalsByType(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ANIMALS_BY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public slaughterHouse.grpc.protobuf.animals.AnimalListProto findAnimalsByDate(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_ANIMALS_BY_DATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalProto> findAnimalById(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMAL_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalListProto> findAllAnimals(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ALL_ANIMALS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalListProto> findAnimalsByOrigin(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_ORIGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalListProto> findAnimalsByType(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<slaughterHouse.grpc.protobuf.animals.AnimalListProto> findAnimalsByDate(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_ANIMALS_BY_DATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ANIMAL_BY_ID = 0;
  private static final int METHODID_FIND_ALL_ANIMALS = 1;
  private static final int METHODID_FIND_ANIMALS_BY_ORIGIN = 2;
  private static final int METHODID_FIND_ANIMALS_BY_TYPE = 3;
  private static final int METHODID_FIND_ANIMALS_BY_DATE = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ANIMAL_BY_ID:
          serviceImpl.findAnimalById((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalProto>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMALS:
          serviceImpl.findAllAnimals((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_ORIGIN:
          serviceImpl.findAnimalsByOrigin((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_TYPE:
          serviceImpl.findAnimalsByType((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto>) responseObserver);
          break;
        case METHODID_FIND_ANIMALS_BY_DATE:
          serviceImpl.findAnimalsByDate((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<slaughterHouse.grpc.protobuf.animals.AnimalListProto>) responseObserver);
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
        METHOD_FIND_ANIMAL_BY_ID,
        METHOD_FIND_ALL_ANIMALS,
        METHOD_FIND_ANIMALS_BY_ORIGIN,
        METHOD_FIND_ANIMALS_BY_TYPE,
        METHOD_FIND_ANIMALS_BY_DATE);
  }

}
