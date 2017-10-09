package proxy;

import enums.EModel;
import enums.EType;
import vehicleTypes.PrivateCar;

public class mainProxy {

    public static void main(String[] args) {
        PrivateCar pc=new PrivateCar(EModel.AUDI);
        pc.buildVehicle();
        ProxyVehicle.Driver driver=new ProxyVehicle.Driver(20);
        ProxyVehicle pv=new ProxyVehicle(EModel.AUDI,EType.PRIVATE,driver);
        pv.buildVehicle();
        System.out.println("could the driver have license?  "+ pv.canDrive());
    }
}
