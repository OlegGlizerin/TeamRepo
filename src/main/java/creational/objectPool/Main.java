package creational.objectPool;

import vehicle.enumsVehicle.EVehicleModel;
import vehicle.IVehicle;
import vehicle.Models.Bikes.Bike;
import vehicle.Models.Trucks.Truck;

public class Main {
    public static void main(String[] args) {
        //creating 2 vehicles
        IVehicle vehicleBike = new Bike(EVehicleModel.HONDA);
        IVehicle vehicleTruck = new Truck(EVehicleModel.HONDA);


        //creating toys from specific vehicles using object pool
        PooledVehicleObject pooledVehicleObjectFirst = VehiclePool.getObject(vehicleBike);
        VehiclePool.printInUse();
        VehiclePool.printAvailable();

        PooledVehicleObject pooledVehicleObjectSecond = VehiclePool.getObject(vehicleTruck);
        VehiclePool.printInUse();
        VehiclePool.printAvailable();

        VehiclePool.releaseObject(pooledVehicleObjectFirst);
        VehiclePool.printInUse();
        VehiclePool.printAvailable();
    }
}
