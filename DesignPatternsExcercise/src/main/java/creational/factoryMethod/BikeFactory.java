package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Bikes.Bike;

public class BikeFactory extends AbstractFactory{

    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Bike(model);
    }
}
