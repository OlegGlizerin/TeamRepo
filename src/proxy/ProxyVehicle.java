package proxy;

import enums.EModel;
import enums.EType;
import interfaces.AbstractFactory;
import interfaces.IVehicle;

public class ProxyVehicle implements IVehicle, AbstractFactory {

    private EModel model;
    private EType type;
    private Driver driver;

    public ProxyVehicle(EModel model, EType type,Driver driver){
        this.model=model;
        this.type=type;
        this.driver=driver;
    }

    @Override
    public void buildVehicle() {
        System.out.println("built Proxy Vehicle");
    }

    public static class Driver
    {
        private int age ;

        public Driver(int age)
        {
            this.age = age;
        }

        public int getAge(){return age;}
        public void setAge(int age){this.age=age;}
    }

    public boolean canDrive(){
        if(driver.getAge()>=16) return  true;
        return false;
    }

    @Override
    public void ablities() {

    }

    @Override
    public EModel getModel() {
        return this.model;
    }

    @Override
    public EType getType() {
        return this.type;
    }

    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
