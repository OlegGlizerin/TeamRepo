package creational.abstractFactory.factoriesFamilies;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Privates.Private;

public class PrivateFactory implements IHerzliaFactory,IPetahTikvaFactory {
    @Override
    public IVehicle getVehicle(EVehicleModel model) {
        return new Private(model);
    }
}
