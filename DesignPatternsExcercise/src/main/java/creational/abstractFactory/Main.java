package creational.abstractFactory;

import creational.abstractFactory.factoriesFamilies.BikeFactory;
import creational.abstractFactory.factoriesFamilies.IHerzliaFactory;
import vehicle.enumsVehicle.EVehicleModel;

public class Main {
    public static void main(String[] args) {

        //build bike using abstract factory
        IHerzliaFactory factory = new BikeFactory();
        HerzliaFactory herzliaFactory = new HerzliaFactory(factory);
        herzliaFactory.getVehicle(EVehicleModel.HONDA);
    }
}
