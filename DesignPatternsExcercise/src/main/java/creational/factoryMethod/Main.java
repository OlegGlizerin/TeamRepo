package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleType;

public class Main {
    public static void main(String[] args) {
        //build bike using factory method
        EVehicleType typeToCreate = EVehicleType.BIKE;
        AbstractFactory abstractFactory = null;

        if(typeToCreate.equals(EVehicleType.BIKE)) {
            abstractFactory = new BikeFactory();
        }
        else if(typeToCreate.equals(EVehicleType.PRIVATE)) {
            abstractFactory = new PrivateFactory();
        }
        else if(typeToCreate.equals(EVehicleType.JEEP)) {
            abstractFactory = new JeepFactory();
        }
        else if(typeToCreate.equals(EVehicleType.TRUCK)) {
            abstractFactory = new TruckFactory();
        }
    }
}
