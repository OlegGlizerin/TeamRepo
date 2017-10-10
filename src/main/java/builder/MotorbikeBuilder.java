package builder;

import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;
import java.util.ArrayList;

//ConcreteBuilder
public class MotorbikeBuilder extends VehicleBuilder {

    public MotorbikeBuilder() {
        categories = new ArrayList<VehicleCategory>();
        categories.add(VehicleCategory.SPORTS);
        categories.add(VehicleCategory.NORMAL);
        categories.add(VehicleCategory.SUV);
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
        vehicle.setType(VehicleType.MOTORBIKE);
    }

    public void buildWheels() {
        vehicle.setWheels(2);
    }

    public void buildEngine() {
        vehicle.setEngine("EX");
    }

    public void buildColor() {
        vehicle.setColor(Color.GREEN);
    }

    public void buildDoors() {
        vehicle.setDoors(0);
    }
  }
