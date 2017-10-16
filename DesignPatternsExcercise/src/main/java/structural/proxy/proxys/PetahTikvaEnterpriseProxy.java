package structural.proxy.proxys;

import structural.bridgeExportVehicles.exportVehicles.IExporter;
import structural.proxy.subjects.IEnterprise;
import structural.proxy.subjects.PetahTikvaEnterprise;
import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;

public class PetahTikvaEnterpriseProxy implements IEnterprise {
    private PetahTikvaEnterprise petahTikvaEnterprise = null;
    protected IExporter iExporter = null;

    /**
     * Some strategy used here
     * @param iExporter - used for exporting the vehicles
     */
    public PetahTikvaEnterpriseProxy(IExporter iExporter) {
        this.iExporter = iExporter;
    }
    /**
     * Lets supose that to instantiate the enterprise is very expensive(as in the real world), so I'm using here the structural.proxy Pattern:
     * It holds the reference to the enterprise as a private member and instantiate it only once! and only when needed! How cool is that :)
     * If we look at this logicaly, it makes sense, supose we want instantiate The enterprise only once and use it, so structural.proxy Pattern fits here perfectly,
     * We now can instantiate some EnterpriseProxy and build as many vehicles as we want.
     * @param vehicle - is the vehicle we want to build
     */
    @Override
    public IVehicle buildVehicleRegular(IVehicle vehicle) {
        if(petahTikvaEnterprise == null) {
            petahTikvaEnterprise = new PetahTikvaEnterprise();
        }
        petahTikvaEnterprise.buildVehicleRegular(vehicle);
        return vehicle;
    }

    @Override
    public IVehicle getConstructedVehicle(EVehicleType type) {
        return petahTikvaEnterprise.getConstructedVehicle(type);
    }
}
