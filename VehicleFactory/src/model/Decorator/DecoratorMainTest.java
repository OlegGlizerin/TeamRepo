package model.Decorator;

public class DecoratorMainTest {
    public DecoratorMainTest() {
        startTest();
    }

    private void startTest(){
        int[] rgbColors = {1,2,3};
        double tint = 0.75;
        MotorcyclePart motorcyclePart = new ColorDecorator(rgbColors,new TintDecorator(tint,new MotorcycleWindShield()));
    }
}
