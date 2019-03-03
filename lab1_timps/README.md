# Laboratory work nr.1 (Creational Design Patterns)
## Task: create a program in which you will use 5 Creational Design Patterns
#### During this laboratory work I used 5 Creational Design Pattern:
- Singleton
- Factory
- Abstract Factory
- Builder
- Prototype
***
### Singleton Design Pattern
**Java Singleton Pattern** is one of the **Gangs of Four Design patterns** and comes in the **Creational  Design Pattern** category.

#### About Singleton: 
  -  Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
  -   The singleton class must provide a global access point to get the instance of the class.

#### To implement a Singleton pattern, we have different approaches but all of them have the following common concepts:

-   Private constructor to restrict instantiation of the class from other classes.
-   Private static variable of the same class that is the only instance of the class.
-   Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
***
### Factory Design Pattern

Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.

Some important points about Factory Design Pattern method are:

1.  We can keep Factory class  **Singleton** or we can keep the method that returns the subclass as  **static**.
2.  Notice that based on the input parameter, different subclass is created and returned.  `getComputer`  is the factory method.
***
### Abstract Factory Design Pattern
The Abstract Factory Design Pattern is used to create families of related or dependent objects. It’s also sometimes called a factory of factories.
***
### Builder Design Pattern
The Builder Design Pattern is another creational pattern designed to deal with the construction of comparatively complex objects.

When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
***
### Prototype Design Pattern
Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.

## Task Implementation
### Singleton and Factory Design Pattern
**Singleton** and **Factory** Design Pattern were implemented in: **PersonFactory.java** and **JobFactory.java** classes.
Here is an example of implementation of both design patterns in **PersonFactory.java** class.
```java
//Singleton design pattern
//Factory design pattern
public class PersonFactory implements AbstractFactory < Person > {
    private PersonFactory() {};

    @Override
    public Person create(String personType) {
        if ("Employee".equalsIgnoreCase(personType)) {
            return new Employee();
        } else if ("Employer".equalsIgnoreCase(personType)) {
            return new Employer();
        }
        return null;
    }

    private static class PersonFactoryHelper {
        private static final PersonFactory INSTANCE = new PersonFactory();
    }
    public static PersonFactory getInstance() {
        return PersonFactoryHelper.INSTANCE;
    }
}
```
- For implementing singleton design pattern I used __"Bill Pugh Singleton Implementation"__.
You can read [here](https://www.google.com) about that kind of implementation.
- __Factory Design Pattern__ - according to an input the Factory class will return one of the sub-class **Employee** or **Employer** of the super class **Person**.

I could combine these 2 design patterns because according to the rules of **Factory Design Pattern**
we can keep Factory class  **Singleton** or we can keep the method that returns the subclass as  **static**, so I chose to keep  Factory class  **Singleton**.

***
### Abstract Factory Design Pattern
**Abstract Factory Design Pattern** was implemented using: **AbstractFactory .java**, **FactoryProvider.java**, **PersonFactory.java** and **JobFactory.java** classes.
The code of **PersonFactory.java** and **JobFactory.java** is written  [above](#markdown-header-singleton-and-factory-design-pattern), so I won't put it here.

First of all we need to create a Abstract Factory **interface** or **abstract class**.
```java
//Abstract factory design pattern
public interface AbstractFactory < T > {
    T create(String type);
}
```
After that we have to create Factory classes which will implement that Abstract Factory interface.
Here were created **FactoryProvider.java** and **PersonFactory.java** classes.

After creating Factory classes we need to create a **FactoryProvider.java** class which will return an instance of factory based on input.
```java
public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("Person".equalsIgnoreCase(choice)) {
            return PersonFactory.getInstance();
        } else if ("Job".equalsIgnoreCase(choice)) {
            return JobFactory.getInstance();
        }
        return null;
    }
}
```
After that we can use received factory for creating objects as we did in **Factory Design Pattern**.

***
### Builder Design Pattern
**Builder Design Pattern** was implemented in: **ITCompany.java** class.

```java
//Builder pattern
public class ITCompany {

    private String name;
    private List < Person > persons;
    private List < Job > jobs;

    private ITCompany(ITCompanyBuilder itCompanyBuilder) {
        this.name = itCompanyBuilder.name;
        this.persons = itCompanyBuilder.persons;
        this.jobs = itCompanyBuilder.jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List < Person > getPersons() {
        return persons;
    }

    public void setPersons(List < Person > persons) {
        this.persons = persons;
    }

    public List < Job > getJobs() {
        return jobs;
    }

    public void setJobs(List < Job > jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "ITCompany{" +
            "name='" + name + '\'' +
            ",\n persons=" + persons +
            ",\n jobs=" + jobs +
            '}';
    }

    //Builder Class
    public static class ITCompanyBuilder {
        private String name;
        private List < Person > persons;
        private List < Job > jobs;

        public ITCompanyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ITCompanyBuilder setPersons(List < Person > persons) {
            this.persons = persons;
            return this;
        }

        public ITCompanyBuilder setJobs(List < Job > jobs) {
            this.jobs = jobs;
            return this;
        }

        public ITCompany build() {
            return new ITCompany(this);
        }
    }
}
```
Here you can notice that **ITCompany.java** class has a private constructor and can not be instantiated directly, so the only way to get an  ITCompany object is through the **ITCompanyBuilder** class. 
***
### Prototype Design Pattern
**Prototype Design Pattern** was implemented in: **Employee.java**,  **Employer.java**,  **JavaDeveloper.java**,  **PythonDeveloper.java** classes.
Here is an example of **Prototype Design Pattern** implementation.
```java
//Prototype pattern
public class Employer extends Person {

    public Employer() {}
    
    public Employer(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi from employer");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Employer(this.getName(), this.getSurname(), this.getAge());
    }
}
```
Notice that the `clone` method is overridden to provide a copy of an Employer object.


