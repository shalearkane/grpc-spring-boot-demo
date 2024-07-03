package voting;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@jakarta.annotation.Generated(
        value = "by gRPC proto compiler",
        comments = "Source: src/grpc-client/proto/voting.proto")
public final class VotingGrpc {

    private VotingGrpc() {}

    public static final String SERVICE_NAME = "voting.Voting";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<voting.VotingOuterClass.VotingRequest,
            voting.VotingOuterClass.VotingResponse> getVoteMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "Vote",
            requestType = voting.VotingOuterClass.VotingRequest.class,
            responseType = voting.VotingOuterClass.VotingResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<voting.VotingOuterClass.VotingRequest,
            voting.VotingOuterClass.VotingResponse> getVoteMethod() {
        io.grpc.MethodDescriptor<voting.VotingOuterClass.VotingRequest, voting.VotingOuterClass.VotingResponse> getVoteMethod;
        if ((getVoteMethod = VotingGrpc.getVoteMethod) == null) {
            synchronized (VotingGrpc.class) {
                if ((getVoteMethod = VotingGrpc.getVoteMethod) == null) {
                    VotingGrpc.getVoteMethod = getVoteMethod =
                            io.grpc.MethodDescriptor.<voting.VotingOuterClass.VotingRequest, voting.VotingOuterClass.VotingResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            voting.VotingOuterClass.VotingRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            voting.VotingOuterClass.VotingResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VotingMethodDescriptorSupplier("Vote"))
                                    .build();
                }
            }
        }
        return getVoteMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static VotingStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<VotingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<VotingStub>() {
                    @java.lang.Override
                    public VotingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new VotingStub(channel, callOptions);
                    }
                };
        return VotingStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static VotingBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<VotingBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<VotingBlockingStub>() {
                    @java.lang.Override
                    public VotingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new VotingBlockingStub(channel, callOptions);
                    }
                };
        return VotingBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static VotingFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<VotingFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<VotingFutureStub>() {
                    @java.lang.Override
                    public VotingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new VotingFutureStub(channel, callOptions);
                    }
                };
        return VotingFutureStub.newStub(factory, channel);
    }

    /**
     */
    public static abstract class VotingImplBase implements io.grpc.BindableService {

        /**
         */
        public void vote(voting.VotingOuterClass.VotingRequest request,
                         io.grpc.stub.StreamObserver<voting.VotingOuterClass.VotingResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getVoteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            voting.VotingOuterClass.VotingRequest,
                                            voting.VotingOuterClass.VotingResponse>(
                                            this, METHODID_VOTE)))
                    .build();
        }
    }

    /**
     */
    public static final class VotingStub extends io.grpc.stub.AbstractAsyncStub<VotingStub> {
        private VotingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VotingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new VotingStub(channel, callOptions);
        }

        /**
         */
        public void vote(voting.VotingOuterClass.VotingRequest request,
                         io.grpc.stub.StreamObserver<voting.VotingOuterClass.VotingResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     */
    public static final class VotingBlockingStub extends io.grpc.stub.AbstractBlockingStub<VotingBlockingStub> {
        private VotingBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VotingBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new VotingBlockingStub(channel, callOptions);
        }

        /**
         */
        public voting.VotingOuterClass.VotingResponse vote(voting.VotingOuterClass.VotingRequest request) {
            return blockingUnaryCall(
                    getChannel(), getVoteMethod(), getCallOptions(), request);
        }
    }

    /**
     */
    public static final class VotingFutureStub extends io.grpc.stub.AbstractFutureStub<VotingFutureStub> {
        private VotingFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VotingFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new VotingFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<voting.VotingOuterClass.VotingResponse> vote(
                voting.VotingOuterClass.VotingRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getVoteMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_VOTE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final VotingImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(VotingImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_VOTE:
                    serviceImpl.vote((voting.VotingOuterClass.VotingRequest) request,
                            (io.grpc.stub.StreamObserver<voting.VotingOuterClass.VotingResponse>) responseObserver);
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

    private static abstract class VotingBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        VotingBaseDescriptorSupplier() {}

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return voting.VotingOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Voting");
        }
    }

    private static final class VotingFileDescriptorSupplier
            extends VotingBaseDescriptorSupplier {
        VotingFileDescriptorSupplier() {}
    }

    private static final class VotingMethodDescriptorSupplier
            extends VotingBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        VotingMethodDescriptorSupplier(String methodName) {
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
            synchronized (VotingGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new VotingFileDescriptorSupplier())
                            .addMethod(getVoteMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
