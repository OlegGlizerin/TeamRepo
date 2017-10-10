package model.eNums;

public enum eHerzeliaBuildableVehicles {
	ELECTRICCAR,SPORTCAR,SPORTMOTORCYCLE,FIELDMOTORCYCLE;
	
	public static boolean contains(String vehicleToCheck) {
		eHerzeliaBuildableVehicles vehicles[] = eHerzeliaBuildableVehicles.values();
		for(eHerzeliaBuildableVehicles vehicle : vehicles ) {
			if(vehicle.toString().equals(vehicleToCheck)) {
				return true;
			}
		}
		return false;
	}
	
}
