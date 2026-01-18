# Single Responsibility Principle (SRP)

The Single Responsibility Principle states:

> A class should have only one reason to change.

This project demonstrates SRP using **before (violated)** and **after (compliant)** examples.

---

## Examples Included

### 1. Report Example

- **Violated**: Report handles content generation, PDF printing, and file storage
- **Compliant**:
    - `Report` → content generation
    - `PDFPrinter` → printing responsibility
    - `FileStorage` → persistence responsibility

---

### 2. Invoice Example

- **Violated**: Invoice handles calculation, printing, and saving logic
- **Compliant**:
    - `Invoice` → business calculation
    - `InvoicePrinter` → printing
    - `InvoiceRepository` → persistence abstraction
    - `DbInvoiceRepository`, `FileInvoiceRepository` → storage implementations

---

## Key Takeaways

- SRP improves maintainability and readability
- Changes in one responsibility do not impact others
- SRP enables Open/Closed Principle naturally
- Cleaner unit testing and extensibility

---

This repository is intended for:

- SOLID principle practice
- Low-Level Design interviews
- Clean code learning
