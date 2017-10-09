package factory_method;

import vehicle_components.*;

//ProductThree
public class PrivateCar implements IVehicle{
    private Wheel wheel;
    private Engine engine;
    private VehicleSubType type;
    private String symbol;

    public PrivateCar(VehicleSubType subType)
    {
        wheel = new PrivateCarWheel();
        engine = new PrivateCarEngine();
        type = subType;
        symbol = "Private Car Symbol";
    }
    public Wheel getWheels() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }
}
