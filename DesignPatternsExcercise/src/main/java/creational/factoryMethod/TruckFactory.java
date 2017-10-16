package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Trucks.Truck;

public class TruckFactory extends AbstractFactory{
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Truck(model);
    }
}
