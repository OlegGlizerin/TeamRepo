package factory_method;

import vehicle_components.*;
import vehicle_properties.VehicleCategory;

//ProductOne
public class Jeep implements IVehicle {
    private Wheel wheel;
    private Engine engine;
    private VehicleCategory type;
    private String symbol;

    public Jeep(VehicleCategory subType) {
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
