package decorator;

import enums.EModel;
import enums.EType;
import interfaces.IVehicle;

public class VehicleDecoratorFly extends VehicleDecorator {

    public VehicleDecoratorFly(IVehicle vehicle){
        super(vehicle);
    }



    public void fly(){
        super.drive();
        System.out.println("now this car can also fly");
    }


    @Override
    public void ablities() {
        super.drive();
        this.fly();
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
