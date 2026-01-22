# Visitor Design Pattern – Shapes Example (Java)

## Intent

Separate algorithms from the objects on which they operate, allowing new operations
to be added without modifying existing object structures.

---

## Problem

When an object structure (like shapes) is stable but behaviors (area, perimeter,
export, validation) change frequently, adding new behavior leads to:

- Modifying many classes
- Violation of Open–Closed Principle

---

## Solution

Use the **Visitor Pattern**:

- Objects expose an `accept(visitor)` method
- Visitors encapsulate operations
- New behavior = new visitor (no change to existing classes)

---

## Package Structure

```

shapesexample
├── violated     // Tight coupling, OCP violation
└── compliant    // Visitor-based, extensible

```

---

## When to Use

- Object structure is stable
- New operations are added frequently
- You want to avoid changing domain classes

---

## Pros

- Open–Closed Principle respected
- Clean separation of concerns
- Easy to add new operations

---

## Cons

- Adding a new element type requires updating all visitors
- Slightly more complex structure

---

## One-Line Recall

> **Visitor = Add new behavior without touching existing objects**
