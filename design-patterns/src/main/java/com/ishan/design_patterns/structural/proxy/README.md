# Proxy Design Pattern

## Intent

Provide a placeholder or surrogate object to control access to another object.

## When to Use

- Access control (authorization checks)
- Lazy initialization of heavy objects
- Logging or monitoring method calls
- Protecting sensitive or remote resources

## Example Explanation

In this example:

- `Document` is the common interface
- `RealDocument` is the actual object containing sensitive logic
- `DocumentProxy` controls access based on user role
- Client interacts only with the interface, unaware of proxy vs real object

## Key Takeaway

Proxy and the real object share the same interface, but the proxy adds control logic before delegating calls.
