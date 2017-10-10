package factory_method;

import vehicle_properties.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

//ConcreteThree
public class PrivateCarCreator implements IVehicleCreator {
    private static final List<VehicleCategory> subTypes = new ArrayList<VehicleCategory>();

    public PrivateCarCreator() {
        subTypes.add(VehicleCategory.SPORTS);
        subTypes.add(VehicleCategory.NORMAL);
        subTypes.add(VehicleCategory.HOVER);
    }

    public IVehicle CreateCar(VehicleCategory subType) {
        System.out.println(subType + " private car was created.");
        return new PrivateCar(subType);
    }
}
