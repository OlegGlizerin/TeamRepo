package model.Facade;

public class Facade {
    private SomeDifficultClass someDifficultClass;
    public Facade() {
        this.someDifficultClass = new SomeDifficultClass();
    }
    public void doSimplefiedOperation() {
        someDifficultClass.SomeDifficultOperation();
    }
}
