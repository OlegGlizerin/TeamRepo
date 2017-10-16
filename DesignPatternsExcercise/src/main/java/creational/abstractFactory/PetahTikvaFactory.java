package creational.abstractFactory;

import creational.abstractFactory.factoriesFamilies.IPetahTikvaFactory;
import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public class PetahTikvaFactory {
    private IPetahTikvaFactory vehicleFactory = null;

    public PetahTikvaFactory(IPetahTikvaFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }


    public IVehicle getVehicle(EVehicleModel model) {
        return vehicleFactory.getVehicle(model);
    }
}
