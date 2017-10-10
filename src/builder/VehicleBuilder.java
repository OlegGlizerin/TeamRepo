package builder;

import enums.EModel;
import vehicleComponents.IComponent;

public class VehicleBuilder {

    EModel model;
    IComponent engine;
    IComponent wheel;

    public  VehicleBuilder(Builder builder){
        model=builder.model;
        engine=builder.engine;
        wheel=builder.wheel;
    }

    public static class  Builder{
        IComponent engine;
        IComponent wheel;
        EModel model;

        public Builder(EModel model){
            this.model=model;
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
