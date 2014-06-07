package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Districts {

    AVEIRO("Aveiro"),
    BEJA("Beja"),
    BRAGA("Braga"),
    BRAGANÇA("Bragança"),
    CASTELO_BRANCO("Castelo branco"),
    COIMBRA("Coimbra"),
    ÉVORA("Évora"),
    FARO("Faro"),
    GUARDA("Guarda"),
    LEIRIA("Leiria"),
    LISBOA("Lisboa"),
    PORTALEGRE("Portalegre"),
    PORTO("Porto");
 /*

    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (14, 'Santarém');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (15, 'Setúbal');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (16, 'Viana do Castelo');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (17, 'Vila Real');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (18, 'Viseu');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (19, 'Ilha da Madeira');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (20, 'Ilha de Porto Santo');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (21, 'Ilha de Santa Maria');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (22, 'Ilha de São Miguel');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (23, 'Ilha Terceira');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (24, 'Ilha da Graciosa');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (25, 'Ilha de São Jorge');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (26, 'Ilha do Pico');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (27, 'Ilha do Faial');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (28, 'Ilha das Flores');
    INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (29, 'Ilha do Corvo');*/
    private final String value;

    private Districts(String district) {
        this.value = district;
    }

    public String getValue(){
        return this.value;
    }
}
