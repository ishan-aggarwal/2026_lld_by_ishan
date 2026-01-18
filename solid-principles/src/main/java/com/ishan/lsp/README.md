# Liskov Substitution Principle (LSP)

LSP stands for **Liskov Substitution Principle**.

> If a class `S` is a subtype of class `T`, then objects of type `T` should be replaceable
> with objects of type `S` without altering the correctness of the program.

In simple terms:
**A child class should be able to substitute its parent without breaking behavior.**

---

## Example: Bird Hierarchy

This module demonstrates a classic **LSP violation and its correction** using a bird example.

---

## Violated Version

### Problem

The base class `Bird` defines a `fly()` method, assuming all birds can fly.

```java
public abstract class Bird {
    abstract void fly();

    abstract void eat();
}
````

However, `Penguin` cannot fly and throws an exception:

```java

@Override
public void fly() {
    throw new UnsupportedOperationException("Penguins can't fly");
}
```

### Why This Violates LSP

* `Bird` promises that `fly()` is safe to call
* `Penguin` breaks that promise
* Substituting `Penguin` where `Bird` is expected causes runtime failure

**The subclass does not honor the parent contract.**

---

## Compliant Version

### Solution

* Remove `fly()` from the `Bird` abstraction
* Introduce a separate `Flyable` interface
* Only flying birds implement `Flyable`

```java
public interface Flyable {
    void fly();
}
```

```java
public abstract class Bird {
    abstract void eat();
}
```

### Result

* `Eagle` is a `Bird` and `Flyable`
* `Penguin` is only a `Bird`
* No runtime exceptions
* Substitution is safe

---

## Client Behavior

The client:

* Uses `Bird` only for common behavior (`eat`)
* Uses `Flyable` only where flying is required

This ensures correct behavior without casting or runtime checks.

---

## Key Takeaways

* LSP is about **behavior**, not just inheritance
* Subclasses must honor the **contract** of the base class
* Do not force subclasses to implement behaviors they cannot support
* Prefer **capability-based interfaces** over bloated base classes
* Violations often show up as runtime exceptions or defensive checks

---

## Design Lessons

* Inheritance implies **IS-A + CAN-DO**
* If a subclass cannot perform all parent behaviors, redesign the abstraction
* LSP violations often indicate missing interfaces or incorrect hierarchies

---

## Goal of This Module

* Understand LSP clearly with a real-world example
* Learn how to detect substitution violations
* Build correct inheritance hierarchies

This module is intended for:

* SOLID principle learning
* Low-Level Design interviews
* Clean object-oriented design practice

