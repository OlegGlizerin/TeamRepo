import VehicleComponents.IComponent;

import java.util.ArrayList;

public class VehicleBuilder {

    IComponent engine;
    IComponent wheel;
    String name;

    public  VehicleBuilder(Builder builder){
        name=builder.name;
        engine=builder.engine;
        wheel=builder.wheel;
    }

    public static class  Builder{
        IComponent engine;
        IComponent wheel;
        String name;

        public Builder(String name){
            this.name=name;
        }

        public Builder engine(IComponent engine){
            this.engine=engine;
            return  this;
        }

        public Builder wheel(IComponent wheel){
            this.wheel=wheel;
            return  this;
        }

        public VehicleBuilder build(){
            return new VehicleBuilder(this);
        }
    }
}
