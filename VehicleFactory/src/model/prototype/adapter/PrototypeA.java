package model.PrototypeAndAdapter;

//this is a concrete class the implements IPrototype
public class PrototypeA implements IPrototype{
    private final String name = "ProtoA";

    @Override
    public IPrototype clone() {
        return new PrototypeA();
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void execute() {
        System.out.println(name + ": is the current object we requested");
    }
}
