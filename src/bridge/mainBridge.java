package bridge;

import enums.EModel;
import interfaces.IVehicle;
import vehicleTypes.MotorBike;
import vehicleTypes.PrivateCar;

public class mainBridge  {

    public static void main(String[] args) {
        IVehicle vehicles[]=new IVehicle[]{new PrivateCar(EModel.AUDI),new MotorBike(EModel.BMW)};
        for (IVehicle vehicle: vehicles) {
            System.out.println(vehicle.getType());
        }
    }

}
