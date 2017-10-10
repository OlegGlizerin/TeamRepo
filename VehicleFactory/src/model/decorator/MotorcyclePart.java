package model.Decorator;

public abstract class MotorcyclePart {
    private Color partColor = null;
    private Tint partTint = null;

    public void setPartColor(Color partColor) {
        this.partColor = partColor;
    }

    public void setPartTint(Tint partTint) {
        this.partTint = partTint;
    }
}
