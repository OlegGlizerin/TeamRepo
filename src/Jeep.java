
public class Jeep implements ISport, I4x4, INormal ,AbstractFactory{

    private EModel model;
    private EType type;

    public Jeep(EModel model, EType type){
        this.model=model;
        this.type=type;
    }

    @Override
    public void fourXfour() {
        System.out.println("this is a 4X4 Jeep");
    }

    @Override
    public void normal() {
        System.out.println("this is a normal jeep");
    }

    @Override
    public void sport() {
        System.out.println("this is a sport jeep");
    }

    @Override
    public void ablities() {
        fourXfour();
        normal();
        sport();
    }

    @Override
    public EModel getModel() {
        return this.model;
    }

    @Override
    public EType getType() {
        return this.type;
    }

    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override
    public void buildVehicle() {
        System.out.println("built Jeep");
    }
}
