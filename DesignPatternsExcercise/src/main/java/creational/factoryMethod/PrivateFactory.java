package creational.factoryMethod;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Privates.Private;

public class PrivateFactory extends AbstractFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Private(model);
    }
}
