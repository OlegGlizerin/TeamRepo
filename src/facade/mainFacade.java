package facade;

import vehicleComponents.Engine;
import vehicleComponents.Wheel;

public class mainFacade {

    public static void main(String[] args) {
        Facade f=new Facade(new Engine("Diesel"),new Wheel("Alloy"));
        f.buildAllComp();
    }
}
