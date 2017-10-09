package builder;

import vehicle_properties.VehicleCategory;

public class Main {
    public static void main(String[] args) {
        Center director = new Center();
        JeepBuilder jeepBuilder = new JeepBuilder();
        director.setVehicleBuilder(jeepBuilder);
        director.CreateVehicle(VehicleCategory.SPORTS);

        PrivateCarBuilder privateBuilder = new PrivateCarBuilder();
        director.setVehicleBuilder(privateBuilder);
        director.CreateVehicle(VehicleCategory.SUV);
    }
}
