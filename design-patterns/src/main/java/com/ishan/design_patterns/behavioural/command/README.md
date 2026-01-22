# Command Design Pattern (Java)

## Intent

Encapsulate a request as an object, allowing the sender to be decoupled
from the receiver and enabling undo, logging, and command queues.

---

## Problem Without Command

- Large if-else or switch blocks
- Tight coupling between UI and business logic
- Hard to add new actions
- No undo or command history

---

## Solution

- Define a Command interface
- Each action becomes a concrete command
- Invoker triggers commands without knowing implementation
- Receiver performs the actual work

---

## Structure

Invoker → Command → Receiver

---

## Example

RemoteControl (Invoker)  
LightOnCommand / LightOffCommand (Commands)  
Light (Receiver)

---

## When to Use

- UI buttons / menus
- Transaction systems
- Macro operations
- Undo / redo functionality
- Job queues or schedulers

---

## Key Benefit

Adds flexibility and extensibility by decoupling request initiation
from request execution.
