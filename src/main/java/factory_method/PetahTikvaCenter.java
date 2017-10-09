package factory_method;

import vehicle_components.VehicleSubType;
import vehicle_components.VehicleType;
import java.util.HashMap;

public class PetahTikvaCenter extends Location {

    public PetahTikvaCenter() {
        supportedVehicles = new HashMap<VehicleType, IVehicleCreator>();
        supportedVehicles.put(VehicleType.PRIVATE_CAR, new PrivateCarCreator());
        supportedVehicles.put(VehicleType.MOTORBIKE, new MotorbikeCreator());
        supportedVehicles.put(VehicleType.JEEP, new JeepCreator());
        supportedVehicles.put(VehicleType.TRUCK, new TruckCreator());
    }

    public IVehicle createSportsCar(VehicleType type) {
        IVehicleCreator creator = supportedVehicles.get(type);
        if (creator != null) {
            return creator.CreateCar(VehicleSubType.SPORTS);
        } else {
            System.out.println("Cannot create vehicle.");
            return null;
        }
    }

    public IVehicle createSuvCar(VehicleType type) {
        IVehicleCreator creator = supportedVehicles.get(type);
        if (creator != null) {
            return creator.CreateCar(VehicleSubType.SUV);
        } else {
            System.out.println("Cannot create vehicle.");
            return null;
        }
    }

    public IVehicle createHoverCar(VehicleType type) {
        IVehicleCreator creator = supportedVehicles.get(type);
        if (creator != null) {
            return creator.CreateCar(VehicleSubType.HOVER);
        } else {
            System.out.println("Cannot create vehicle.");
            return null;
        }
    }

    public IVehicle createNormalCar(VehicleType type) {
        IVehicleCreator creator = supportedVehicles.get(type);
        if (creator != null) {
            return creator.CreateCar(VehicleSubType.NORMAL);
        } else {
            System.out.println("Cannot create vehicle.");
            return null;
        }
    }
}
