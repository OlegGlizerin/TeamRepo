import creational.objectPool.PooledVehicleObject;
import creational.objectPool.VehiclePool;
import structural.bridgeExportVehicles.exportVehicles.USAExporter;
import structural.proxy.proxys.HerzliaEnterpriseProxy;
import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;
import vehicle.Models.Bikes.Bike;
import vehicle.enumsVehicle.EVehicleModel;
import vehicle.Models.Trucks.Truck;
import org.testng.annotations.Test;
import structural.proxy.subjects.IEnterprise;


/**
 * Let's say the client want to build a vehicle,
 * so we give him the FacadeAdapterDecoratorVehicleMaker that easy can make a good vehicle with it's identical abilities.
 * Structural patterns used (Adapter,Facade,Decorator,structural.proxy,FlyWeight,Bridge,Composite) , also creational pattern used (creational.builder,Prototype,Abstract Factory) .
 */
public class TestPatterns {

   @Test
    public void carBuildTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {
      IEnterprise herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
      herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Truck(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicleRegular(new Truck(EVehicleModel.HONDA));



       IVehicle vehicle = herzliaEnterpriseProxy.getConstructedVehicle(EVehicleType.BIKE);
//       herzlia herzliaWarehouse = new herzlia(new USAExporter());
//       herzliaWarehouse.sellCar(vehicle);
//
//       vehicle = herzliaEnterpriseProxy.getVehicle(EVehicleType.TRUCK);
//       herzliaWarehouse.sellCar(vehicle);

//       IVehicle vehicle1 = herzliaWarehouse.getClone(EVehicleType.BIKE);



//       herzliaWarehouse.buildToyWithBuilder(vehicle);
//
//       herzliaWarehouse.buildToyWithFactory(vehicle);

           PooledVehicleObject pooledVehicleObject = VehiclePool.getObject(vehicle);
           PooledVehicleObject pooledVehicleObject2 = VehiclePool.getObject(vehicle);
//           pooledVehicleObject.getToy().showProducts();
//           pooledVehicleObject.getToy().showCost();
           VehiclePool.releaseObject(pooledVehicleObject);
//           VehiclePool.cleanUp(pooledVehicleObject);


    }
}
