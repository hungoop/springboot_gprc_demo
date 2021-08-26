package io.gm.st.grpc.spring_grpc_random.controller;

import io.gm.st.grpc.spring_grpc_random.RandomReply;
import io.gm.st.grpc.spring_grpc_random.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/random")
    RandomReply getRandom() {
        //System.out.println("getRandom" + nameGame);
        System.out.println("call api random");

        return gameRepository.getRandom("");
    }
}
