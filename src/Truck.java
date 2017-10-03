
public class Truck implements Vehicle{

	
	private Engine engine;
	private final int numOfWheels=8;
	private String logoCompany;
	
	public Truck (Engine engine, String logo){
		this.engine=engine;
		this.logoCompany=logo;
	}
	
	@Override
	public String getLogo() {
		return this.logoCompany;
	}

	@Override
	public int getNumWheels() {
		return numOfWheels;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

}
