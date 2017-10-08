package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.I4x4;
import model.Motorcycle;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class FieldMotorcycle extends Motorcycle implements I4x4{
	public FieldMotorcycle() {
		engine = EngineFactory.getEngine(eVehicleTypes.FIELDMOTORCYCLE);

	}
	@Override
	public void switchTo4x4() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a field Motorcycle");
	}
}
