package composite;

import vehicleComponents.IComponent;

import java.util.ArrayList;

public class VehicleAssemblyComposite implements IComponent {

    private ArrayList<IComponent> components;
    private String name;

    public VehicleAssemblyComposite(String name){
        this.name=name;
        components=new ArrayList<>();
    }

    @Override
    public void build() {
        for (IComponent comp : components){
            comp.build();
        }
        System.out.println("The build finished");
    }

    public void add(IComponent comp){
        this.components.add(comp);
    }
}
