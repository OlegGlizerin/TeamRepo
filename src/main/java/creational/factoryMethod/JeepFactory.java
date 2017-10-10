package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Jeeps.Jeep;

public class JeepFactory extends AbstractFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Jeep(model);
    }
}
