# Strategy Design Pattern – Fare Estimation Example

## Intent

Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.

---

## Problem

Fare calculation logic changes based on pricing rules:

- Time based
- Distance based
- Surge pricing

Without Strategy, this leads to large `if-else` or `switch` blocks.

---

## Solution

- Create a `PricingStrategy` interface
- Implement one class per pricing rule
- Inject the strategy at runtime via `PricingManager`

---

## Key Participants

- **PricingStrategy** → Strategy interface
- **TimeBasedPricingStrategy / DistanceBasedPricingStrategy / SurgePricingStrategy** → Concrete strategies
- **PricingManager** → Context
- **RideDetails** → Input data

---

## Benefits

- Open/Closed Principle
- No conditional logic
- Easy to add new pricing rules
- Highly testable

---

## When to Use

- Multiple ways to perform the same operation
- Algorithms change frequently
- Behavior selection at runtime
