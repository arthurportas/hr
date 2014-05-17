package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum EnergyEfficiency {

    A_PLUS("a+"),
    A("a"),
    B("b"),
    C("c"),
    D("d"),
    E("e"),
    F("f");

    private final String energyEfficiency;

    private EnergyEfficiency(String energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public String getValue(){
        return this.energyEfficiency;
    }
}
