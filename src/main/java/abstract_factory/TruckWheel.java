package abstract_factory;

//ProductTwo-PlatformTwo
public class TruckWheel implements IWheel {
    private int wheels;

    public TruckWheel() {
        wheels = 4;
    }

    public int getWheels() {
        return wheels;
    }
}
