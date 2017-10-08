package abstract_factory;


public abstract class Engine {
    protected int volume;

    Engine() {
        initVolume();
        System.out.println(this.getClass().getName()+" was created.");
    }

    public int getVolume() {
        return volume;
    }

    abstract void initVolume();
}
