package prototype;

import enums.EModel;
import interfaces.IVehicle;
import vehicleTypes.PrivateCar;

public class mainPrototype {

    public static void main(String[] args) {
        IVehicle car=new PrivateCar(EModel.AUDI);
        try {
            IVehicle car2=car.clone();
            System.out.println("car: "+car.toString());
            System.out.println("car2: "+car2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
