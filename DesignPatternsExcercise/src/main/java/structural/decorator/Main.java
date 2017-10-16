package structural.decorator;

import creational.builder.Vehicle;
import structural.decorator.withDecoratorAndDBUsage.VehicleMakerWithDB;
import structural.decorator.withoutDecorator.VehicleMaker;

public class Main {
    public static void main(String[] args) {
        //Without decorator
        VehicleMaker vehicleMaker = new VehicleMaker();
        vehicleMaker.buildVehicle();

        //With decorator, save to db method added
        VehicleMakerWithDB vehicleMakerWithDB = new VehicleMakerWithDB(vehicleMaker);
        vehicleMakerWithDB.buildVehicle();
    }
}
