package io.gm.st.grpc.spring_grpc_random;

import io.gm.st.grpc.spring_grpc_random.service.MyServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import java.io.IOException;

@SpringBootApplication
public class SpringGrpcRandomApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(SpringGrpcRandomApplication.class, args);

		System.out.println("server gPRC start: 8111");
		Server server = ServerBuilder
				.forPort(8111)
				.addService(new MyServiceImpl()).build();

		server.start();
		server.awaitTermination();
	}

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

}
