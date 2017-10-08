package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.ISport;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class SportCar extends Car implements ISport{
	public SportCar() {
		engine = EngineFactory.getEngine(eVehicleTypes.SPORTCAR);

	}
	@Override
	public void sportDrive() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a sport Car");
	}

}
