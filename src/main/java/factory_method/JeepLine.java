package factory_method;

import common.VehicleSubType;
import java.util.HashMap;

public class JeepLine extends VehicleProductionLine {
    protected void InitAllowedSubType() {
        vehicleSubType = new HashMap<VehicleSubType,Integer>();
        vehicleSubType.put(VehicleSubType.SPORTS,1);
        vehicleSubType.put(VehicleSubType.NORMAL,1);
        vehicleSubType.put(VehicleSubType.SUV,1);
    }
}

