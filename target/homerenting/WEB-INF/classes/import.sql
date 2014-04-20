-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'john smith', 'john.smith@mailinator.com', '2125551212');

--insert into User (id, firstName, lastName, email, address, zipcode, city, country, userKind, company, nif, phoneNumber, cellPhone, fax, password) values (0, 'arthur', 'portas', 'arthurportas@gmail.com', 'rua a voz dos ridiculos, 40, 1� h2', '4250551', 'porto', 'portugal', 'particular', '', '221446834', '220109606', '935705832', '', 'tretas');

--DISTRICT is equivalent to DISTRITO
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (1, 'Aveiro');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (2, 'Beja');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (3, 'Braga');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (4, 'Bragança');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (5, 'Castelo Branco');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (6, 'Coimbra');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (7, 'Évora');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (8, 'Faro');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (9, 'Guarda');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (10, 'Leiria');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (11, 'Lisboa');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (12, 'Portalegre');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (13, 'Porto');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (14, 'Santarém');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (15, 'Setúbal');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (16, 'Viana do Castelo');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (17, 'Vila Real');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (18, 'Viseu');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (19, 'Ilha da Madeira');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (20, 'Ilha de Porto Santo');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (21, 'Ilha de Santa Maria');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (22, 'Ilha de São Miguel');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (23, 'Ilha Terceira');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (24, 'Ilha da Graciosa');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (25, 'Ilha de São Jorge');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (26, 'Ilha do Pico');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (27, 'Ilha do Faial');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (28, 'Ilha das Flores');
INSERT INTO DISTRICT(DISTRICT_ID, name) VALUES (29, 'Ilha do Corvo');


--REGION is equivalent to CONCELHO
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (0, 'Amarante', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (1, 'Baião', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (2, 'Felgueiras', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (3, 'Gondomar', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (4, 'Lousada', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (5, 'Maia', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (6, 'Marco de Canavezes', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (7, 'Matosinhos', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (8, 'Paços de Ferreira', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (9, 'Paredes', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (10, 'Penafiel', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (11, 'Porto', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (12, 'Santo Tirso', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (13, 'Trofa', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (14, 'Valongo', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (15, 'Vila do Conde', 13);
INSERT INTO REGION(REGION_ID, name, DISTRICT_ID) VALUES (16, 'Vila Nova de Gaia', 13);

--PARISH is equivalent to FREGUESIA
INSERT INTO PARISH(id, name) VALUES (0, 'ramalde');
INSERT INTO PARISH(id, name) VALUES (1, 'aldoar');
INSERT INTO PARISH(id, name) VALUES (2, 'paranhos');
INSERT INTO PARISH(id, name) VALUES (3, 'cedofeita');
INSERT INTO PARISH(id, name) VALUES (4, 'sé');