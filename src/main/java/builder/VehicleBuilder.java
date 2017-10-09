package builder;

import vehicle_properties.VehicleCategory;
import java.util.List;

//Builder
public abstract class VehicleBuilder {
    protected List<VehicleCategory> categories ;
    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        if (vehicle.getCategory() == null) {
            System.out.println("Cannot create vehicle.");
            return null;
        } else {
            System.out.println("Vehicle was created.");
            return vehicle;
        }
    }

    public abstract void buildType();
    public abstract void buildCategory(VehicleCategory category);
    public abstract void buildColor();
    public abstract void buildEngine();
    public abstract void buildWheels();
    public abstract void buildDoors();
   }
