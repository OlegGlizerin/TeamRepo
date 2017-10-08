
public class Truck implements ISport, INormal,AbstractFactory {

	private EModel model;
	private EType type;

	public Truck(EModel model, EType type){
		this.model=model;
		this.type=type;
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
		return this.clone();
	}

	@Override
	public void buildVehicle() {
		System.out.println("built Truck");
	}
}
