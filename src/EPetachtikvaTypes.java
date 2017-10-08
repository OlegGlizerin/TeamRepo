public enum EPetachtikvaTypes {

    PRIVATE,MOTORBIKE,JEEP;

    public static boolean contains(EModel modelCheck){
        for (EHerzeliaTypes model: EHerzeliaTypes.values()) {
            if(model.equals(modelCheck))return true;
        }
        return false;
    }

}
