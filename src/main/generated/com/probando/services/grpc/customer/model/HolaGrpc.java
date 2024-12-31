package com.probando.services.grpc.customer.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: ejemplo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HolaGrpc {

  private HolaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.Hola";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.probando.services.grpc.customer.model.ejemplo.Mensaje> getSaludoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Saludo",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.probando.services.grpc.customer.model.ejemplo.Mensaje.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.probando.services.grpc.customer.model.ejemplo.Mensaje> getSaludoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.probando.services.grpc.customer.model.ejemplo.Mensaje> getSaludoMethod;
    if ((getSaludoMethod = HolaGrpc.getSaludoMethod) == null) {
      synchronized (HolaGrpc.class) {
        if ((getSaludoMethod = HolaGrpc.getSaludoMethod) == null) {
          HolaGrpc.getSaludoMethod = getSaludoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.probando.services.grpc.customer.model.ejemplo.Mensaje>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Saludo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.probando.services.grpc.customer.model.ejemplo.Mensaje.getDefaultInstance()))
              .setSchemaDescriptor(new HolaMethodDescriptorSupplier("Saludo"))
              .build();
        }
      }
    }
    return getSaludoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.probando.services.grpc.customer.model.ejemplo.Mensaje> getAdiosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Adios",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.probando.services.grpc.customer.model.ejemplo.Mensaje.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.probando.services.grpc.customer.model.ejemplo.Mensaje> getAdiosMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.probando.services.grpc.customer.model.ejemplo.Mensaje> getAdiosMethod;
    if ((getAdiosMethod = HolaGrpc.getAdiosMethod) == null) {
      synchronized (HolaGrpc.class) {
        if ((getAdiosMethod = HolaGrpc.getAdiosMethod) == null) {
          HolaGrpc.getAdiosMethod = getAdiosMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.probando.services.grpc.customer.model.ejemplo.Mensaje>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Adios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.probando.services.grpc.customer.model.ejemplo.Mensaje.getDefaultInstance()))
              .setSchemaDescriptor(new HolaMethodDescriptorSupplier("Adios"))
              .build();
        }
      }
    }
    return getAdiosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HolaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HolaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HolaStub>() {
        @java.lang.Override
        public HolaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HolaStub(channel, callOptions);
        }
      };
    return HolaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HolaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HolaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HolaBlockingStub>() {
        @java.lang.Override
        public HolaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HolaBlockingStub(channel, callOptions);
        }
      };
    return HolaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HolaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HolaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HolaFutureStub>() {
        @java.lang.Override
        public HolaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HolaFutureStub(channel, callOptions);
        }
      };
    return HolaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saludo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaludoMethod(), responseObserver);
    }

    /**
     */
    default void adios(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdiosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Hola.
   */
  public static abstract class HolaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HolaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Hola.
   */
  public static final class HolaStub
      extends io.grpc.stub.AbstractAsyncStub<HolaStub> {
    private HolaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HolaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HolaStub(channel, callOptions);
    }

    /**
     */
    public void saludo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adios(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdiosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Hola.
   */
  public static final class HolaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HolaBlockingStub> {
    private HolaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HolaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HolaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.probando.services.grpc.customer.model.ejemplo.Mensaje saludo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaludoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.probando.services.grpc.customer.model.ejemplo.Mensaje adios(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdiosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Hola.
   */
  public static final class HolaFutureStub
      extends io.grpc.stub.AbstractFutureStub<HolaFutureStub> {
    private HolaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HolaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HolaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.probando.services.grpc.customer.model.ejemplo.Mensaje> saludo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.probando.services.grpc.customer.model.ejemplo.Mensaje> adios(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdiosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALUDO = 0;
  private static final int METHODID_ADIOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALUDO:
          serviceImpl.saludo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje>) responseObserver);
          break;
        case METHODID_ADIOS:
          serviceImpl.adios((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.probando.services.grpc.customer.model.ejemplo.Mensaje>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSaludoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.probando.services.grpc.customer.model.ejemplo.Mensaje>(
                service, METHODID_SALUDO)))
        .addMethod(
          getAdiosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.probando.services.grpc.customer.model.ejemplo.Mensaje>(
                service, METHODID_ADIOS)))
        .build();
  }

  private static abstract class HolaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HolaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.probando.services.grpc.customer.model.ejemplo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Hola");
    }
  }

  private static final class HolaFileDescriptorSupplier
      extends HolaBaseDescriptorSupplier {
    HolaFileDescriptorSupplier() {}
  }

  private static final class HolaMethodDescriptorSupplier
      extends HolaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HolaMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HolaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HolaFileDescriptorSupplier())
              .addMethod(getSaludoMethod())
              .addMethod(getAdiosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
