package io.gm.st.grpc.spring_grpc_random.service;
import io.gm.st.grpc.spring_grpc_random.RandomReply;
import io.gm.st.grpc.spring_grpc_random.RandomRequest;
import io.gm.st.grpc.spring_grpc_random.MyServiceGrpc;
import io.gm.st.grpc.spring_grpc_random.repository.RandomData;
import io.grpc.stub.StreamObserver;

public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    private RandomData randomData = new RandomData();

    @Override
    public void getRandom(RandomRequest request, StreamObserver<RandomReply> responseObserver) {
        RandomReply reply = RandomReply.newBuilder()
                .setMessage(randomData.getResult().toString())
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
