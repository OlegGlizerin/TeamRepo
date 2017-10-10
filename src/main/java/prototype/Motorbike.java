package prototype;

import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;

//ConcretePrototype
public class Motorbike implements IPrototype {
    private VehicleType type;
    private Color color;
    private VehicleCategory category;

    public Motorbike(VehicleCategory category) {
        type = VehicleType.MOTORBIKE;
        color = Color.BLACK;
        this.category = category;
    }

    public IPrototype clone() {
        return new Motorbike(category);
    }
}
