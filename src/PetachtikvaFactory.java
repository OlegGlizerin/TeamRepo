import java.util.Hashtable;

public class PetachtikvaFactory {

    private static PetachtikvaFactory instance;
    private VehicleFactoryMethod factoryMethod;
    private Hashtable<Integer,IVehicle> warehouse=new Hashtable<>();


    private PetachtikvaFactory(){
    }

    public static PetachtikvaFactory getHerzeliaFactory(){
        if(instance==null)
            instance=new PetachtikvaFactory();
        return instance;
    }

    public IVehicle getProduct(IVehicle vehicle){
        if(EPetachtikvaTypes.contains(vehicle.getModel())){
            if(warehouse.contains(vehicle))
                return warehouse.get(vehicle.hashCode());
            else{
                warehouse.put(vehicle.hashCode(),vehicle);
            }
        }
        else{
            System.out.println("Petach  Tikva cant make this type of car");
            return null;
        }
        return vehicle;
    }
}
