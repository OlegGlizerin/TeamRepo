package model.ObjectPoolPatternAndSingleton;

import model.Vehicle;

import java.util.HashMap;
import java.util.*;
import model.eNums.*;

public class PartWarehouse {
    private static PartWarehouse instance = null;
    private PartWarehouse(){}
    public static PartWarehouse getInstance(){
        if(instance == null) {
            instance = new PartWarehouse();
        }
        return instance;
    }
    private HashMap<eVehicleTypes,Stack<Vehicle>> warehouseHashMap = new HashMap<>();
    // for each vehicle type we will map out a Stack of Vehicles

    public Vehicle getVehicleFromWarehouse(eVehicleTypes eType){
        if(warehouseHashMap.get(eType) == null) {
            return null;
        }
        else {
            if(warehouseHashMap.get(eType).isEmpty()){
                return null;
            }
            else {
                return warehouseHashMap.get(eType).pop();
            }

        }
    }
    public void insertVehicleIntoWarehouse(Vehicle vehicle,eVehicleTypes eType) {
        Stack<Vehicle> vehicleStack = warehouseHashMap.get(eType);
        if( vehicleStack == null) {
            vehicleStack = new Stack<Vehicle>();
            vehicleStack.push(vehicle);
            warehouseHashMap.put(eType,vehicleStack);
        }
        else {
            if(vehicleStack.size() < 100 ){
                vehicleStack.push(vehicle);
                warehouseHashMap.put(eType,vehicleStack);
            }
        }
    }

}
