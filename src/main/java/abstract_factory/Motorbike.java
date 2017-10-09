package abstract_factory;

//PlatformOne
public class Motorbike extends AbstractFactory {
    protected IWheel createWheel() {
        return new MotorbikeWheel();
    }

    protected IEngine createEngine() {
        return new MotorbikeEngine();
    }
}
