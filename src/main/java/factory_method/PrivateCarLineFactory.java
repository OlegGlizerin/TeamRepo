package factory_method;

public class PrivateCarLineFactory implements VehicleProductionLineFactory{
    public VehicleProductionLine createProductionLine() {
        return new PrivateCarLine();
    }
}
