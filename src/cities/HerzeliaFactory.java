package cities;

import enums.EHerzeliaTypes;
import factoryMethod.VehicleFactoryMethod;
import interfaces.IVehicle;

import java.util.Hashtable;



/*
use singeltone and object pool
 */


public class HerzeliaFactory {

    private static HerzeliaFactory instance;
    private VehicleFactoryMethod factoryMethod = new VehicleFactoryMethod();
    private IVehicle product;
    private Hashtable<Integer, IVehicle> warehouse = new Hashtable<>();


    private HerzeliaFactory() {
    }

    public static HerzeliaFactory getHerzeliaFactory() {
        if (instance == null)
            instance = new HerzeliaFactory();
        return instance;
    }

    public IVehicle getProduct(IVehicle vehicle) {
        if (EHerzeliaTypes.contains(vehicle.getModel())) {
            if (warehouse.contains(vehicle))
                return warehouse.get(vehicle.hashCode());
            else {
                warehouse.put(vehicle.hashCode(), vehicle);
            }
        } else {
            System.out.println("Herzelia cant make this type of car");
            return null;
        }
        return vehicle;
    }

}
