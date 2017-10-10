package model;

import model.BuilderPattern.Engine;
import model.eNums.eWheelNumber;

public abstract class Vehicle {
	private String companyLogo = "W";
	protected eWheelNumber eWheelNum;
	protected Engine engine;
	public void show() {
		System.out.println("Company Logo: " + companyLogo);
		
	}
}
