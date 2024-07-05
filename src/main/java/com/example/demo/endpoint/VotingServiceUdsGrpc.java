package com.example.demo.endpoint;

import net.devh.boot.grpc.server.service.GrpcService;
import voting.VotingGrpc;
import voting.VotingOuterClass;


@GrpcService
public class VotingServiceUdsGrpc extends VotingGrpc.VotingImplBase {
    @Override
    public void vote(VotingOuterClass.VotingRequest request,
                     io.grpc.stub.StreamObserver<VotingOuterClass.VotingResponse> responseObserver) {
        VotingOuterClass.VotingResponse response = VotingOuterClass.VotingResponse.newBuilder().setConfirmation("yes").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
