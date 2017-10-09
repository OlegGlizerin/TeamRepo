package composite;

import vehicleComponents.Engine;
import vehicleComponents.Wheel;

public class mainComposite {

    public static void main(String[] args) {
        VehicleAssemblyComposite vac=new VehicleAssemblyComposite("my car");
        vac.add(new Engine("fuel"));
        vac.add(new Wheel("Alloy"));
        vac.build();
    }
}
