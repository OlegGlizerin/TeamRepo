package enums;

public enum EHerzeliaTypes {

    PRIVATE,MOTORBIKE,TRUCK;

    public static boolean contains(EModel modelCheck){
        for (EHerzeliaTypes model: EHerzeliaTypes.values()) {
            if(model.equals(modelCheck))return true;
        }
        return false;
    }
}
