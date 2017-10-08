package abstract_factory;

public abstract class Wheel {
    protected int size;
 Wheel()
 {
     initSize();
     System.out.println(this.getClass().getName()+" was created.");
 }
    public int getSize() {
        return size;
    }

    abstract void initSize();
}
