package decorator;

import enums.EModel;
import enums.EType;
import vehicleTypes.PrivateCar;


public class mainDecorator {

    public static void main(String[] args) {
        VehicleDecoratorFly vd=new VehicleDecoratorFly(new PrivateCar(EModel.AUDI));
        vd.fly();
    }

}
