package vehicle;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.enumsVehicle.EVehicleType;

public interface IVehicle extends Cloneable{
    void drive();
    void printAbilities();
    EVehicleModel getVehicleModel();
    EVehicleType getVehicleType();
    boolean isConstructed();
    IVehicle clone() throws CloneNotSupportedException;
    IVehicle makeBody();
    IVehicle makeEngine();
    IVehicle makeWheels();
    IVehicle makeContent();
    IVehicle constructAll();
}
