package common;

import abstract_factory.AbstractFactory;
import abstract_factory.Engine;
import abstract_factory.Wheel;


public class Main {
    public static void main(String [] args)
    {
        AbstractFactory engineFactory=   AbstractFactory.getFactory(AbstractFactory.Component.Engine);
        Engine e =engineFactory.getEngine(VehicleType.JEEP);

        AbstractFactory wheelFactory=   AbstractFactory.getFactory(AbstractFactory.Component.Wheel);
        Wheel w =wheelFactory.getWheel(VehicleType.TRUCK);
    }

}
