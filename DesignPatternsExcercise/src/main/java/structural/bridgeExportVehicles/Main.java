package structural.bridgeExportVehicles;

import vehicle.enumsVehicle.EVehicleModel;
import structural.bridgeExportVehicles.exportVehicles.USAExporter;
import structural.proxy.proxys.HerzliaEnterpriseProxy;
import vehicle.Models.Bikes.Bike;

public class Main {
    public static void main(String[] args) {

        //Using some external class to export Vehicles, for example the USAExporter exports vehicles to usa.
        HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
        herzliaEnterpriseProxy.getExporter().export(new Bike(EVehicleModel.HONDA));
    }
}
