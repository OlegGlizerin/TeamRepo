package prototype;

import vehicle_properties.VehicleCategory;

public class Main {
    public static void main(String[] args) {
        IPrototype motorbike = new Motorbike(VehicleCategory.NORMAL);
        IPrototype copiedMotorbike = motorbike.clone();

        IPrototype privateCar = new PrivateCar(VehicleCategory.SPORTS);
        IPrototype copiedPrivateCar = privateCar.clone();
    }
}
