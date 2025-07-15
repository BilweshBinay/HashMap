# Java HashMap Examples

This repository contains two practical examples of how to use **Java HashMap** with:
1. **Built-in types** – tracking city temperatures
2. **Custom objects (DTOs)** – storing bank account details

---

## 📌 What is HashMap?

A `HashMap` is a part of Java's `java.util` package.  
It stores **key-value pairs**, where:
- Keys are **unique**
- Values can be duplicated
- It allows **null keys and values**
- It does **not maintain order** of insertion

### 🔑 Features:
- Fast lookup with `get(key)`
- Useful for storing mappings (like ID → Data)
- Internally uses a **hashing algorithm**
- Not thread-safe (use `ConcurrentHashMap` for that)

---

## 📁 Project Structure

```bash
HashMapProjects/
│
├── BuiltInMap/
│   └── BuiltInHashMapExample.java
│
├── CustomMap/
│   ├── BankAccountDto.java
│   └── CustomValueHashMapExample.java
