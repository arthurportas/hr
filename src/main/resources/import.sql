-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'john smith', 'john.smith@mailinator.com', '2125551212');

--insert into User (id, firstName, lastName, email, address, zipcode, city, country, userKind, company, nif, phoneNumber, cellPhone, fax, password) values (0, 'arthur', 'portas', 'arthurportas@gmail.com', 'rua a voz dos ridiculos, 40, 1� h2', '4250551', 'porto', 'portugal', 'particular', '', '221446834', '220109606', '935705832', '', 'tretas');

--DISTRICT is equivalent to DISTRITO
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (1, 'Aveiro');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (2, 'Beja');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (3, 'Braga');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (4, 'Bragança');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (5, 'Castelo Branco');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (6, 'Coimbra');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (7, 'Évora');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (8, 'Faro');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (9, 'Guarda');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (10, 'Leiria');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (11, 'Lisboa');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (12, 'Portalegre');
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (13, 'Porto');
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
INSERT INTO DISTRICT(DISTRICT_ID, DISTRICT_NAME) VALUES (29, 'Ilha do Corvo');


--REGION is equivalent to CONCELHO
--PORTO
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (0, 'Amarante', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (1, 'Baião', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (2, 'Felgueiras', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (3, 'Gondomar', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (4, 'Lousada', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (5, 'Maia', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (6, 'Marco de Canavezes', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (7, 'Matosinhos', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (8, 'Paços de Ferreira', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (9, 'Paredes', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (10, 'Penafiel', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (11, 'Porto', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (12, 'Santo Tirso', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (13, 'Trofa', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (14, 'Valongo', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (15, 'Vila do Conde', 13);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (16, 'Vila Nova de Gaia', 13);
--Aveiro
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (17, 'Águeda', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (18, 'Albergaria-a-Velha', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (19, 'Anadia', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (20, 'Arouca', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (21, 'Aveiro', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (22, 'Castelo de Paiva', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (23, 'Espinho', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (24, 'Estarreja', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (25, 'Ílhavo', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (26, 'Mealhada', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (27, 'Murtosa', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (28, 'Oliveira de Azeméis', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (29, 'Oliveira do Bairro', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (30, 'Ovar', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (31, 'Santa Maria da Feira', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (32, 'São João da Madeira', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (33, 'Sever do Vouga', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (34, 'Vagos', 1);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (35, 'Vale de Cambra', 1);
--Beja
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (36, 'Aljustrel', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (37, 'Almodôvar', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (38, 'Alvito', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (39, 'Barrancos', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (40, 'Beja', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (41, 'Castro Verde', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (42, 'Cuba', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (43, 'Ferreira do Aletejo', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (44, 'Mértola', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (45, 'Moura', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (46, 'Odemira', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (47, 'Ourique', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (48, 'Serpa', 2);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (49, 'Vidigueira', 2);
--Braga
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (50, 'Amares', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (51, 'Barcelos', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (52, 'Braga', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (53, 'Cabeceiras de Basto', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (54, 'Celourico de Basto', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (55, 'Esposende', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (56, 'Fafe', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (57, 'Guimarães', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (58, 'Póvoa de Lanhoso', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (59, 'Terras de Bouro', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (60, 'Vieira do Minho', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (61, 'Vila Nova de Famalicão', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (62, 'Vila Verde', 3);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (63, 'Vizela', 3);
--Bragança
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (64, 'Alfandega da Fé', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (65, 'Bragança', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (66, 'Carrazeda de Ansiães', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (67, 'Freixo de Espada à Cinta', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (68, 'Macedo de Cavaleiros', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (69, 'Miranda do Douro', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (70, 'Mirandela', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (71, 'Mogadouro', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (72, 'Torre de Moncorvo', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (73, 'Vila Flor', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (74, 'Vimioso', 4);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (75, 'Vinhais', 4);
--Castelo Branco
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (76, 'Belmonte', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (77, 'Castelo Branco', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (78, 'Covilhã', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (79, 'Fundão', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (80, 'Idanha-a-Nova', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (81, 'Oleiros', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (82, 'Penamacor', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (83, 'Proença-a-Nova', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (84, 'Sertã', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (85, 'Vila de Rei', 5);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (86, 'Vila Velha de Ródão', 5);
--Coimbra
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (87, 'Arganil', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (88, 'Cantanhede', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (89, 'Coimbra', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (90, 'Condeixa-a-Nova', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (91, 'Figueira da Foz', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (92, 'Góis', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (93, 'Lousã', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (94, 'Mira', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (95, 'Miranda do Corvo', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (96, 'Montemor-o-Velho', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (97, 'Oliveira do hospital', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (98, 'Pampilhosa da Serra', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (99, 'Penacova', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (100, 'Penela', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (101, 'Soure', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (102, 'Tábua', 6);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (103, 'Vila Nova de Poiares', 6);
--Évora
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (104, 'Alandroal', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (105, 'Arraiolos', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (106, 'Borba', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (107, 'Estremoz', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (108, 'Évora', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (109, 'Montemor-o-Novo', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (110, 'Mora', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (111, 'Mourão', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (112, 'Portel', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (113, 'Redondo', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (114, 'Reguengos de Monsaraz', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (115, 'Vendas Novas', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (116, 'Viana do Alentejo', 7);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (117, 'Vila Viçosa', 7);
--Faro
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (118, 'Albufeira', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (119, 'Alcoutim', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (120, 'Aljezur', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (121, 'Castro Marim', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (122, 'Faro', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (123, 'Lagoa', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (124, 'Lagos', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (125, 'Loulé', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (126, 'Monchique', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (127, 'Olhão', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (128, 'Portimão', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (129, 'São Brás de Alportel', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (130, 'Silves', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (131, 'Tavira', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (132, 'Vila do Bispo', 8);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (133, 'Vila Real de Santo António', 8);
--Guarda
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (134, 'Aguiar da Beira', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (135, 'Almeida', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (136, 'Celourico da Beira', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (137, 'Figueira de Castelo Rodrigo', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (138, 'Fornos de Algodres', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (139, 'Gouveia', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (135, 'Guarda', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (136, 'Manteigas', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (137, 'Mêda', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (138, 'Pinhel', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (139, 'Sabugal', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (140, 'Seia', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (141, 'Trancoso', 9);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (142, 'Vila Nova de Foz Côa', 9);
--Leiria
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (143, 'Alcobaça', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (144, 'Alvaiázere', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (145, 'Ansião', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (146, 'Batalha', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (147, 'Bombarral', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (148, 'Caldas da Rainha', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (149, 'Castanheira de Pera', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (150, 'Figueiró dos Vinhos', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (151, 'Leiria', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (151, 'Marinha Grande', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (152, 'Nazaré', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (153, 'Óbidos', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (154, 'Pedrógão Grande', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (155, 'Peniche', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (156, 'Pombal', 10);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (157, 'Porto de Mós', 10);
--Lisboa
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (158, 'Alenquer', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (159, 'Amadora', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (160, 'Arruda dos Vinhos', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (161, 'Azambuja', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (162, 'Cadaval', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (163, 'Cascais', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (164, 'Lisboa', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (165, 'Loures', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (166, 'Lourinhã', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (167, 'Mafra', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (168, 'Odivelas', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (168, 'Oeiras', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (169, 'Sintra', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (170, 'Sobral de Monte Agraço', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (171, 'Torres Vedras', 11);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (171, 'Vila Franca de Xira', 11);
--Portalegre
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (172, 'Alter do Chão', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (173, 'Arronches', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (174, 'Avis', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (175, 'Campo Maior', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (176, 'Castelo de Vide', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (177, 'Crato', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (178, 'Elvas', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (179, 'Fronteira', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (180, 'Gavião', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (181, 'Marvão', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (182, 'Monforte', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (183, 'Nisa', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (184, 'Ponte de Sôr', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (185, 'Portalegre', 12);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (186, 'Sousel', 12);
--Santarém
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (187, 'Abrantes', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (188, 'Alcanena', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (189, 'Almeirim', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (190, 'Alpiarça', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (191, 'Benavente', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (192, 'Cartaxo', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (193, 'Chamusca', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (194, 'Constância', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (195, 'Coruche', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (196, 'Entroncamento', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (197, 'Ferreira do Zêzere', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (198, 'Golegã', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (199, 'Mação', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (200, 'Ourém', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (201, 'Rio Maior', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (202, 'Salvaterra de Magos', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (203, 'Santarém', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (204, 'Sardoal', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (205, 'Tomar', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (206, 'Torres Novas', 14);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (207, 'Vila Nova da Barquinha', 14);
--Setúbal
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (208, 'Alcácer do Sal', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (209, 'Alcochete', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (210, 'Almada', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (211, 'Barreiro', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (212, 'Grândola', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (213, 'Moita', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (214, 'Montijo', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (215, 'Palmela', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (216, 'Santiago do Cacém', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (217, 'Seixal', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (218, 'Sesimbra', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (219, 'Setúbal', 15);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (220, 'Sines', 15);
--Viana do Castelo
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (221, 'Arcos de Valdevez', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (222, 'Caminha', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (223, 'Melgaço', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (224, 'Monção', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (225, 'Paredes de Coura', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (226, 'Ponte da Barca', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (227, 'Ponte de Lima', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (228, 'Valença', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (229, 'Viana do Castelo', 16);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (230, 'Vila Nova de Cerveira', 16);
--Vila Real
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (231, 'Alijó', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (232, 'Boticas', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (233, 'Chaves', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (234, 'Mesão Frio', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (235, 'Mondim de Basto', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (236, 'Montalegre', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (237, 'Murça', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (238, 'Peso da Régua', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (239, 'Ribeira de Pena', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (240, 'Sabrosa', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (241, 'Santa Marta de Penaguião', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (242, 'Valpaços', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (243, 'Vila Pouca de Aguiar', 17);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (244, 'Vila Real', 17);
--Viseu
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (245, 'Armamar', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (246, 'Carregal do Sal', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (247, 'Castro Daire', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (248, 'Cinfães', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (249, 'Lamego', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (250, 'Mangualde', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (251, 'Moimenta da Beira', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (252, 'Mortágua', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (253, 'Nelas', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (254, 'Oliveira de Frades', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (255, 'Penalva do Castelo', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (256, 'Penedono', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (257, 'Resende', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (258, 'Santa Comba Dão', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (259, 'São João da Pesqueira', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (260, 'São Pedro do Sul', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (261, 'Sátão', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (262, 'Sernancelhe', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (263, 'Tabuaço', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (264, 'Tarouca', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (265, 'Tondela', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (266, 'Vila Nova de Paiva', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (267, 'Viseu', 18);
INSERT INTO REGION(REGION_ID, REGION_NAME, DISTRICT_ID) VALUES (268, 'Vouzela', 18);


INSERT INTO PROPERTY(PROPERTY_ID, PROPERTY_NAME, PROPERTY_KIND) VALUES (1, 'apartment', 'apartment');
INSERT INTO PROPERTY(PROPERTY_ID, PROPERTY_NAME, PROPERTY_KIND) VALUES (2, 'apartment', 'village');

CREATE  TABLE USERS (
  USERS_USERNAME TEXT NOT NULL ,
  USERS_PASSWORD TEXT NOT NULL ,
  USERS_ENABLED INT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (USERS_USERNAME));




































































































































































































































































--PARISH is equivalent to FREGUESIA
INSERT INTO PARISH(id, name) VALUES (0, 'ramalde');
INSERT INTO PARISH(id, name) VALUES (1, 'aldoar');
INSERT INTO PARISH(id, name) VALUES (2, 'paranhos');
INSERT INTO PARISH(id, name) VALUES (3, 'cedofeita');
INSERT INTO PARISH(id, name) VALUES (4, 'sé');