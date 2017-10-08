
public class VehicleFactoryMethod extends AbstractFactory {

	private IVehicle vehicle;
	private EModel model;
	private EType type;

	public VehicleFactoryMethod( EModel model, EType type){
		this.model=model;
		this.type=type;
	}
	
	public IVehicle buildPrivateCarVehicle( EModel model, EType type){
		switch (type){
			case PRIVATE:
				this.vehicle=new PrivateCar(model,type);
				break;
			case MOTORBIKE:
				this.vehicle=new MotorBike(model,type);
				break;
			case TRUCK:
				this.vehicle=new Truck(model,type);
				break;
			case JEEP:
				this.vehicle=new Jeep(model,type);
				break;
		}
		return this.vehicle;
	}
	
}
