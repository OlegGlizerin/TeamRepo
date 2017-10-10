package factory_method;

import vehicle_properties.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

//ConcreteOne
public class JeepCreator implements IVehicleCreator {
    private static final List<VehicleCategory> subTypes = new ArrayList<VehicleCategory>();

    public JeepCreator() {
        subTypes.add(VehicleCategory.SPORTS);
        subTypes.add(VehicleCategory.NORMAL);
        subTypes.add(VehicleCategory.SUV);
    }

    public IVehicle CreateCar(VehicleCategory subType) {
        System.out.println(subType + " jeep was created.");
        return new Jeep(subType);
    }
}
