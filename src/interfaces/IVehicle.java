package interfaces;

import enums.EModel;
import enums.EType;

public interface IVehicle extends  Cloneable{

	void ablities();
	EModel getModel();
	EType getType();
	IVehicle clone() throws CloneNotSupportedException;
}
