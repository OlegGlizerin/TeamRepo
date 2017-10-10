package builder;

import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;

import java.util.ArrayList;

//ConcreteBuilder
public class TruckBuilder extends VehicleBuilder {
    public TruckBuilder() {
        categories = new ArrayList<VehicleCategory>();
        categories.add(VehicleCategory.SPORTS);
        categories.add(VehicleCategory.NORMAL);
        vehicle = new Vehicle();
    }

    public void buildCategory(VehicleCategory category) {
        if (categories.contains(category)) {
            vehicle.setCategory(category);
        } else {
            vehicle.setCategory(null);
        }
    }

    public void buildType() {
        vehicle.setType(VehicleType.TRUCK);
    }

    public void buildWheels() {
        vehicle.setWheels(4);
    }

    public void buildEngine() {
        vehicle.setEngine("GFX");
    }

    public void buildColor() {
        vehicle.setColor(Color.YELLOW);
    }

    public void buildDoors() {
        vehicle.setDoors(5);
    }
}
