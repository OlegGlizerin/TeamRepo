
public class AbstractFactory {
	
	enum VehiclesTypes {
	    PRIVATE_CAR, MOTOR_BIKE,TRUCK
	}

	
	private static final PrivateCarFactoryMethod PRIVATE_CAR_FACTORY = new PrivateCarFactoryMethod();
	private static final MotorBikeFactoryMethod MOTOR_BIKE_FACTORY = new MotorBikeFactoryMethod(); 
	
	
	public static AbstractFactory getFactory(VehiclesTypes vt){
		AbstractFactory factory = null;
		switch(vt){
			case PRIVATE_CAR:
				factory=PRIVATE_CAR_FACTORY;
				break;
			case MOTOR_BIKE:
				factory=MOTOR_BIKE_FACTORY;
				break;
		}
		
		return factory;	
	}
}
