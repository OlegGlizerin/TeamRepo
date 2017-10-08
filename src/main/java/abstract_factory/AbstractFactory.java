package abstract_factory;

import common.VehicleType;

public abstract class AbstractFactory {
    public enum Component {
        Engine,
        Wheel
    }

    public static AbstractFactory getFactory(Component Component) {
        AbstractFactory factory = null;
        switch (Component) {
            case Engine:
                factory = new EngineFactory();
                break;
            case Wheel:
                factory = new WheelFactory();
                break;
        }
        return factory;
    }

    public abstract Engine getEngine(VehicleType engine);
    public abstract Wheel getWheel(VehicleType wheel);
}
