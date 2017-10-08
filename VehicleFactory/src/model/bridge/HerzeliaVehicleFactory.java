package model.Bridge;

import model.Interfaces.IVehicleFactory;
import model.Vehicle;
import model.concreteClasses.ElectricCar;
import model.concreteClasses.FieldMotorcycle;
import model.concreteClasses.FieldTruck;
import model.concreteClasses.HoverCar;
import model.concreteClasses.HoverMotorcycle;
import model.concreteClasses.HoverTruck;
import model.concreteClasses.SportCar;
import model.concreteClasses.SportMotorcycle;
import model.eNums.eHerzeliaBuildableVehicles;
import model.eNums.eVehicleTypes;

public class HerzeliaVehicleFactory implements IVehicleFactory {
	private final String LOCATION = "Herzelia";

	@Override
	public Vehicle buildVehicle(eVehicleTypes vehicleType) {
		if (eHerzeliaBuildableVehicles.contains(vehicleType.toString())) {
			switch (vehicleType) {
			case ELECTRICCAR:
				return new ElectricCar();
			case FIELDMOTORCYCLE:
				return new FieldMotorcycle();
			case FIELDTRUCK:
				return new FieldTruck();
			case HOVERMOTORCYCLE:
				return new HoverMotorcycle();
			case HOVERTRUCK:
				return new HoverTruck();
			case SPORTCAR:
				return new SportCar();
			case SPORTMOTORCYCLE:
				return new SportMotorcycle();
			case HOVERCAR:
				return new HoverCar();
			default:
				return null;				
			}
		}
		else {
			System.out.println("Trying to build a vehicle in a facility that can't create such a type.");
			return null;
		}
	}

}
