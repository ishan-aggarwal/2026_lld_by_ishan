# Dependency Inversion Principle (DIP)

DIP stands for **Dependency Inversion Principle**.

> High-level modules should not depend on low-level modules.  
> Both should depend on abstractions.  
> Abstractions should not depend on details.  
> Details should depend on abstractions.

In simple terms:
**Depend on interfaces, not concrete implementations.**

---

## Why DIP Matters

Without DIP:

- High-level logic is tightly coupled to low-level implementations
- Changes in implementation force changes in business logic
- Code becomes hard to extend and test

DIP helps build **flexible, testable, and maintainable systems**.

---

## Example: Notification Service

### Violated Version

```java
class NotificationService {
    EmailSender emailSender = new EmailSender();

    void notify(String message) {
        emailSender.send(message);
    }
}
````

### Problem

* `NotificationService` depends directly on `EmailSender`
* Switching to SMS or Push notifications requires modifying this class
* High-level logic is coupled to low-level details

This violates DIP.

---

## Compliant Version

```java
interface MessageSender {
    void send(String message);
}
```

```java
class EmailSender implements MessageSender {
    public void send(String message) {
    }
}
```

```java
class NotificationService {
    private final MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notify(String message) {
        sender.send(message);
    }
}
```

### Result

* `NotificationService` depends on an abstraction
* New senders (SMS, Push) can be added without modification
* Implementation details are isolated

---

## Key Takeaways

* High-level modules should not depend on low-level modules
* Both should depend on abstractions
* DIP reduces coupling and improves flexibility
* Constructor injection is a common DIP technique
* DIP works best with SRP and OCP

---

## Design Lessons

* Concrete dependencies limit extensibility
* Interfaces enable substitution
* Dependency injection follows naturally from DIP

---

## Goal of This Module

* Understand DIP with a simple example
* Learn how to decouple high-level logic from implementations
* Prepare for SOLID-related interview questions

This module is intended for:

* SOLID principle learning
* Low-Level Design interviews
* Clean architecture practice
