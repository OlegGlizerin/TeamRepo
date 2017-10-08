package VehicleInterfaces;

public interface IVehicle extends  Cloneable{

	void ablities();
	EModel getModel();
	EType getType();
	IVehicle clone() throws CloneNotSupportedException;
}
