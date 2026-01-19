# Abstract Factory Design Pattern

## Package

`com.ishan.design_patterns.creational.abstract_factory`

---

## Intent

The **Abstract Factory** pattern provides an interface for creating **families of related or dependent objects** without
specifying their concrete classes.

It is often referred to as a **factory of factories**.

---

## Use Case: Telecom Service Provider – Product Suite

A telecom provider offers a **suite of related services**:

- SIM
- WiFi
- DishTV

Each provider (Airtel, Jio) supplies its **own compatible implementations** of these services.

The client:

- Should not depend on concrete classes
- Must always receive products from the **same provider**
- Should be able to switch providers at runtime

---

## Solution

Use **Abstract Factory** to:

1. Select a provider-specific factory using an enum
2. Create a consistent family of products via that factory
3. Hide all concrete implementations from the client

---

## Project Structure

```

abstract_factory
└── usecase
└── telecom
├── client
│ └── TelecomClient.java
│
├── factory
│ ├── ProductFactory.java
│ ├── AirtelProductFactory.java
│ ├── RelianceProductFactory.java
│ └── ProductFactoryProvider.java
│
├── model
│ └── ProviderType.java
│
└── product
├── sim
│ ├── Sim.java
│ ├── AirtelSim.java
│ └── JioSim.java
│
├── wifi
│ ├── Wifi.java
│ ├── AirtelWifi.java
│ └── JioWifi.java
│
└── dishtv
├── DishTV.java
├── AirtelDishTV.java
└── JioDishTV.java

````

---

## Key Participants

### Abstract Factory

- `ProductFactory`

Defines methods to create related products:

- `createSim()`
- `createWifi()`
- `createDishTV()`

---

### Concrete Factories

- `AirtelProductFactory`
- `RelianceProductFactory`

Each factory creates **only its own provider’s products**, ensuring family consistency.

---

### Abstract Products

- `Sim`
- `Wifi`
- `DishTV`

---

### Concrete Products

- Airtel variants: `AirtelSim`, `AirtelWifi`, `AirtelDishTV`
- Jio variants: `JioSim`, `JioWifi`, `JioDishTV`

---

### Factory Provider

- `ProductFactoryProvider`

Uses `ProviderType` enum to return the correct concrete factory.

```java
ProductFactory factory =
        ProductFactoryProvider.getFactory(ProviderType.AIRTEL);
````

---

### Client

* `TelecomClient`

The client:

* Depends only on abstractions
* Does not know concrete class names
* Can switch providers without code changes

---

## When to Use Abstract Factory

* When you need to create **groups of related objects**
* When object creation logic must be isolated
* When switching entire product families at runtime
* When consistency across products is required

---

## Benefits

* Enforces product family consistency
* Adheres to Open/Closed Principle
* Removes tight coupling from client code
* Improves scalability and maintainability

---

## Pattern Type

**Creational Design Pattern**

---