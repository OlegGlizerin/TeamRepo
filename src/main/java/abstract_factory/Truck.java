package abstract_factory;

//PlatformTwo
public class Truck extends AbstractFactory {
    protected IWheel createWheel() {
        return new TruckWheel();
    }

    protected IEngine createEngine() {
        return new TruckEngine();
    }
}
