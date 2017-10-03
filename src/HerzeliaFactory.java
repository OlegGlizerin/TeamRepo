
public class HerzeliaFactory {

	private static HerzeliaFactory instance;
	private PrivateCarFactoryMethod factoryMethod;
	private Vehicle product;
	
	private HerzeliaFactory(){
	}
	
	public static HerzeliaFactory getHerzeliaFactory(){
		if(instance==null)
			instance=new HerzeliaFactory();
		return instance;
	}

	enum VehiclesTypes {
	    PRIVATE_CAR, MOTOR_BIKE,TRUCK
	}
	
	

	
	public Vehicle buildVehicle(String vehicleType){
		factoryMethod=new PrivateCarFactoryMethod();
		product=factoryMethod.buildPrivateCarVehicle(vehicleType, "BMW");
		return product;
	}
}
