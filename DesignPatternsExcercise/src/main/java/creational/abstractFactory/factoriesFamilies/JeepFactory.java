package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Jeeps.Jeep;

public class JeepFactory implements IHerzliaFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Jeep(model);
    }
}
