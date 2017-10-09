package factory_method;

import vehicle_components.Engine;
import vehicle_components.Wheel;

//Product
public interface IVehicle {

    Wheel getWheels();
    Engine getEngine();
}
