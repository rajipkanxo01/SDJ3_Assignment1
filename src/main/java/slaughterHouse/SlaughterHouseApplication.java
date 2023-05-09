package slaughterHouse;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import slaughterHouse.grpc.service.AnimalServiceImpl;

import java.io.IOException;


@SpringBootApplication
@EntityScan("slaughterHouse.shared.model")
@EnableJpaRepositories("slaughterHouse.shared.repository")
@ComponentScan(basePackages = {"slaughterHouse.shared.service"})
//@Import({GrpcServerConfiguration.class})


public class SlaughterHouseApplication {
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

    public static void main(String[] args) {
        SpringApplication.run(SlaughterHouseApplication.class, args);


    }
}
