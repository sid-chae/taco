package com.example.tacocloud;
//SB main class that bootstraps the project
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//composite application that combines @springbootconfiguration, @enableautoconfiguration, and @componentscan

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
