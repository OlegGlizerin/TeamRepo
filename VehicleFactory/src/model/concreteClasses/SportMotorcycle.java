package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.ISport;
import model.Motorcycle;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class SportMotorcycle extends Motorcycle implements ISport{

	public SportMotorcycle() {
		engine = EngineFactory.getEngine(eVehicleTypes.SPORTMOTORCYCLE);

	}

	@Override
	public void sportDrive() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a sport Motorcycle");
	}
	
}
