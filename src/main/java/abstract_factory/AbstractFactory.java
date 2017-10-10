package abstract_factory;

import vehicle_properties.VehicleType;

//AbstractPlatform
public abstract class AbstractFactory {
    public static AbstractFactory getFactory(VehicleType type) {
        AbstractFactory factory = null;
        switch (type) {
            case MOTORBIKE:
                factory = new Motorbike();
                break;
            case TRUCK:
                factory = new Truck();
                break;
            default:
                System.out.println("Not supported type.");
                break;
        }
        return factory;
    }

    protected abstract IWheel createWheel();
    protected abstract IEngine createEngine();
}
