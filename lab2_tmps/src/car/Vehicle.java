package car;

import car.workshop.Workshop;

//bridge
public abstract class Vehicle implements Transport {

    //intrinsic
    protected VehicleBrand vehicleBrand;
    protected Workshop producer;
    protected Workshop assembler;


    public Vehicle(VehicleBrand vehicleBrand, Workshop producer, Workshop assembler) {
        this.vehicleBrand = vehicleBrand;
        this.producer = producer;
        this.assembler = assembler;
    }

    public VehicleBrand getVehicleBrand() {
        return vehicleBrand;
    }

    @Override
    public void add(Transport transport) {

    }

    @Override
    public void remove(Transport transport) {

    }

    @Override
    public void clear() {

    }
}
