# Laboratoy work nr.1 (Creational Design Patterns)
### Task: create a program in which you will use 5 Creational Design Patterns
#### During this laboratory work I used 5 Creational Design Pattern:
- Singleton
- Factory
- Abstract Factory
- Builder
- Prototype

## Singleton Design Pattern
**Java Singleton Pattern** is one of the **Gangs of Four Design patterns** and comes in the **Creational  Design Pattern** category.

#### About Singleton: 
  -  Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
  -   The singleton class must provide a global access point to get the instance of the class.

#### To implement a Singleton pattern, we have different approaches but all of them have the following common concepts:

-   Private constructor to restrict instantiation of the class from other classes.
-   Private static variable of the same class that is the only instance of the class.
-   Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

## Factory Design Pattern

Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.

Some important points about Factory Design Pattern method are:

1.  We can keep Factory class  **Singleton** or we can keep the method that returns the subclass as  **static**.
2.  Notice that based on the input parameter, different subclass is created and returned.  `getComputer`  is the factory method.

## Abstract Factory Design Pattern
The Abstract Factory Design Pattern is used to create families of related or dependent objects. It’s also sometimes called a factory of factories.

## Builder Design Pattern
The Builder Design Pattern is another creational pattern designed to deal with the construction of comparatively complex objects.

When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.

## Prototype Design Pattern
Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.
