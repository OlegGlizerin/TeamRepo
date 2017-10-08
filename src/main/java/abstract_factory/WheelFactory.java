package abstract_factory;

import common.VehicleType;

public class WheelFactory extends AbstractFactory {
    public Engine getEngine(VehicleType engine) {
        return null;
    }

    public Wheel getWheel(VehicleType wheel) {
        if (wheel.equals(VehicleType.PRIVATE_CAR)) {
            return new PrivateCarWheel();
        } else if (wheel.equals(VehicleType.JEEP)) {
            return new JeepWheel();
        } else if (wheel.equals(VehicleType.TRUCK)) {
            return new TruckWheel();
        } else if (wheel.equals(VehicleType.MOTORBIKE)) {
            return new MotorbikeWheel();
        }
        return null;
    }
}

