package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public interface IPetahTikvaFactory {
    IVehicle getVehicle(EVehicleModel model);
}
