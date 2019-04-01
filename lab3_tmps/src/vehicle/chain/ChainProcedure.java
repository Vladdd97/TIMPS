package vehicle.chain;

import vehicle.Vehicle;

public interface ChainProcedure {


    void setNextChain(ChainProcedure nextChainProcedure);

    void performAction(Vehicle vehicle);
}
