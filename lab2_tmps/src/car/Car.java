package car;

import car.workshop.Workshop;

public class Car extends Vehicle {


    public Car(VehicleBrand vehicleBrand, Workshop producer, Workshop assembler) {
        super(vehicleBrand, producer, assembler);
    }

    @Override
    public void manufacture() {
        System.out.println("------- CAR -------");
        System.out.println("Car " + this.vehicleBrand);
        producer.work();
        assembler.work();
    }
}
