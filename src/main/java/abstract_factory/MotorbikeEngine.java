package abstract_factory;

//ProductOne-PlatformOne
public class MotorbikeEngine implements IEngine {
    private int volume;

    public MotorbikeEngine() {
        volume = 2000;
    }

    public int getVolume() {
        return volume;
    }
}
