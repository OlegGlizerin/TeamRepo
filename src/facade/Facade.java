package facade;

import vehicleComponents.Engine;
import vehicleComponents.Wheel;

public class Facade {

    private Engine engine;
    private Wheel wheel;

    public Facade(Engine engine,Wheel wheel){
        this.engine=engine;
        this.wheel=wheel;
    }

    public void buildAllComp(){
        this.wheel.build();
        this.engine.build();
    }
}
