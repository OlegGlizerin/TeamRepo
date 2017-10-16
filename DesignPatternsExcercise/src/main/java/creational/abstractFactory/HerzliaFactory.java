package creational.abstractFactory;

import creational.abstractFactory.factoriesFamilies.IHerzliaFactory;
import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

public class HerzliaFactory  {
    private IHerzliaFactory vehicleFactory = null;

    public HerzliaFactory(IHerzliaFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }


    public IVehicle getVehicle(EVehicleModel model) {
        return vehicleFactory.getVehicle(model).constructAll();
    }


}
