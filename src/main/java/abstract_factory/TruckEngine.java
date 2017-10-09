package abstract_factory;

//ProductOne-PlatformOne
public class TruckEngine implements IEngine {
    private int volume;

    public TruckEngine() {
        volume = 2400;
    }

    public int getVolume() {
        return volume;
    }
}
