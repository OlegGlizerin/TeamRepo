package model.Interfaces;

import model.ObjectPoolPatternAndSingleton.PartWarehouse;
import model.Vehicle;
import model.eNums.eVehicleTypes;

public interface IVehicleFactory {
	Vehicle buildVehicle(eVehicleTypes vehicleType);
	default void orderVehicleToWarehouse(eVehicleTypes vehicleType) {
		Vehicle vehicle = buildVehicle(vehicleType);
		PartWarehouse.getInstance().insertVehicleIntoWarehouse(vehicle, vehicleType);
	}
	
}
