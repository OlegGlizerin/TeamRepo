package abstract_factory;

import vehicle_properties.VehicleType;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(VehicleType.MOTORBIKE);
        IEngine mEngine = factory.createEngine();
        IWheel mWheel = factory.createWheel();
    }
}
