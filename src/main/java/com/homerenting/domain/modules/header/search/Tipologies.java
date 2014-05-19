package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Tipologies {

    T1("t1"),
    T1_PLUS_1("t1+1"),
    T2("t2"),
    T2_PLUS_1("t2+1"),
    T3("t3"),
    T3_PLUS_1("t3+1"),
    T4("t4"),
    T4_PLUS_1("t4+1"),
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
