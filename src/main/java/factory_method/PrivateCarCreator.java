package factory_method;

import vehicle_centers.LocationCenter;
import vehicle_components.VehicleSubType;

import java.util.ArrayList;
import java.util.List;

//ConcreteThree
public class PrivateCarCreator implements IVehicleCreator {
    private static final List<VehicleSubType> subTypes = new ArrayList<VehicleSubType>();

    public PrivateCarCreator() {
        subTypes.add(VehicleSubType.SPORTS);
        subTypes.add(VehicleSubType.NORMAL);
        subTypes.add(VehicleSubType.HOVER);
    }

    public IVehicle CreateCar(VehicleSubType subType) {
        System.out.println(subType + " private car was created.");
        return new PrivateCar(subType);
    }
}
