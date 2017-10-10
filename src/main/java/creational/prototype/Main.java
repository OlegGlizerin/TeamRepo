package creational.prototype;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Bikes.Bike;
import creational.toys.warehouse.herzlia.HerzliaWarehouse;
import structural.bridgeExportVehicles.exportVehicles.USAExporter;
import structural.proxy.proxys.HerzliaEnterpriseProxy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //build bike using factory method
        HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
        IVehicle vehicle = herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.HONDA));


        //prototype used, after we sell the car, we can create clone types of this car
        HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(herzliaEnterpriseProxy.getExporter());
        herzliaWarehouse.sellCar(vehicle);
        IVehicle vehicleCloned = herzliaWarehouse.getClone(vehicle.getVehicleType());

        System.out.println("Old:" + vehicle.getVehicleModel() + "," + vehicle.getVehicleType()
                + ", Cloned:" + vehicleCloned.getVehicleModel() + "," + vehicleCloned.getVehicleType());

    }
}
