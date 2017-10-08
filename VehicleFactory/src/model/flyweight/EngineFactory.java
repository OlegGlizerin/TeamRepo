package model.Flyweight;

import model.BuilderPattern.Engine;
import model.concreteClasses.*;
import model.eNums.*;

import java.util.HashMap;

public class EngineFactory {
    private static final HashMap<eVehicleTypes,Engine> engineCache = new HashMap<>();

    public static Engine getEngine(eVehicleTypes eType) {
        Engine engine = engineCache.get(eType);
        if(engine != null) {
            return engine;
        }
        else {
            engine = buildCustomEngine(eType);
            engineCache.put(eType,engine);
        }
        return engine;
    }

    private static Engine buildCustomEngine(eVehicleTypes eType) {
        switch (eType) {
            case ELECTRICCAR:
                return new Engine.EngineBuilder(ePowerType.ELECTRIC)
                        .milage(0)
                        .efficiancy((float) 0.8)
                        .numberOfPistons(28)
                        .build();
            case FIELDMOTORCYCLE:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.4)
                        .numberOfPistons(14)
                        .build();
            case FIELDTRUCK:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.2)
                        .numberOfPistons(56)
                        .build();
            case HOVERMOTORCYCLE:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.7)
                        .numberOfPistons(14)
                        .build();
            case HOVERTRUCK:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.5)
                        .numberOfPistons(56)
                        .build();
            case SPORTCAR:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.9)
                        .numberOfPistons(36)
                        .build();
            case SPORTMOTORCYCLE:
                return new Engine.EngineBuilder(ePowerType.ELECTRIC)
                        .milage(0)
                        .efficiancy((float) 0.9)
                        .numberOfPistons(28)
                        .build();
            case HOVERCAR:
                return new Engine.EngineBuilder(ePowerType.GAS)
                        .milage(0)
                        .efficiancy((float) 0.8)
                        .numberOfPistons(28)
                        .build();
            default:
                return null;
        }
    }
}
