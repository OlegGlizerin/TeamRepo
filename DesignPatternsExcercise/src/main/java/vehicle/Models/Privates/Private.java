package vehicle.Models.Privates;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.enumsVehicle.EVehicleType;
import vehicle.Abilities.ISport;
import vehicle.IVehicle;
import structural.decorator.withoutDecorator.VehicleMaker;
import vehicle.Abilities.IHover;
import vehicle.Abilities.INorma;
import structural.decorator.IMaker;
import structural.decorator.withDecoratorAndDBUsage.VehicleMakerWithDB;

public class Private implements ISport, IHover, INorma,IVehicle {

    private IMaker vehicleBaseWithDB = null;
    private EVehicleModel model = null;
    private boolean isConstructed = false;
    public Private(EVehicleModel model) {
        vehicleBaseWithDB = new VehicleMakerWithDB(new VehicleMaker());
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("drive ability...");
    }

    @Override
    public void hoverAbility() {
        System.out.println("fly ability.");
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
        hoverAbility();
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
        IVehicle other = (Private) obj;
        if (!getVehicleType().toString().toUpperCase().equals(other.getVehicleType().toString().toUpperCase()) && !model.equals(other.getVehicleModel()))
            return false;
        return true;
    }

    /**
     * Cloning the private object for the creational.prototype design pattern
     * @return cloned Private
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Private.");
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
        System.out.println("New " + model + " Private has been created.");
        isConstructed = true;
        return this;
    }
}
