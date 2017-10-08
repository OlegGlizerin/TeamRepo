package model.PrototypeAndAdapter;

public class PrototypeCAdapter implements IPrototype {
    private PrototypeC adaptee;

    public PrototypeCAdapter(PrototypeC protoC){
        this.adaptee = protoC;
    }
    @Override
    public IPrototype clone() {
        return this;
    }

    @Override
    public String getName() {
        return adaptee.returnName();
    }

    @Override
    public void execute() {
        adaptee.doSomething();
    }
}
