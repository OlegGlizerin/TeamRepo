public abstract class VehicleDecorator implements  IVehicle {

    protected IVehicle vehicle;
    protected EModel model;
    protected EType type;


    public VehicleDecorator (IVehicle vehicle){
        this.vehicle=vehicle;
    }

    public void drive(){
        System.out.println("this vehicle can drive");
    }

}
