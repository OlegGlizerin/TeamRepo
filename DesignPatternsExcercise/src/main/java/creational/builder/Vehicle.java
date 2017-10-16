package creational.builder;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;

import vehicle.Models.Bikes.Bike;


/**
 * Builder class is the it contains some vehicle in it
 */
public class Vehicle {
    private IVehicle vehicle = null;
    private EVehicleModel model = null;

    /**
     * creational.builder pattern used here to build a vehicle
     * Return - Builder which conatins some vehicle in it
     */
    public static abstract class AbstractBuilder {
        private EVehicleModel model = null;
        protected IVehicle vehicle = null;

        public AbstractBuilder buildEngine() {
            vehicle.makeEngine();
            return this;
        }
        public AbstractBuilder buildBody() {
            vehicle.makeBody();
            return this;
        }
        public AbstractBuilder buildContent() {
            vehicle.makeContent();
            return this;
        }
        public AbstractBuilder buildWheels() {
            vehicle.makeWheels();
            return this;
        }

        public EVehicleModel getModel() {
            return this.model;
        }

        public IVehicle getVehicle() {
            return vehicle;
        }
    }

    public static class BikeBuilder extends AbstractBuilder {

        public BikeBuilder(EVehicleModel model) {
            vehicle = new Bike(model);
        }
    }

    public static class JeepBuilder extends AbstractBuilder {

        public JeepBuilder(EVehicleModel model) {
            vehicle = new Bike(model);
        }

    }

    public static class TruckBuilder extends AbstractBuilder {

        public TruckBuilder(EVehicleModel model) {
            vehicle = new Bike(model);
        }

    }

    public static class PrivateBuilder extends AbstractBuilder {

        public PrivateBuilder(EVehicleModel model) {
            vehicle = new Bike(model);
        }

    }



    /**
     * Constructor is private because we want the client who uses the Builder, to use our creational.builder static class to create vehicles!
     * @param builder
     */
    private Vehicle(AbstractBuilder builder) {
        this.model = builder.model;
    }

    /**
     * Print abilities of the Vehicle after building
     */
    public void showAbilities() {
        vehicle.printAbilities();
    }

}
