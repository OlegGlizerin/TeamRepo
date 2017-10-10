package prototype;

import vehicle_properties.Color;
import vehicle_properties.VehicleCategory;
import vehicle_properties.VehicleType;

//ConcretePrototype
public class PrivateCar implements IPrototype{
    private VehicleType type;
    private Color color;
    private VehicleCategory category;

    public PrivateCar(VehicleCategory category) {
        type = VehicleType.PRIVATE_CAR;
        color = Color.YELLOW;
        this.category = category;
    }

    public IPrototype clone() {
        return new PrivateCar(category);
    }
}
