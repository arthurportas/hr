package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Parishes {

    NEVOGILDE("Nevogilde"),
    ALDOAR("Aldoar"),
    FOZ_DO_DOURO("Foz do douro"),
    RAMALDE("Ramalde"),
    MASSARELOS("Massarelos");

/*
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (1, 'Nevogilde', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (2, 'Aldoar', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (3, 'Foz do douro', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (4, 'Ramalde', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (5, 'Massarelos', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (6, 'Cedofeita', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (7, 'Miragaia', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (8, 'Lordelo do Ouro', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (9, 'Paranhos', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (10, 'Santo Ildefonso', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (11, 'Vitória', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (12, 'São Nicolau', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (13, 'Sé', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (14, 'Bonfim', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (15, 'Campanhã', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (16, 'União das freguesias de Aldoar, Foz do Douro e Nevogilde', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (17, 'União das freguesias de Cedofeita, Santo Ildefonso, Sé, Miragaia, são Nicolau e Vitória', 11);
INSERT INTO PARISH(PARISH_ID, PARISH_NAME, REGION_ID_FK) VALUES (18, 'União das freguesias de Lordelo do Ouro e Massarelos', 11);*/

    private final String value;

    private Parishes(String parish) {
        this.value = parish;
    }

    public String getValue(){
        return this.value;
    }
}
