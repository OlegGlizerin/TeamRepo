package factory_method;

import vehicle_centers.LocationCenter;
import vehicle_components.VehicleSubType;
import vehicle_components.VehicleType;

import java.util.ArrayList;
import java.util.List;

//ConcreteOne
public class JeepCreator implements IVehicleCreator {
    private static final List<VehicleSubType> subTypes = new ArrayList<VehicleSubType>();

    public JeepCreator() {
        subTypes.add(VehicleSubType.SPORTS);
        subTypes.add(VehicleSubType.NORMAL);
        subTypes.add(VehicleSubType.SUV);
    }

    public IVehicle CreateCar(VehicleSubType subType) {
        System.out.println(subType + " jeep was created.");
        return new Jeep(subType);
    }
}
