package vehicle.Models.Trucks;

import vehicle.IVehicle;
import structural.decorator.withoutDecorator.VehicleMaker;
import vehicle.enumsVehicle.EVehicleType;
import vehicle.Abilities.INorma;
import vehicle.Abilities.ISport;
import vehicle.enumsVehicle.EVehicleModel;
import structural.decorator.IMaker;

public class Truck implements ISport,INorma,IVehicle {

    private IMaker vehicleBaseWithDB = null;
    private EVehicleModel model = null;
    private boolean isConstructed = false;
    public Truck(EVehicleModel model) {
        vehicleBaseWithDB = new VehicleMaker(); //structural.decorator used here
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("drive ability...");
    }

    @Override
    public void normaAbility() {
        System.out.println("norma ability.");
    }

    @Override
    public void sportAbility() {
        System.out.println("sport ability.");
    }

    @Override
    public void printAbilities() {
        normaAbility();
        sportAbility();
        drive();
    }

    @Override
    public EVehicleModel getVehicleModel() {
        return model;
    }

    @Override
    public EVehicleType getVehicleType() {
        return EVehicleType.getByType(this.getClass().getSimpleName().toUpperCase());
    }
    @Override
    public boolean isConstructed() {
        return isConstructed;
    }

    @Override
    public int hashCode() {
        final int prime = getVehicleType().ordinal() + model.ordinal();
        return prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IVehicle other = (Truck) obj;
        if (!getVehicleType().toString().toUpperCase().equals(other.getVehicleType().toString().toUpperCase()) && !model.equals(other.getVehicleModel()))
            return false;
        return true;
    }

    /**
     * Cloning the truck object for the creational.prototype design pattern
     * @return cloned Truck
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Truck.");
        return this.clone();
    }

    @Override
    public IVehicle makeBody() {
        return null;
    }

    @Override
    public IVehicle makeEngine() {
        return null;
    }

    @Override
    public IVehicle makeWheels() {
        return null;
    }

    @Override
    public IVehicle makeContent() {
        return null;
    }

    @Override
    public IVehicle constructAll() {
        vehicleBaseWithDB.buildVehicle();
        System.out.println("New " + model + " Truck has been created.");
        isConstructed = true;
        return this;
    }
}
