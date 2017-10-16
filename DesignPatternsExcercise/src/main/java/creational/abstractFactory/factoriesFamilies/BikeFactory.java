package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Bikes.Bike;

public class BikeFactory implements IHerzliaFactory, IPetahTikvaFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Bike(model);
    }
}
