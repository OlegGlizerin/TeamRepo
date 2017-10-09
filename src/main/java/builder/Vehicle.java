package builder;

import vehicle_components.Engine;
import vehicle_components.Wheel;
import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;

//Product
public class Vehicle {
    private VehicleType type;
    private VehicleCategory category;
    private String engine;
    private int wheels;
    private int doors;
    private Color color;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleCategory getCategory() {
        return category;
    }
}
