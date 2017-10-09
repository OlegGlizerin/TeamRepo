package creational.objectPool;



import vehicle.IVehicle;


public class PooledVehicleObject {
    public IVehicle vehicle = null;

    public IVehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
    }
}
