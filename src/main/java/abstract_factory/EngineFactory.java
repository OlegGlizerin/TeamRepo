package abstract_factory;

import common.VehicleType;

public class EngineFactory extends AbstractFactory {
    public Engine getEngine(VehicleType engine) {
        if (engine.equals(VehicleType.PRIVATE_CAR)) {
            return new PrivateCarEngine();
        } else if (engine.equals(VehicleType.JEEP)) {
            return new JeepEngine();
        } else if (engine.equals(VehicleType.TRUCK)) {
            return new TruckEngine();
        } else if (engine.equals(VehicleType.MOTORBIKE)) {
            return new MotorbikeEngine();
        }
        return null;
    }

    public Wheel getWheel(VehicleType wheel) {
        return null;
    }
}
