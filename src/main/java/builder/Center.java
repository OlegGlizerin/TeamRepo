package builder;

import vehicle_properties.VehicleCategory;

//Director
public class Center {
    VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(VehicleBuilder builder) {
        vehicleBuilder = builder;
    }

    public Vehicle CreateVehicle(VehicleCategory category) {
        vehicleBuilder.buildType();
        vehicleBuilder.buildCategory(category);
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildDoors();
        vehicleBuilder.buildColor();

        return vehicleBuilder.getVehicle();
    }
}
