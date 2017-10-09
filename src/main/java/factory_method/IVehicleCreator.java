package factory_method;

import vehicle_components.VehicleSubType;

//Abstraction
public interface IVehicleCreator {
    IVehicle CreateCar(VehicleSubType subType);

}
