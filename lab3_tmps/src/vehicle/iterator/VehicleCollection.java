package vehicle.iterator;

import vehicle.Vehicle;
import vehicle.VehicleType;

public interface VehicleCollection {

    void add(Vehicle vehicle);

    void remove (Vehicle vehicle);

    public VehicleIterator iterator(VehicleType type);

}
