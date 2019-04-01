import vehicle.*;
import vehicle.chain.BuildChainProcedure;
import vehicle.chain.ChainProcedure;
import vehicle.chain.PaintChainedProcedure;
import vehicle.chain.TestChainProcedure;
import vehicle.iterator.VehicleCollection;
import vehicle.iterator.VehicleCollectionImpl;
import vehicle.iterator.VehicleIterator;

public class Main {


    public static void main(String[] args) {

        ChainProcedure chainProcedure = getChainedProcedure();
        VehicleCollection vehicleCollection = getVehicles();
        VehicleIterator iterator = vehicleCollection.iterator(VehicleType.ALL);

        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            System.out.println("\n\n---------------------------------------");
            System.out.println(vehicle.toString());
            chainProcedure.performAction(vehicle);
            System.out.println("---------------------------------------");
        }

    }


    public static ChainProcedure getChainedProcedure() {
        ChainProcedure c1 = new BuildChainProcedure();
        ChainProcedure c2 = new PaintChainedProcedure();
        ChainProcedure c3 = new TestChainProcedure();


        c1.setNextChain(c2);
        c2.setNextChain(c3);

        return c1;
    }

    public static VehicleCollection getVehicles() {
        VehicleCollection constructionCollection = new VehicleCollectionImpl();
        constructionCollection.add(new SportVehicle("FORD", new BuildHatchbackVehicleTemplateStrategy(), VehicleType.HATCHBACK));
        constructionCollection.add(new SportVehicle("TOYOTA", new BuildHatchbackVehicleTemplateStrategy(), VehicleType.HATCHBACK));
        constructionCollection.add(new SportVehicle("BMW", new BuildSedanVehicleTemplateStrategy(), VehicleType.SEDAN));


        return constructionCollection;
    }
}
