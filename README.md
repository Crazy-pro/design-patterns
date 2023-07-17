### Design Patterns

Design Patterns is a project with all 23 Java GOF pattern examples. Just good reminders for me.

### GOF Design Patterns:

###### Creational Patterns

- **Abstract Factory**
    - Description: Provide an interface for creating families of related or dependent objects without specifying their
      concrete classes.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/abstract-factory)

- **Builder**
    - Description: Separate the construction of a complex object from its representation, allowing the same construction
      process to create various representations.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/builder)

- **Factory Method**
    - Description: Define an interface for creating objects, but let subclasses decide which class to instantiate.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/factory-method)

- **Prototype**
    - Description: Specify the kinds of objects to create using a prototypical instance and create new objects by
      copying this prototype.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/prototype)

- **Singleton**
    - Description: Ensure a class has only one instance and provide a global point of access to it.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/singleton)

###### Structural Patterns

- **Adapter**
    - Description: Convert the interface of a class into another interface clients expect. Adapter lets classes work
      together that couldn't otherwise because of incompatible interfaces.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/adapter)

- **Bridge**
    - Description: Decouple an abstraction from its implementation so that the two can vary independently.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/bridge)

- **Composite**
    - Description: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients
      treat individual objects and compositions of objects uniformly.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/composite)

- **Decorator**
    - Description: Attach additional responsibilities to an object dynamically. Decorators provide a flexible
      alternative to subclassing for extending functionality.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/decorator)

- **Facade**
    - Description: Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
      interface that makes the subsystem easier to use.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/facade)

- **Flyweight**
    - Description: Use sharing to support large numbers of fine-grained objects efficiently.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/flyweight)

- **Proxy**
    - Description: Provide a surrogate or placeholder for another object to control access to it.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/proxy)

###### Behavioral Patterns

- **Chain of Responsibility**
    - Description: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to
      handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/chain-of-responsibility)

- **Command**
    - Description: Encapsulate a request as an object, thereby letting you parameterize clients with different requests,
      queue or log requests, and support undoable operations.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/command)

- **Interpreter**
    - Description: Given a language, define a representation for its grammar along with an interpreter that uses the
      representation to interpret sentences in the language.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/interpreter)

- **Iterator**
    - Description: Provide a way to access the elements of an aggregate object sequentially without exposing its
      underlying representation.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/iterator)

- **Mediator**
    - Description: Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by
      keeping objects from referring to each other explicitly and lets you vary their interaction independently.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/mediator)

- **Memento**
    - Description: Without violating encapsulation, capture and externalize an object's internal state so that the
      object can be restored to this state later.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/memento)

- **Observer**
    - Description: Define a one-to-many dependency between objects so that when one object changes state, all its
      dependents are notified and updated automatically.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/observer)

- **State**
    - Description: Allow an object to alter its behavior when its internal state changes. The object will appear to
      change its class.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/state)

- **Strategy**
    - Description: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the
      algorithm vary independently from clients that use it.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/strategy)

- **Template Method**
    - Description: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template
      Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/template-method)

- **Visitor**
    - Description: Represent an operation to be performed on the elements of an object structure. Visitor lets you
      define a new operation without changing the classes of the elements on which it operates.
    - [Code Example](https://github.com/crazy-pro/design-patterns/tree/master/visitor)

### How to start:

1. Install and run any IDE for working with Java.
2. Run the application and check end-points work using Postman and link below:
    - http://localhost:8080/

### Technologies:

- Programming language: Java 18;
- Frameworks:
    - Spring (Boot, Core, Data, WebMVC, Test).
- IDE: IntelliJ IDEA;
- Database: H2;
- Tools: JUnit 5, Mockito, Lombok, Maven, Git, HTTPs, XML, YAML, JSON;
- Others: GitHub, CircleCI, CodeCov, SonarLint, SonarCloud.

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/Crazy-pro/design-patterns/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/Crazy-pro/design-patterns/tree/master)
[![CodeCov](https://codecov.io/gh/Crazy-pro/design-patterns/branch/master/graph/badge.svg?token=QkZkaGezVi)](https://codecov.io/gh/Crazy-pro/design-patterns)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)

[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_design-patterns&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_design-patterns)
