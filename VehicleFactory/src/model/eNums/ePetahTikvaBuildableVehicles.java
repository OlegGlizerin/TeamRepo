package model.eNums;

public enum ePetahTikvaBuildableVehicles {
	FIELDMOTORCYCLE,FIELDTRUCK,HOVERMOTORCYCLE,HOVERTRUCK,HOVERCAR;
	public static boolean contains(String vehicleToCheck) {
		ePetahTikvaBuildableVehicles vehicles[] = ePetahTikvaBuildableVehicles.values();
		for(ePetahTikvaBuildableVehicles vehicle : vehicles ) {
			if(vehicle.toString().equals(vehicleToCheck)) {
				return true;
			}
		}
		return false;
	}
}
