package factory_method;

import vehicle_properties.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

//ConcreteFour
public class TruckCreator implements IVehicleCreator {
    private static final List<VehicleCategory> subTypes = new ArrayList<VehicleCategory>();

    public TruckCreator() {
        subTypes.add(VehicleCategory.SPORTS);
        subTypes.add(VehicleCategory.NORMAL);
    }

    public IVehicle CreateCar(VehicleCategory subType) {
        System.out.println(subType + " truck was created.");
        return new Truck(subType);
    }
}
