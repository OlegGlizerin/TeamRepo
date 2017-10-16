package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public interface IHerzliaFactory {
    IVehicle getVehicle(EVehicleModel model);
}
