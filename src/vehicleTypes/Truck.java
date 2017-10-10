package vehicleTypes;

import enums.EModel;
import enums.EType;
import interfaces.AbstractFactory;
import interfaces.INormal;
import interfaces.ISport;
import interfaces.IVehicle;

public class Truck implements ISport, INormal, AbstractFactory {

	private EModel model;
	private EType type;

	public Truck(EModel model){
		this.model=model;
		this.type=EType.TRUCK;
	}


	@Override
	public void normal() {
		System.out.println("this is a normal truck");
	}

	@Override
	public void sport() {
		System.out.println("this is a sport truck");
	}

	public String toString(){
		return "This is a truck";

	}

	@Override
	public void ablities() {
		normal();
		sport();
	}

	@Override
	public EModel getModel() {
		return this.model;
	}

	@Override
	public EType getType() {
		return this.type;
	}

	@Override
	public IVehicle clone() throws CloneNotSupportedException {
		return (Truck) super.clone();
	}

	@Override
	public void buildVehicle() {
		System.out.println("built vehicleTypes.Truck");
	}
}
