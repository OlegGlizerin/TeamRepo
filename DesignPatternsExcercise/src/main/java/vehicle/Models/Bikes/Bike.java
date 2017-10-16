package vehicle.Models.Bikes;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.enumsVehicle.EVehicleType;
import vehicle.Abilities.ISport;
import vehicle.IVehicle;
import structural.decorator.withoutDecorator.VehicleMaker;
import vehicle.Abilities.IFourXFour;
import vehicle.Abilities.IHover;
import vehicle.Abilities.INorma;
import structural.decorator.IMaker;
import structural.decorator.withDecoratorAndDBUsage.VehicleMakerWithDB;

public class Bike implements ISport,IHover,INorma,IFourXFour,IVehicle {

    private IMaker maker = null;
    private EVehicleModel model = null;
    private boolean isConstructed = false;

    public Bike(EVehicleModel model) {
        maker = new VehicleMakerWithDB(new VehicleMaker());
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
    public void fourXfourAbility() {
        System.out.println("fourXfour ability.");
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


    /**
     * In order to FlyWeight use a good compare in it's hashset, so I give some unique hash for each unique Vehicles
     * @return unique number for bike (assume its a good hash)
     */
    @Override
    public int hashCode() {
        final int prime = getVehicleType().ordinal() + model.ordinal();
        return prime;
    }

    /**
     * Compares to IVehicles (for hashset comparing), used in FlyWeight design pattern
     * @param obj , it is some other IVehicle
     * @return true if the object are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IVehicle other = (Bike) obj;
        if (!getVehicleType().toString().toUpperCase().equals(other.getVehicleType().toString().toUpperCase()) && !model.equals(other.getVehicleModel()))
            return false;
        return true;
    }

    /**
     * Cloning the bike object for the creational.prototype design pattern
     * @return cloned Bike
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Bike.");
        return (IVehicle)super.clone();
    }

    @Override
    public IVehicle constructAll() {
        maker.buildVehicle();
        System.out.println("New " + model + " Bike has been created.");
        isConstructed = true;
        return this;
    }

    @Override
    public IVehicle makeBody() {
        return this;
    }

    @Override
    public IVehicle makeEngine() {
        return this;
    }

    @Override
    public IVehicle makeWheels() {
        return this;
    }

    @Override
    public IVehicle makeContent() {
        return this;
    }
}
