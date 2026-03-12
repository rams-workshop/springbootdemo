# Spring Boot Dependency Injection Workshop

This module demonstrates the concepts of Dependency Injection (DI) in Spring Boot.

## Overview

The example contrasts two approaches:
1. **Without DI**: Manually creating objects using the `new` keyword.
2. **With DI**: Letting the Spring container manage object creation and dependency injection.

## Components

### 1. [AlienWithoutDI](AlienWithoutDI.java)
A simple Java class that is not managed by Spring. It must be instantiated manually.

### 2. [AlienWithDI](AlienWithDI.java)
A Spring-managed bean (annotated with `@Component`). It demonstrates:
- **Dependency Injection**: It has a dependency on `AlientAutoWireExample` which is injected by Spring.
- **Field Injection**: Uses `@Autowired` on the field.

### 3. [AlientAutoWireExample](AlientAutoWireExample.java)
A component that is injected into `AlienWithDI`.

### 4. [SpringbootDependencyInjection](SpringbootDependencyInjection.java)
The main application class that:
- Initializes the Spring Context.
- Demonstrates manual object creation.
- Retrieves a Spring-managed bean from the context (`context.getBean(AlienWithDI.class)`).

## How to Run

Run the `SpringbootDependencyInjection` class as a Java application.

### Expected Output
```text
Alien without DI...
Alien AutoWire Example is coding...
Alien with DI is coding...
Hello World! This is a Spring Boot DI Example.
```
_Note: The specific startup logs from Spring Boot will also appear._
