package model.concreteClasses;

import model.BuilderPattern.Engine;
import model.Flyweight.EngineFactory;
import model.Interfaces.IHoverable;
import model.Truck;
import model.eNums.ePowerType;
import model.eNums.eVehicleTypes;

public class HoverTruck extends Truck implements IHoverable {

	public HoverTruck() {
		engine = EngineFactory.getEngine(eVehicleTypes.HOVERTRUCK);

	}
	@Override
	public void hover() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		super.show();
		System.out.println("This is a hover Truck");
	}
	
}
