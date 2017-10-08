package factory_method;

public class TruckLineFactory implements VehicleProductionLineFactory {
    public VehicleProductionLine createProductionLine() {
        return new TruckLine();
    }
}
