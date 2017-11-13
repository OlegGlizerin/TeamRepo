package structural.compositeVehicleStructure;

import structural.decorator.withoutDecorator.VehicleMaker;

public class Main {
    public static void main(String[] args) {

        //VehicleBodyComposite is a composite class that contains wheels engine and content
        VehicleMaker vehicleMaker = new VehicleMaker();
        vehicleMaker.buildVehicle();


    }
}
