package slaughterHouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import slaughterHouse.grpc.GrpcServerConfiguration;


@SpringBootApplication
@EntityScan("slaughterHouse.shared.model")
@EnableJpaRepositories("slaughterHouse.shared.repository")
@ComponentScan(basePackages = {"slaughterHouse.shared.service"})
@Import({GrpcServerConfiguration.class})


public class SlaughterHouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SlaughterHouseApplication.class, args);
    }
}
