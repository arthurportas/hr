package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Regions {

    AMARANTE("Amarante"),
    BAIÃO("Baião"),
    FELGUEIRAS("Felgueiras"),
    GONDOMAR("Gondomar"),
    LOUSADA("Lousada"),
    MAIA("Maia"),
    MARCO_CANAVEZES("Marco de Canavezes"),
    MATOSINHOS("Matosinhos"),
    PAÇOS_FERREIRA("Paços de Ferreira"),
    PAREDES("Paredes"),
    PENAFIEL("Penafiel"),
    PORTO("Porto")
    ;

/*
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (6, 'Maia', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (7, 'Marco de Canavezes', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (8, 'Matosinhos', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (9, 'Paços de Ferreira', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (10, 'Paredes', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (11, 'Penafiel', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (12, 'Porto', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (13, 'Santo Tirso', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (14, 'Trofa', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (15, 'Valongo', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (16, 'Vila do Conde', 13);
    INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID_FK) VALUES (17, 'Vila Nova de Gaia', 13);*/

    private final String value;

    private Regions(String region) {
        this.value = region;
    }

    public String getValue(){
        return this.value;
    }
}
