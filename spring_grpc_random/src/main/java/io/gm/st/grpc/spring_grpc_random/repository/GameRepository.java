package io.gm.st.grpc.spring_grpc_random.repository;

import io.gm.st.grpc.spring_grpc_random.RandomReply;
import org.springframework.stereotype.Repository;

@Repository
public class GameRepository {
    private RandomData randomData = new RandomData();

    public RandomReply getRandom(String nameGame){
        RandomReply reply = RandomReply.newBuilder()
                .setMessage(randomData.getResult().toString())
                .build();

        return reply;
    }
}
