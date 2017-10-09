package vehicle_centers;
import vehicle_properties.VehicleType;
import java.util.List;

public interface LocationCenter {
    List<VehicleType> getTypes();
    boolean isContains(VehicleType type);
}
