package factory_method;

import vehicle_components.*;
import vehicle_properties.VehicleCategory;

//ProductFour
public class Truck implements IVehicle {
    private Wheel wheel;
    private Engine engine;
    private VehicleCategory type;
    private String symbol;

    public Truck(VehicleCategory subType) {
        wheel = new TruckWheel();
        engine = new TruckEngine();
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
