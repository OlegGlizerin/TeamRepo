package model.PrototypeAndAdapter;

public interface IPrototype {
    IPrototype clone();
    String getName();
    void execute();
}
