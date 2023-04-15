package slaughterHouse.restAPI;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import slaughterHouse.grpc.GrpcServerConfiguration;
import slaughterHouse.grpc.service.AnimalServiceImpl;
import slaughterHouse.restAPI.service.AnimalService;


@SpringBootApplication
@EntityScan("slaughterHouse.shared.model")
@Import({GrpcServerConfiguration.class})


public class SlaughterHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlaughterHouseApplication.class, args);
    }


}
