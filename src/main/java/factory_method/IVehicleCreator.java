package factory_method;

import vehicle_properties.VehicleCategory;

//Abstraction
public interface IVehicleCreator {
    IVehicle CreateCar(VehicleCategory subType);

}
