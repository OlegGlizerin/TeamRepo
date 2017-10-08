package factory_method;

public class JeepLineFactory implements VehicleProductionLineFactory{
    public VehicleProductionLine createProductionLine() {
        return new JeepLine();
    }
}
