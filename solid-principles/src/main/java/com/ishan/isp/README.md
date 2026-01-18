# Interface Segregation Principle (ISP)

ISP stands for **Interface Segregation Principle**.

> Clients should not be forced to depend on interfaces they do not use.

In simple terms:
**Do not create large, “fat” interfaces.  
Prefer smaller, role-specific interfaces.**

---

## Why ISP Matters

When interfaces become too large:

- Implementing classes are forced to provide meaningless methods
- Code becomes harder to maintain
- Changes impact unrelated implementations
- Violations often result in empty methods or exceptions

ISP helps design **clean, flexible, and maintainable interfaces**.

---

## Example 1: Worker Example

### Violated Version

```java
interface Worker {
    void work();

    void eat();

    void sleep();
}
````

```java
class Robot implements Worker {
    public void work() { /* working */ }

    public void eat() { /* robots don't eat */ }

    public void sleep() { /* robots don't sleep */ }
}
```

### Problem

* `Robot` is forced to implement `eat()` and `sleep()`
* These methods are irrelevant for robots
* The interface mixes unrelated responsibilities

This is a **clear ISP violation**.

---

### Compliant Version

```java
interface Workable {
    void work();
}

interface Feedable {
    void eat();
}

interface Restable {
    void sleep();
}
```

```java
class Human implements Workable, Feedable, Restable {
}

class Robot implements Workable {
}
```

### Result

* Each class implements only what it needs
* Interfaces are small and focused
* No meaningless method implementations

---

## Example 2: Service Provider Example

### Violated Version

```java
public interface CloudProvider {
    void addServer(String region, String serverId);

    List<String> listServers(String region);

    String getCDNAddress();

    void uploadFile(String name);

    File getFile(String name);
}
```

```java
public class DropboxProvider implements CloudProvider {
    // Forced to implement server and CDN methods it does not support
}
```

### Problem

* `DropboxProvider` does not support hosting or CDN
* It is forced to implement unsupported methods
* Interface combines unrelated cloud capabilities

This violates ISP.

---

### Compliant Version

```java
public interface CloudHostingProvider {
    void addServer(String region, String serverId);

    List<String> listServers(String region);
}

public interface CloudStorageProvider {
    void uploadFile(String name);

    File getFile(String name);
}

public interface CDNProvider {
    String getCDNAddress();
}
```

```java
public class AWSProvider implements
        CloudHostingProvider,
        CloudStorageProvider,
        CDNProvider {
}

public class DropboxProvider implements CloudStorageProvider {
}
```

### Result

* Each provider implements only supported capabilities
* No unused methods
* Clean separation of concerns

---

## Key Takeaways

* Interfaces should be **client-specific**
* Avoid “one-interface-fits-all” designs
* ISP reduces coupling and improves flexibility
* Empty methods or exceptions are strong ISP violation signals
* ISP often works together with SRP and LSP

---

## Design Lessons

* Fat interfaces are a design smell
* Capability-based interfaces scale better
* Prefer composition of small interfaces over inheritance from large ones

---

## Goal of This Module

* Understand ISP through real-world examples
* Learn how to detect interface bloat
* Design clean, focused abstractions

This module is intended for:

* SOLID principle learning
* Low-Level Design interviews
* Clean API and interface design practice

