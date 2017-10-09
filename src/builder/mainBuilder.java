package builder;

import enums.EModel;
import vehicleComponents.Engine;
import vehicleComponents.Wheel;

public class mainBuilder {

    public static void main(String[] args) {
        VehicleBuilder vb = new VehicleBuilder.Builder(EModel.BMW).engine(new Engine("Diesel")).wheel(new Wheel("Alloy ")).build();

    }
}

