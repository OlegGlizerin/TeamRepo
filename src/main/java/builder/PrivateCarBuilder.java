package builder;

import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;
import java.util.ArrayList;

//ConcreteBuilder
public class PrivateCarBuilder extends VehicleBuilder {
    public PrivateCarBuilder() {
        categories = new ArrayList<VehicleCategory>();
        categories.add(VehicleCategory.SPORTS);
        categories.add(VehicleCategory.NORMAL);
        categories.add(VehicleCategory.HOVER);
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
        vehicle.setType(VehicleType.PRIVATE_CAR);
    }

    public void buildWheels() {
        vehicle.setWheels(4);
    }

    public void buildEngine() {
        vehicle.setEngine("SX");
    }

    public void buildColor() {
        vehicle.setColor(Color.RED);
    }

    public void buildDoors() {
        vehicle.setDoors(3);
    }
}
