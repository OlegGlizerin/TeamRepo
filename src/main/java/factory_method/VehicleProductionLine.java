package factory_method;

import common.VehicleSubType;
import java.util.HashMap;

public abstract class VehicleProductionLine {
    protected HashMap<VehicleSubType, Integer> vehicleSubType;

    VehicleProductionLine() {
        InitAllowedSubType();
    }

    protected abstract void InitAllowedSubType();
}
