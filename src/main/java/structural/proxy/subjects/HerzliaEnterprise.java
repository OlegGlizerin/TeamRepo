package structural.proxy.subjects;

import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;

import java.util.HashSet;

public class HerzliaEnterprise implements IEnterprise {

    private final HashSet<IVehicle> vehicles = new HashSet<IVehicle>();


    public HerzliaEnterprise() {

    }

    /**
     * This is a specific enterprise located at herzlia
     * @param vehicle - a vehicle we want to build
     */



    private void add(IVehicle vehicle) {
        if(!vehicles.contains(vehicle)){
            vehicles.add(vehicle);
        }
    }

    @Override
    public IVehicle buildVehicleRegular(IVehicle vehicle) {
        vehicle.constructAll();
        add(vehicle);
        return vehicle;
    }


    public IVehicle getConstructedVehicle(EVehicleType vehicleType) {
        IVehicle vehicle = null;
        HashSet<IVehicle> iterateSet = vehicles;

        while((vehicle = iterateSet.iterator().next()) != null) {
            if(vehicle.getClass().getSimpleName().toUpperCase().equals(vehicleType.toString())) {
                return vehicle;
            }
            iterateSet.remove(vehicle);
        }
    return  null;
    }

    public HashSet<IVehicle> getVehicles() {
        return vehicles;
    }
}
