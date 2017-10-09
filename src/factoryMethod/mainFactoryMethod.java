package factoryMethod;

import enums.EModel;
import enums.EType;
import interfaces.IVehicle;

public class mainFactoryMethod {

    public static void main(String[] args) {
        VehicleFactoryMethod factory=new VehicleFactoryMethod();
        IVehicle car=factory.buildPrivateCarVehicle(EModel.AUDI,EType.PRIVATE);
        System.out.println(car.getType());
        car.ablities();

    }
}
