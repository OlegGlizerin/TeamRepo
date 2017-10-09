package vehicleComponents;

public class Engine  implements IComponent {

	private String engineName;
	
	public Engine (String engineName){
		this.engineName=engineName;
	}
	
	public String toString(){
		return "The engine is: "+this.engineName;
	}

	@Override
	public void build() {
		System.out.println(this.engineName+" has been built");
	}
}
