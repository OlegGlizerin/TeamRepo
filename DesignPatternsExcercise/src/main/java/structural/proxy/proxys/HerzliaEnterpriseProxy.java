package structural.proxy.proxys;

import structural.bridgeExportVehicles.exportVehicles.IExporter;
import structural.proxy.subjects.HerzliaEnterprise;
import structural.proxy.subjects.IEnterprise;
import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;

public class HerzliaEnterpriseProxy implements IEnterprise {
    private HerzliaEnterprise herzliaEnterprise = null;
    protected IExporter iExporter = null;

    public HerzliaEnterpriseProxy() {
        if(herzliaEnterprise == null) {
            herzliaEnterprise = new HerzliaEnterprise();
        }
    }

    /**
     *
     * @param iExporter - used for exporting the vehicles
     */
    public HerzliaEnterpriseProxy(IExporter iExporter) {
        this.iExporter = iExporter;
        if(herzliaEnterprise == null) {
            herzliaEnterprise = new HerzliaEnterprise();
        }
    }

    /**
     * Lets supose that to instantiate the enterprise is very expensive(as in the real world), so I'm using here the structural.proxy Pattern:
     * It holds the reference to the enterprise as a private member and instantiate it only once!
     * If we look at this logicaly, it makes sense, supose we want instantiate The enterprise only once and use it, so structural.proxy Pattern fits here perfectly,
     * We now can instantiate some EnterpriseProxy and build as many vehicles as we want.
     * @param vehicle - is the vehicle we want to build
     */
    @Override
    public IVehicle buildVehicleRegular(IVehicle vehicle) {

        herzliaEnterprise.buildVehicleRegular(vehicle);
        return vehicle;
    }

    @Override
    public IVehicle getConstructedVehicle(EVehicleType type) {
        return herzliaEnterprise.getConstructedVehicle(type);
    }

    public IExporter getExporter() {
        return iExporter;
    }

    public void printNumberOfUniqueVehicles() {
        System.out.println(herzliaEnterprise.getVehicles().size());
    }



}
