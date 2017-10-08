
public class MotorBike implements INormal, I4x4, ISport, IHover ,AbstractFactory{

	private EModel model;
	private EType type;

	public MotorBike(EModel model, EType type){
		this.model=model;
		this.type=type;
	}

	public String toString(){
		return "This is a  motorbike";
	}

	@Override
	public void fourXfour() {
		System.out.println("this is a 4x4 motorbike");
	}

	@Override
	public void hover() {
		System.out.println("this is a hover motorbike");
	}

	@Override
	public void normal() {
		System.out.println("this is a normal motorbike");
	}

	@Override
	public void sport() {
		System.out.println("this is a sport motorbike");
	}

	@Override
	public void ablities() {
		fourXfour();
		hover();
		normal();
		sport();
	}

	@Override
	public EModel getModel() {
		return this.model ;
	}

	@Override
	public EType getType() {
		return this.type;
	}

	@Override
	public IVehicle clone() throws CloneNotSupportedException {
		return this.clone();
	}

	@Override
	public void buildVehicle() {
		System.out.println("built MotorBike");
	}
}
