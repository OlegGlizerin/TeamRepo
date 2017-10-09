package structural.proxy.subjects;

import vehicle.IVehicle;
import vehicle.enumsVehicle.EVehicleType;


/**
 * The Enterprise Interface.
 */
public interface IEnterprise {
    IVehicle buildVehicleRegular(IVehicle vehicle);
    IVehicle getConstructedVehicle(EVehicleType type);
}
