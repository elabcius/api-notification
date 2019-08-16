package com.microservices2.exercise1.notification;

import com.microservices2.exercise1.notification.stream.NotificationStreams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(NotificationStreams.class)
public class ApiNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiNotificationApplication.class, args);
    }

}
