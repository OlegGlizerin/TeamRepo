public class Wheel implements IComponent {

    private String wheelName;

    public Wheel (String wheelName){
        this.wheelName=wheelName;
    }

    public String toString(){
        return "The wheel is: "+this.wheelName;
    }

    @Override
    public void build() {
        System.out.println(this.wheelName+" has been built");
    }
}
