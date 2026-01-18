# Open/Closed Principle (OCP)

The Open/Closed Principle states:

> Software entities should be open for extension, but closed for modification.

This module demonstrates OCP using practical Java examples.

---

## Example 1: Payment Processing

### Problem

A `PaymentProcessor` uses conditional logic (`if/else`) to handle payment types.
Adding a new payment method requires modifying existing code.

### Solution

- Introduce `PaymentMethod` interface
- Each payment type implements its own logic
- `PaymentProcessor` depends on abstraction

### Result

- New payment methods added without modifying existing code
- Fully OCP-compliant

---

## Example 2: Invoice Persistence

### Problem

Invoice saving logic required modification for every new storage type.

### Solution

- Introduce `InvoiceSaver` interface
- Implement DB, File, Cloud savers independently
- Invoice logic remains unchanged

### Result

- Persistence logic is extensible
- Core invoice logic is closed for modification

---

## Key Takeaways

- Replace conditionals with polymorphism
- Depend on abstractions, not concrete classes
- OCP works best when SRP is already applied
- New behavior should be added via new classes

---

This module is intended for:

- SOLID principle learning
- Low-Level Design interviews
- Clean architecture practice
