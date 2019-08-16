package com.microservices2.exercise1.notification.listener;

import com.microservices2.exercise1.notification.model.Notification;
import com.microservices2.exercise1.notification.stream.NotificationStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationListener {

    @StreamListener(NotificationStreams.INPUT)
    public void sendMailNotification(@Payload Notification notification) {
        log.info("Send notification to email: {} Message: {}", notification.getEmail(), notification.getMessage());
    }

    @StreamListener(NotificationStreams.INPUT)
    public void sendSmsNotification(@Payload Notification notification) {
        log.info("Notified with SMS to mobile: {} Message: {}", notification.getMobile(), notification.getMessage());
    }
}
