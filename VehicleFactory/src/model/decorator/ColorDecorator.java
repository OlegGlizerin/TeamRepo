package model.Decorator;

public class ColorDecorator extends Decorator {
    public ColorDecorator(int[] rgbVals,MotorcyclePart motorcyclePart){
        super(motorcyclePart);
        // add check to see if rgb is int[3]
        motorcyclePart.setPartColor(new Color(rgbVals[0],rgbVals[1],rgbVals[2]));
    }

}
