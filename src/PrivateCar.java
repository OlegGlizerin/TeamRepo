
public class PrivateCar implements Vehicle{

	protected Engine engine;
	private final int numOfWheels=4;
	protected  String logoCompany;
	
	public PrivateCar(Engine engine,String logo){
		this.engine=engine;
		logoCompany=logo;
	}
	
	@Override
	public String getLogo() {
		return logoCompany;
	}

	public int getNumWheels() {
		// TODO Auto-generated method stub
		return this.numOfWheels;
	}

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return engine;
	}

	public String toString(){
		return "This is a regular private car";
		
	}
}
