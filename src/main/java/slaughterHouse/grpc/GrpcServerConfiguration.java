package slaughterHouse.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import slaughterHouse.grpc.service.AnimalServiceImpl;

import java.io.IOException;

@Configuration
public class GrpcServerConfiguration {
    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public Server grpcServer(@Value("${grpc.server.port}") int port) throws IOException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port)
                .addService(applicationContext.getBean(AnimalServiceImpl.class));

        return serverBuilder.build().start();
    }

    @Bean
    public AnimalServiceImpl yourGrpcServiceImpl() {
        return new AnimalServiceImpl();
    }
}
