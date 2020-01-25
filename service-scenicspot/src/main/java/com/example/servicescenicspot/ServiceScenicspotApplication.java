package com.example.servicescenicspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.servicescenicspot"})
@SpringBootApplication
public class ServiceScenicspotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceScenicspotApplication.class, args);
    }

}
