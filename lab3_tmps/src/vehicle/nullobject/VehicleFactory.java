package vehicle.nullobject;

import vehicle.iterator.VehicleType;
import vehicle.templatestrategy.BuildVehicleTemplateStrategy;

public class VehicleFactory {

    public static final String SPORT_VEHICLE = "SPORT_VEHICLE";
    public static final String NULL_VEHICLE = "There is not such type of vehicle";

    //luxuryVehicle is the default type of vehicle the factory will return to user
    //public static final String LUXURY_VEHICLE = "LUXURY_VEHICLE";


    public static Vehicle getVehicle(String category, String name, BuildVehicleTemplateStrategy strategy, VehicleType type) {

        boolean typeExist = false;
        Vehicle vehicle = new NullVehicle(NULL_VEHICLE);

        for (VehicleType vehicleType : VehicleType.values()) {
            if (type.equals(vehicleType) && !type.equals(VehicleType.ALL)) {
                typeExist = true;
            }
        }

        if (typeExist) {

// simulate the case the CROSSOVER type doesn't exist in our DB
            switch (type) {
                case SEDAN:
                    if (category.equalsIgnoreCase(SPORT_VEHICLE))
                        vehicle = new SportVehicle(name, strategy, type);
                    else
                        vehicle = new LuxuryVehicle(name, strategy, type);
                    break;
                case HATCHBACK:
                    if (category.equalsIgnoreCase(SPORT_VEHICLE))
                        vehicle = new SportVehicle(name, strategy, type);
                    else
                        vehicle = new LuxuryVehicle(name, strategy, type);
                    break;
                default:
                    System.out.println("no match");

            }


        }

        return vehicle;
    }
}
