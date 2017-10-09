package vehicle_components;

public abstract class Wheel {
    protected int size;

    Wheel() {
        initSize();
    }

    public int getSize() {
        return size;
    }

    protected abstract void initSize();
}
