package factory_method;

public class MotorbikeLineFactory implements VehicleProductionLineFactory{
    public VehicleProductionLine createProductionLine() {
        return new MotorbikeLine();
    }
}
