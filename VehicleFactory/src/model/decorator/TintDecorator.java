package model.Decorator;

public class TintDecorator extends Decorator{
    private MotorcyclePart part;
    public TintDecorator(double tintType, MotorcyclePart part){
        super(part);
        part.setPartTint(new Tint(tintType));
    }
}
