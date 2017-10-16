package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public abstract class AbstractFactory {
    public abstract IVehicle getVehicle(EVehicleModel model);
}
