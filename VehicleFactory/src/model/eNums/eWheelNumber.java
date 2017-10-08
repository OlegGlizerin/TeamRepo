package model.eNums;

public enum eWheelNumber {
	CAR(4),TRUCK(8),MOTORCYCLE(2);
	private int numOfWheels;
	private eWheelNumber(int val) {
		this.numOfWheels = val;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
}
