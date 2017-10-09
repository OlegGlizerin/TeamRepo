package factory_method;

import vehicle_components.VehicleType;

public class Main {
    public static void main(String [] args)
    {
        PetahTikvaCenter ptCenter = new PetahTikvaCenter();
        ptCenter.createHoverCar(VehicleType.PRIVATE_CAR);

        HerzliyaCenter herzliyaCenter = new HerzliyaCenter();
        herzliyaCenter.createHoverCar(VehicleType.JEEP);

    }

}
