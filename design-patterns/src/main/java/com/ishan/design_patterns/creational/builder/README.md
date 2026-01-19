# Builder Design Pattern

## Overview

The **Builder Design Pattern** is a **creational pattern** used to construct complex objects step by step.
It is especially useful when an object:

* Has **many optional parameters**
* Requires **readable and flexible object creation**
* Should be **immutable after construction**
* Suffers from **constructor telescoping** or unclear setters

The Builder pattern separates **object construction** from **object representation**, allowing the same construction
process to create different configurations.

---

## Problem Statement

Consider objects with multiple optional and mandatory fields:

* Large constructors become hard to read and maintain
* Overloaded constructors lead to confusion
* Setters break immutability
* Object creation logic becomes error-prone

**Builder solves this by:**

* Using a fluent API
* Making object creation expressive
* Allowing validation before object creation
* Supporting immutability

---

## Pattern Structure

**Key Components:**

1. **Product**

    * The complex object being built
    * Has a private constructor
    * Is immutable

2. **Builder**

    * Static inner class (or separate class)
    * Contains the same fields as the product
    * Provides fluent setter methods
    * Exposes a `build()` method

---

## Package Structure

```
builder.usecase
├── databaseconnection
│   ├── DatabaseConfiguration.java
│   └── README.md
│
├── http
│   └── HttpRequest.java
│
└── message
    ├── MessageBuilder.java
    ├── MessageType.java
    └── README.md
```

Each package demonstrates **Builder usage in a real-world scenario**.

---

## Use Cases Implemented

### 1. Database Configuration

**Problem:**
Database configuration has multiple optional parameters such as:

* Connection pool size
* Cache enablement
* Read-only mode

**Solution:**
`DatabaseConfiguration` uses a Builder to create immutable configurations with only required fields set.

**Key Concepts Demonstrated:**

* Optional vs mandatory fields
* Immutable configuration object
* Fluent API

---

### 2. HTTP Request

**Problem:**
HTTP requests can vary widely:

* Different HTTP methods
* Optional headers
* Optional body
* Optional query parameters

**Solution:**
`HttpRequest` Builder allows flexible and readable request construction.

**Key Concepts Demonstrated:**

* Configurable object creation
* Avoiding constructor explosion
* Clean request composition

---

### 3. Message Creation

**Problem:**
Messages can differ by:

* Message type (EMAIL, SMS, PUSH)
* Sender/recipient
* Delivery state
* Timestamp

**Solution:**
`MessageBuilder` constructs message objects with varying configurations using the same builder.

**Key Concepts Demonstrated:**

* Multiple object variants from the same builder
* Fluent readability
* Optional metadata fields

---

## Example Usage

```java
MessageBuilder message = MessageBuilder.getBuilder()
        .setMessageType(MessageType.EMAIL)
        .setContent("Your order has been shipped")
        .setSender("noreply@shop.com")
        .setRecipient("user@gmail.com")
        .setIsDelivered(true)
        .setTimestamp(System.currentTimeMillis())
        .build();
```

---

## Benefits of Builder Pattern

* Improves **readability**
* Avoids **telescoping constructors**
* Encourages **immutability**
* Makes object creation **self-documenting**
* Supports **validation before build**
* Ideal for **complex domain models**

---

## When to Use Builder

Use Builder when:

* An object has **more than 4–5 parameters**
* Many parameters are **optional**
* You want **immutable objects**
* You want **clear, expressive construction**

Avoid Builder when:

* Object has very few fields
* Construction logic is trivial

---

## Variations

* Classic Builder (used here)
* Step Builder (for mandatory fields)
* Lombok `@Builder`

---

## Purpose of This Module

This module is part of a **Low-Level Design (LLD) practice repository**, focused on:

* Clear understanding of design patterns
* Real-world use cases
* Interview-ready explanations
* Clean and maintainable Java code

---