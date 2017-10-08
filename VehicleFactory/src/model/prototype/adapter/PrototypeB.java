package model.PrototypeAndAdapter;

public class PrototypeB implements IPrototype{
    private final String name="PrototypeB";

    @Override
    public IPrototype clone() {
        return new PrototypeB();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name + ": is the current object we requested");
    }
}
