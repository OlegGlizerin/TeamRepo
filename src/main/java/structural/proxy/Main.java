package structural.proxy;

import structural.bridgeExportVehicles.exportVehicles.USAExporter;
import structural.proxy.proxys.HerzliaEnterpriseProxy;
import structural.proxy.subjects.HerzliaEnterprise;

public class Main {
    public static void main(String[] args) {
        //HerzliaEnterpriseProxy is a proxy for HerzliaEnterprise instead of using the HerzliaEnterprise directly
        HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
        herzliaEnterpriseProxy.printNumberOfUniqueVehicles();
    }
}
