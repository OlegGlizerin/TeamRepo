package model.Decorator;

public class Color {
    private int R;
    private int G;
    private int B;

    public int getColorCode() {
        return 0; //just a test in reality would give out some other, better, representation of a Color class.
    }

    public Color(int red, int green, int blue){
        this.R=red;
        this.B = blue;
        this.G = green;

    }
}
