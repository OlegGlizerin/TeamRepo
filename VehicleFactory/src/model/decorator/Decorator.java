package model.Decorator;

public abstract class Decorator extends MotorcyclePart{
    private MotorcyclePart part;
    private Color partColor;
    private Tint partTint;
    public Decorator(MotorcyclePart part){
        this.part = part;
    }

}
