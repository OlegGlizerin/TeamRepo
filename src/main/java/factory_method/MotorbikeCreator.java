package factory_method;

import vehicle_properties.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

//ConcreteTwo
public class MotorbikeCreator implements IVehicleCreator {
    private static final List<VehicleCategory> subTypes = new ArrayList<VehicleCategory>();

    public MotorbikeCreator() {
        subTypes.add(VehicleCategory.SPORTS);
        subTypes.add(VehicleCategory.NORMAL);
        subTypes.add(VehicleCategory.SUV);
        subTypes.add(VehicleCategory.HOVER);
    }

    public IVehicle CreateCar(VehicleCategory subType) {
        System.out.println(subType + " motorbike was created.");
        return new Motorbike(subType);
    }
}
