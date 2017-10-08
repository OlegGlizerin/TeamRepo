package model;

import model.eNums.eWheelNumber;

public abstract class Car extends Vehicle{
	public Car( ) {
		eWheelNum = eWheelNumber.CAR;
	}
	public void show() {
		super.show();
		System.out.println("Number of Wheels: " + eWheelNum.getNumOfWheels());
	}

}
