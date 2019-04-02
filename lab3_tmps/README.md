# Laboratory work nr.3 (Behavioral Design Patterns)
## Task: create a program in which you will use 5 Behavioral Design Patterns
#### During this laboratory work I used 5 Behavioral Design Pattern:
- Template
- Strategy
- Visitor
- Iterator
- Chain

## Template Design Pattern
**Java Template Pattern** is one of the **Gangs of Four Design patterns** and comes in the **Behavioral Design Pattern** category.

#### About Template : 
Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.

In my example I have a **BuildVehicleTemplateStrategy.java** where is the template method in which is defined the order of steps execution.

```java
public abstract class BuildVehicleTemplateStrategy {

    public final void build() {
        buildFrame();
        addEngine();
        addWheels();
        addDashboard();
        addEnergySource();
        System.out.println("vehicle.Vehicle is build");
    }

    public abstract void buildFrame();

    private void addEngine() {
        System.out.println("Adding engine to vehicle");
    }

    private void addWheels() {
        System.out.println("Adding front and back wheels");
    }

    private void addDashboard() {
        System.out.println("Adding a dashboard to vehicle");
    }

    public abstract void addEnergySource();
}
```

I have different type of Vehicles where some methods are overridden. For example let's see the implementation of **SEDAN** Vehicle.

```java
public class BuildSedanVehicleTemplateStrategy extends BuildVehicleTemplateStrategy {

    @Override
    public void buildFrame() {
        System.out.println("Build a frame for Sedan vehicle");
    }

    @Override
    public void addEnergySource() {
        System.out.println("Adding a powerful battery");
    }
}
```

## Strategy Design Pattern

**Java Strategy Pattern** is one of the **Gangs of Four Design patterns** and comes in the **Behavioral Design Pattern** category.

#### About Strategy: 
