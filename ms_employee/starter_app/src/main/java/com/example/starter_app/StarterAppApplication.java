package com.example.starter_app;

import com.example.starter_app.config.InfraConfig;
import com.example.starter_app.config.RestConfig;
import com.example.starter_app.config.RestInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

//@SpringBootApplication
public class StarterAppApplication {

    public static void main(String[] args) {
        SpringApplication infra = new SpringApplication(InfraConfig.class);
        infra.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        ConfigurableApplicationContext infraContext = infra.run();

        SpringApplication rest = new SpringApplication(RestConfig.class);
        rest.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
        rest.addInitializers(new RestInitializer(infraContext));
        ConfigurableApplicationContext restContext = rest.run();
    }

}
