package model;

import model.eNums.eWheelNumber;

public abstract class Motorcycle extends Vehicle {
	public Motorcycle() {
		eWheelNum = eWheelNumber.MOTORCYCLE;
		
	}
	public void show() {
		super.show();
		System.out.println("Number of Wheels: " + eWheelNum.getNumOfWheels());
	}
}
