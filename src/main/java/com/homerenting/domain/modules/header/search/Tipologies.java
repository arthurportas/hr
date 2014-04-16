package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Tipologies {

    T1("t1"),
    T2("t2"),
    T3("t3"),
    T4("t4"),
    T5("t5"),
    T6("t6");

    private final String tipology;

    private Tipologies(String tipology) {
        this.tipology = tipology;
    }

    public String getValue(){
        return this.tipology;
    }
}
