

public class PrivateCar implements ISport, INormal, IHover ,AbstractFactory{

	private EModel model;
	private EType type;

	public PrivateCar(EModel model, EType type){
		this.model=model;
		this.type=type;
	}


	public String toString(){
		return "This is a regular private car";
		
	}

	@Override
	public void hover() {
		System.out.println("this car can hover");
	}

	@Override
	public void normal() {
		System.out.println("this is normal");
	}

	@Override
	public void sport() {
		System.out.println("this is sport");
	}

	@Override
	public void ablities() {
		sport();
		normal();
		hover();
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
		System.out.println("built private car");
	}
}
