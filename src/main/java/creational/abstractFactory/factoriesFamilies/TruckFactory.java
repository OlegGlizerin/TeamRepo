package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Trucks.Truck;

public class TruckFactory implements IPetahTikvaFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Truck(model);
    }
}
