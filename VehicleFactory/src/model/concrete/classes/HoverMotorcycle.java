package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.IHoverable;
import model.Motorcycle;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class HoverMotorcycle extends Motorcycle implements IHoverable {
	public HoverMotorcycle() {
		engine = EngineFactory.getEngine(eVehicleTypes.HOVERMOTORCYCLE);

	}
	public void hover() {}
	public void show() {
		super.show();
		System.out.println("This is a hover Motorcycle");
	}
}
