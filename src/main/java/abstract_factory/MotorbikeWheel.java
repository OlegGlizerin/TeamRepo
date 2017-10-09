package abstract_factory;

//ProductTwo-PlatformOne
public class MotorbikeWheel implements IWheel {
    private int wheels;

    public MotorbikeWheel() {
        wheels = 2;
    }

    public int getWheels() {
        return wheels;
    }
}
