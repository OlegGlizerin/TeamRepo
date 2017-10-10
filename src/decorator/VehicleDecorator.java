package decorator;
import interfaces.IVehicle;
import enums.EModel;
import enums.EType;

public abstract class VehicleDecorator implements IVehicle {

    protected IVehicle vehicle;
    protected EModel model;
    protected EType type;


    public VehicleDecorator (IVehicle vehicle){
        this.vehicle=vehicle;
    }

    public void drive(){
        System.out.println("this vehicle can drive");
    }

    @Override
    public void ablities() {
        drive();
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
