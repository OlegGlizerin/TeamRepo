
public class MotorBike implements Vehicle {

	private Engine engine;
	private  int numOfWheels;
	protected String logoCompany;
	
	
	public MotorBike(Engine engine,String logo){
		this.engine=engine;
		this.logoCompany=logo;
	}	
	
	@Override
	public String getLogo() {
		return this.logoCompany;
	}


	@Override
	public int getNumWheels() {
		return this.numOfWheels;
	}

	@Override
	public Engine getEngine() {
		return this.engine;
	}
	
	public String toString(){
		return "This is a regular motorbike";
	}

}
