package vehicle_components;

public abstract class Engine {
    protected int volume;

    Engine() {
        initVolume();
    }

    public int getVolume() {
        return volume;
    }

    protected abstract void initVolume();
}
