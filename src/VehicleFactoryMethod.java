import VehicleComponents.Engine;

public class PrivateCarFactoryMethod extends AbstractFactory {

	private IVehicle vehicle;
	private Engine engine;
	
	public IVehicle buildPrivateCarVehicle(String vehicle, String logo){
		switch (vehicle){
			case "private normal car": 
				this.vehicle=new PrivateCar(engine,logo);
				break;
			case "private sport car":
				this.vehicle=new PrivateCarSport(engine,logo);
				break;
			case "private hover car":
				this.vehicle=new Truck(engine,logo);
		}
		return this.vehicle;
	}
	
}
