package model.concreteClasses;

import model.Car;
import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.IHoverable;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class HoverCar extends Car implements IHoverable {
	public HoverCar() {
		engine = EngineFactory.getEngine(eVehicleTypes.HOVERCAR);

	}
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Car");
	}
}
