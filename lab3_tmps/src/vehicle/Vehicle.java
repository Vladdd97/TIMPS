package vehicle;

public abstract class Vehicle {

    protected String name;
    protected BuildVehicleTemplateStrategy strategy;
    private VehicleType type;

    public Vehicle(String name, BuildVehicleTemplateStrategy strategy, VehicleType type) {
        this.name = name;
        this.strategy = strategy;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public VehicleType getType() {
        return type;
    }

    public abstract void build();


    @Override
    public String toString() {
        return "vehicle.Vehicle{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", type=" + type +
                '}';
    }
}
