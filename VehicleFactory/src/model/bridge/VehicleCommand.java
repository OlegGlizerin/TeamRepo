package model.Bridge;

import model.Interfaces.IVehicleFactory;
import model.ObjectPoolPatternAndSingleton.PartWarehouse;
import model.Vehicle;
import model.eNums.eHerzeliaBuildableVehicles;
import model.eNums.ePetahTikvaBuildableVehicles;
import model.eNums.eVehicleTypes;

public class VehicleCommand {
	public static Vehicle orderBuild(eVehicleTypes eType) {
		Vehicle vehicleToReturn = null;
		vehicleToReturn = PartWarehouse.getInstance().getVehicleFromWarehouse(eType);
		if(vehicleToReturn != null) {
			// we got the vehicle from warehouse, no need to create a new one
			return vehicleToReturn;
		}
		else {
			IVehicleFactory vehicleFactory = getConcreteFactoryInstance(eType);
			vehicleToReturn = vehicleFactory.buildVehicle(eType);
		}
		return vehicleToReturn;
	}

	public static void orderVehicleToWarehouse(eVehicleTypes eType) {
		IVehicleFactory vehicleFactory = getConcreteFactoryInstance(eType);
		vehicleFactory.orderVehicleToWarehouse(eType);
	}

	private static IVehicleFactory getConcreteFactoryInstance(eVehicleTypes eType) {
		if(eHerzeliaBuildableVehicles.contains(eType.toString()) ) {
			return new HerzeliaVehicleFactory();
		}
		else if(ePetahTikvaBuildableVehicles.contains(eType.toString())) {
			return new PetahTikvaVehicleFactory();
		}
		else {
			System.out.println("Trying to build a vehicle that isn't in the system"); // sanity check, won't get here
			return null;
		}
	}
}
