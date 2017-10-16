package creational.builder;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public class Main {
    public static void main(String[] args) {

        IVehicle vehicle = new Vehicle.BikeBuilder(EVehicleModel.HONDA)
                .buildBody()
                .buildContent()
                .buildEngine()
                .buildWheels()
                .getVehicle();

    }
}
