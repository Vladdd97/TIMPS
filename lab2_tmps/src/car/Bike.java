package car;

import car.workshop.Workshop;

public class Bike extends Vehicle {

    public Bike(VehicleBrand vehicleBrand, Workshop producer, Workshop assembler) {
        super(vehicleBrand, producer, assembler);
    }

    @Override
    public void manufacture() {
        System.out.println("------- BIKE -------");
        System.out.println("Bike " + this.vehicleBrand);
        producer.work();
        assembler.work();
    }
}
