package io.gm.st.grpc.spring_grpc_random.repository;
import org.json.JSONArray;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomData {
    private final static int  MIN = 1;
    private final static int  MAX = 6;
    private final static int  NUM = 3;

    public JSONArray getResult(){
        JSONArray jA = new JSONArray();
        for (int i=0; i<NUM; i++) {
            jA.put(mathClassRandom());
        }
        return jA;
    }

    private int threadLocalRandom() {
        return ThreadLocalRandom.current().nextInt(MIN,MAX);
    }

    private int mathClassRandom() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * MAX + MIN;
        int randomInt = (int) randomDouble;
        return randomInt;
    }
}
