package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.I4x4;
import model.Truck;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class FieldTruck extends Truck implements I4x4{

	public FieldTruck() {
		engine = EngineFactory.getEngine(eVehicleTypes.FIELDTRUCK);

	}
	@Override
	public void switchTo4x4() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a field Truck");
	}
}
