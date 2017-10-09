package factory_method;

import vehicle_components.VehicleType;

import java.util.HashMap;

public abstract class Location {
    protected HashMap<VehicleType, IVehicleCreator> supportedVehicles;

    public abstract IVehicle createSportsCar(VehicleType type);
    public abstract IVehicle createSuvCar(VehicleType type);
    public abstract IVehicle createHoverCar(VehicleType type);
    public abstract IVehicle createNormalCar(VehicleType type);

}
