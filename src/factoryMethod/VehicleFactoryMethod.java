package factoryMethod;

import enums.EModel;
import enums.EType;
import interfaces.AbstractFactory;
import interfaces.IVehicle;
import vehicleTypes.Jeep;
import vehicleTypes.MotorBike;
import vehicleTypes.PrivateCar;
import vehicleTypes.Truck;

public class VehicleFactoryMethod implements AbstractFactory {

	private IVehicle vehicle;
	private EModel model;
	private EType type;

	public VehicleFactoryMethod( EModel model, EType type){
		this.model=model;
		this.type=type;
	}

	public VehicleFactoryMethod(){

	}
	
	public IVehicle buildPrivateCarVehicle( EModel model,EType type){
		switch (type){
			case PRIVATE:
				this.vehicle=new PrivateCar(model);
				break;
			case MOTORBIKE:
				this.vehicle=new MotorBike(model);
				break;
			case TRUCK:
				this.vehicle=new Truck(model);
				break;
			case JEEP:
				this.vehicle=new Jeep(model);
				break;
		}
		return this.vehicle;
	}

	@Override
	public void buildVehicle() {
		System.out.println("built in factory method");
	}
}
