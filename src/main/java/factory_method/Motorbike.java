package factory_method;

import vehicle_components.*;

//ProductTwo
public class Motorbike implements IVehicle {
    private Wheel wheel;
    private Engine engine;
    private VehicleSubType type;
    private String symbol;

    public Motorbike(VehicleSubType subType) {
        wheel = new MotorbikeWheel();
        engine = new MotorbikeEngine();
        type = subType;
        symbol = "Motorbike Symbol";
    }

    public Wheel getWheels() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }
}
