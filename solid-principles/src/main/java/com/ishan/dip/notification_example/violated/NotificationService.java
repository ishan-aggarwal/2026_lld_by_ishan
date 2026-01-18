package com.ishan.dip.notification_example.violated;

/**
 * Instead of your NotificationService creating a new EmailSender directly,
 * it should receive a MessageSender interface through its constructor.
 * This makes your code more flexible and testable.
 * You can swap out email for SMS without changing NotificationService at all.
 * In interviews, this comes up when discussing dependency injection
 * and how to make your design flexible.
 * Take a look at this NotificationService that's tightly coupled to
 * a specific email implementation.
 */

public class NotificationService {
    EmailSender emailSender = new EmailSender();

    void notify(String message) {
        emailSender.send(message);
    }
}

