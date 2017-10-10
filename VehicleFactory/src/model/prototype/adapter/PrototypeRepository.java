package model.PrototypeAndAdapter;
import java.util.*;
public class PrototypeRepository {
    public static List<IPrototype> prototypeRepository = new ArrayList<>();
    public static void addPrototype(IPrototype prototype) {
        prototypeRepository.add(prototype);
    }
    public static IPrototype createPrototype(String name){
        IPrototype protoToReturn = null;
        for(IPrototype prototype : prototypeRepository){
            if(prototype.getName().equals(name)){
                protoToReturn = prototype.clone();
            }
        }
        System.out.println("name not found in repository");
        return protoToReturn;
    }

}
