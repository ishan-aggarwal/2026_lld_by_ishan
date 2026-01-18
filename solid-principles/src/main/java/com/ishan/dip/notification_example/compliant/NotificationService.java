package com.ishan.dip.notification_example.compliant;

/**
 * Instead, we can depend on an abstraction
 * and inject the specific implementation through the constructor.
 */

public class NotificationService {
    private final MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notify(String message) {
        sender.send(message);
    }
}
