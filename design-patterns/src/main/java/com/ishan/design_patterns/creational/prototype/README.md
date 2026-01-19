# Prototype Design Pattern

## Category

Creational Design Pattern

---

## Intent

The Prototype pattern allows creating new objects by copying existing ones
instead of instantiating them from scratch.

This is useful when:

- Object creation is expensive
- Many objects share the same base configuration
- You want to avoid complex construction logic

---

## Key Idea

> "Create new objects by cloning an existing prototype."

---

## Structure

- **Prototype**
    - Declares a cloning interface (`copy()`)

- **Concrete Prototype**
    - Implements cloning logic

- **Prototype Registry**
    - Stores and manages base prototypes
    - Provides clones to clients

- **Client**
    - Uses registry to obtain cloned objects
    - Never depends on concrete constructors

---

## Example Use Cases in This Repo

### 1. User Prototype

- Cloning predefined user templates
- Avoids repeated construction logic

### 2. Configuration Prototype

- Cloning application configuration presets
- Useful for UI themes, editor settings, environment configs

---

## Advantages

- Faster object creation
- Reduces duplication of initialization logic
- Supports dynamic object configuration
- Cleaner client code

---

## Disadvantages

- Deep cloning can be complex
- Requires careful handling of mutable fields

---

## When to Use

- When objects have many shared attributes
- When object creation involves expensive setup

---

## Notes on Java Implementation

- Avoid `java.lang.Cloneable`
- Prefer explicit `copy()` methods
- Use immutability for safe prototypes
- Centralize cloning via a registry

---
