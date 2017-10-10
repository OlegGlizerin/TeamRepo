package structural.proxy.subjects;


import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;

import java.util.HashMap;

public class PetahTikvaEnterprise implements IEnterprise {

    private static final HashMap<EVehicleType, IVehicle> vehicles = new HashMap();

    /**
     * This is a specific enterprise located at PetahTikva
     * @param vehicle - a vehicle we want to build
     */
    @Override
    public IVehicle buildVehicleRegular(IVehicle vehicle) {
        if(vehicle.getVehicleType().equals(EVehicleType.BIKE) || vehicle.getVehicleType().equals(EVehicleType.PRIVATE) || vehicle.getVehicleType().equals(EVehicleType.TRUCK)) {
//            vehicle.construct();
            add(vehicle);
        }
        return vehicle;
    }


    private void add(IVehicle vehicle) {
        if(!this.vehicles.containsKey(vehicle.getClass().getSimpleName())) {
            this.vehicles.put(EVehicleType.getByType(vehicle.getVehicleType().name().toUpperCase()), vehicle);
        }
    }

    public IVehicle getConstructedVehicle(EVehicleType vehicleType) {
        for(IVehicle vehicle: vehicles.values()) {
            if(vehicle.getClass().getSimpleName().equals(vehicleType)) {
                return vehicle;
            }
        }
        return null;
    }
}
