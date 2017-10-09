package factory_method;

import vehicle_centers.LocationCenter;
import vehicle_components.VehicleSubType;

import java.util.ArrayList;
import java.util.List;

//ConcreteFour
public class TruckCreator implements IVehicleCreator {
    private static final List<VehicleSubType> subTypes = new ArrayList<VehicleSubType>();

    public TruckCreator() {
        subTypes.add(VehicleSubType.SPORTS);
        subTypes.add(VehicleSubType.NORMAL);
    }

    public IVehicle CreateCar(VehicleSubType subType) {
        System.out.println(subType + " truck was created.");
        return new Truck(subType);
    }
}
