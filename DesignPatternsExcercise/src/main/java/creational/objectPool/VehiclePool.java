package creational.objectPool;

import vehicle.IVehicle;

import java.util.*;


import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;


/**
 * Object pool design pattern to mange the PooledVehicleObjects, if somone asked for Bike, he will get it, but if he bring it back, that means some one else can take it instead.
 * Each object has its expiration time set for example to 10 seconds, if no one using it for 10 seconds it will be removed from the object pool.
 * expTime used to avoid objects explosion in the heap.
 */
public class VehiclePool {
    private static long expTime = 10000;//10 seconds
    public static HashMap<PooledVehicleObject, Long> availableMap = new HashMap<PooledVehicleObject, Long>();
    public static HashMap<PooledVehicleObject, Long> inUseMap = new HashMap<PooledVehicleObject, Long>();


    /**
     * Get new or existing object from the object pool
     * @param vehicle , checking if this param exists in the object pool
     * @return
     */
    public synchronized static PooledVehicleObject getObject(IVehicle vehicle) {
        long now = System.currentTimeMillis();

        if (!availableMap.isEmpty()) {
            for (Map.Entry<PooledVehicleObject, Long> entry : availableMap.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(availableMap);
                } else {
                    PooledVehicleObject pooledVehicleObject = popElement(availableMap, entry.getKey());
                    push(inUseMap, pooledVehicleObject, now);
                    return pooledVehicleObject;
                }
            }
        }
        // either no PooledVehicleObject is available or each has expired, so return a new one
        System.out.println("Get:" + vehicle.getVehicleType());
        return createPooledObject(vehicle, now);
    }

    /**
     * Init the new pooledVehicleObject because there is no available one.
     * @param vehicle - Vehicle vehicle to add to pooled items
     * @param now - now time of the system
     * @return return PooledVehicleObject that holds some vehicle
     */
    private synchronized static PooledVehicleObject createPooledObject(IVehicle vehicle, long now) {
        PooledVehicleObject pooledVehicleObject = new PooledVehicleObject();
        pooledVehicleObject.setVehicle(vehicle);
        push(inUseMap, pooledVehicleObject, now);
        return pooledVehicleObject;
    }

    /**
     * push  pooledVehicleObject to the map
     * @param map
     * @param pooledVehicleObject
     * @param now
     */
    private synchronized static void push(HashMap<PooledVehicleObject, Long> map,
                                          PooledVehicleObject pooledVehicleObject, long now) {
        map.put(pooledVehicleObject, now);
    }

    /**
     * release pooledVehicleObject
     * @param pooledVehicleObject
     */
    public static void releaseObject(PooledVehicleObject pooledVehicleObject) {
        System.out.println("Release:" + pooledVehicleObject.getVehicle().getVehicleType());
        cleanUp(pooledVehicleObject);
        availableMap.put(pooledVehicleObject, System.currentTimeMillis());
        inUseMap.remove(pooledVehicleObject);
    }

    /**
     * delete pooledVehicleObject
     * @param map
     * @return
     */
    private static PooledVehicleObject popElement(HashMap<PooledVehicleObject, Long> map) {
        Map.Entry<PooledVehicleObject, Long> entry = map.entrySet().iterator().next();
        PooledVehicleObject key= entry.getKey();
        //Long value=entry.getValue();
        map.remove(entry.getKey());
        return key;
    }

    private static PooledVehicleObject popElement(HashMap<PooledVehicleObject, Long> map, PooledVehicleObject key) {
        map.remove(key);
        return key;
    }


    public static void cleanUp(PooledVehicleObject pooledVehicleObject) {
        pooledVehicleObject.setVehicle(null);
    }

    public static void printInUse() {
        System.out.println("Number of objects in use: " + inUseMap.size());
    }
    public static void printAvailable() {
        System.out.println("Number of objects available for usage: " + availableMap.size());
    }
}
