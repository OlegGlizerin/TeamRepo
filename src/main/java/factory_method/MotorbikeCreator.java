package factory_method;

import vehicle_centers.LocationCenter;
import vehicle_components.VehicleSubType;

import java.util.ArrayList;
import java.util.List;

//ConcreteTwo
public class MotorbikeCreator implements IVehicleCreator {
    private static final List<VehicleSubType> subTypes = new ArrayList<VehicleSubType>();

    public MotorbikeCreator() {
        subTypes.add(VehicleSubType.SPORTS);
        subTypes.add(VehicleSubType.NORMAL);
        subTypes.add(VehicleSubType.SUV);
        subTypes.add(VehicleSubType.HOVER);
    }

    public IVehicle CreateCar(VehicleSubType subType) {
        System.out.println(subType + " motorbike was created.");
        return new Motorbike(subType);
    }
}
