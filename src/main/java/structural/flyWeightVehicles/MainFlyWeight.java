package structural.flyWeightVehicles;

import vehicle.Models.Bikes.Bike;
import vehicle.enumsVehicle.EVehicleModel;
import structural.bridgeExportVehicles.exportVehicles.USAExporter;
import structural.proxy.proxys.HerzliaEnterpriseProxy;

public class MainFlyWeight {
    public static void main(String[] args) {

        //FlyWeight - print bikes hash code - In order to FlyWeight use a good compare in it's hashset, so I give some unique hash for each unique Vehicles
        //lets assume that vehicle type + model is a good hash
        HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
        herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.HONDA));
        herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.MAZDA));
        herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.MAZDA));
        herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.MAZDA));
        herzliaEnterpriseProxy.printNumberOfUniqueVehicles(); //prints 2 even though created 4


    }
}
