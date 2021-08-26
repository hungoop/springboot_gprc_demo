package io.gm.st.grpc.spring_grpc_random.controller;

import io.gm.st.grpc.spring_grpc_random.MyServiceGrpc;
import io.gm.st.grpc.spring_grpc_random.RandomReply;
import io.gm.st.grpc.spring_grpc_random.RandomRequest;
import io.gm.st.grpc.spring_grpc_random.repository.GameRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GprcContronller extends MyServiceGrpc.MyServiceImplBase{
    @Autowired
    private GameRepository gameRepository;

    @Override
    public void getRandom(RandomRequest request, StreamObserver<RandomReply> responseObserver) {
        System.out.println("gprc api random");

        RandomReply reply = gameRepository.getRandom("");

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
