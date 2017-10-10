package factory_method;

import vehicle_components.*;
import vehicle_properties.VehicleCategory;

//ProductTwo
public class Motorbike implements IVehicle {
    private Wheel wheel;
    private Engine engine;
    private VehicleCategory type;
    private String symbol;

    public Motorbike(VehicleCategory subType) {
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
