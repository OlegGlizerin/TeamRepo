package factory_method;

import vehicle_components.*;

//ProductOne
public class Jeep implements IVehicle {
    private Wheel wheel;
    private Engine engine;
    private VehicleSubType type;
    private String symbol;

    public Jeep(VehicleSubType subType) {
        wheel = new JeepWheel();
        engine = new JeepEngine();
        type = subType;
        symbol = "Jeep Symbol";
    }

    public Wheel getWheels() {
        return wheel;
    }
    public Engine getEngine() {
        return engine;
    }

}
