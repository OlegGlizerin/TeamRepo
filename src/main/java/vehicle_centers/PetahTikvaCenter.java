package vehicle_centers;

import vehicle_properties.VehicleType;
import java.util.LinkedList;
import java.util.List;

public class PetahTikvaCenter implements LocationCenter {
    List<VehicleType> types;

    public PetahTikvaCenter() {
        types = new LinkedList<VehicleType>();
        types.add(VehicleType.PRIVATE_CAR);
        types.add(VehicleType.TRUCK);
        types.add(VehicleType.JEEP);
        types.add(VehicleType.MOTORBIKE);
    }

    public boolean isContains(VehicleType type) {
        if (types.contains(type))
            return true;

        return false;
    }

    public List<VehicleType> getTypes() {
        return types;
    }
}
