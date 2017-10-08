package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.IElectric;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class ElectricCar extends Car implements IElectric{

	@Override
	public void defineElectricEngine() {
		engine = EngineFactory.getEngine(eVehicleTypes.ELECTRICCAR);
		
	}
	public void show() {
		super.show();
		System.out.println("This is an electric Car");
	}
}
