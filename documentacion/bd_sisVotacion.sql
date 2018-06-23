CREATE DATABASE sisVot_bd;

USE sisVot_bd;

-- DROP DATABASE sisVot_bd;


CREATE TABLE nacionalidad(
    id INT auto_increment,
    descripcion VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE pais(
    id INT auto_increment,
    descripcion VARCHAR(100),
    PRIMARY KEY (id)
);

-- Anteriormente llamado tipoUsuario
CREATE TABLE privilegio(
    id INT auto_increment,
    descripcion VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE persona(
    rut VARCHAR(13) UNIQUE,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    direccion VARCHAR(100),
    edad INT,
    paisRecidencia_fk INT,
    nacionalidad_fk INT,
    PRIMARY KEY (rut),
    FOREIGN KEY(paisRecidencia_fk)        REFERENCES pais(id),
    FOREIGN KEY(nacionalidad_fk)        REFERENCES nacionalidad(id)
);

CREATE TABLE cuenta(
    id INT AUTO_INCREMENT,
    rutPersona_fk VARCHAR(13) UNIQUE,
    pass VARCHAR (40),
    privilegio_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (privilegio_fk) REFERENCES privilegio(id),
    FOREIGN KEY (rutPersona_fk) REFERENCES persona(rut)
);


CREATE TABLE partido(
    id INT auto_increment,
    descripcion VARCHAR(100),
    anio_fundacion INT,
    PRIMARY KEY (id)
);

CREATE TABLE candidato(
    id INT auto_increment,
    partido_fk INT,
    persona_fk VARCHAR(100) UNIQUE,
    PRIMARY KEY (id),
    FOREIGN KEY(partido_fk)        REFERENCES partido(id),
    FOREIGN KEY(persona_fk)        REFERENCES persona(rut)
);


CREATE TABLE voto(
    id INT auto_increment,
    fecha_voto DATETIME,
    votante_fk VARCHAR(13),
    candidato_fk INT,
    PRIMARY KEY (id),
    FOREIGN KEY(votante_fk)        REFERENCES persona(rut),
    FOREIGN KEY(candidato_fk)        REFERENCES candidato(id)
);

-- INSERT

DELIMITER $$
CREATE PROCEDURE insert_pais_nacinalidad (IN pa VARCHAR(100), IN na VARCHAR(100))
BEGIN
    INSERT INTO pais VALUES(null, pa);
    INSERT INTO nacionalidad VALUES(null, na);
END $$
DELIMITER $$





CALL insert_pais_nacinalidad('Afganistán'             ,'Afgana');
CALL insert_pais_nacinalidad('Albania'                ,'Albanesa');
CALL insert_pais_nacinalidad('Alemania'               ,'Alemana');
CALL insert_pais_nacinalidad('Andorra'                ,'Andorra');
CALL insert_pais_nacinalidad('Angola'                 ,'Angoleña');
CALL insert_pais_nacinalidad('Antigua y Barbuda'      ,'Antiguana');
CALL insert_pais_nacinalidad('Arabia Saudita'         ,'Saudí');
CALL insert_pais_nacinalidad('Argelia'                ,'Argelina');
CALL insert_pais_nacinalidad('Argentina'              ,'Argentina');
CALL insert_pais_nacinalidad('Armenia'                ,'Armenia');
CALL insert_pais_nacinalidad('Aruba'                  ,'Arubeña');
CALL insert_pais_nacinalidad('Australia'              ,'Australiana');
CALL insert_pais_nacinalidad('Austria'                ,'Austriaca');
CALL insert_pais_nacinalidad('Azerbaiyán'             ,'Azerbaiyana');
CALL insert_pais_nacinalidad('Bahamas'                ,'Bahameña');
CALL insert_pais_nacinalidad('Bangladés'              ,'Bangladesí');
CALL insert_pais_nacinalidad('Barbados'               ,'Barbadense');
CALL insert_pais_nacinalidad('Baréin'                 ,'Bareiní');
CALL insert_pais_nacinalidad('Bélgica'                ,'Belga');
CALL insert_pais_nacinalidad('Belice'                 ,'Beliceña');
CALL insert_pais_nacinalidad('Benín'                  ,'Beninésa');
CALL insert_pais_nacinalidad('Bielorrusia'            ,'Bielorrusa');
CALL insert_pais_nacinalidad('Birmania'               ,'Birmana');
CALL insert_pais_nacinalidad('Bolivia'                ,'Boliviana');
CALL insert_pais_nacinalidad('Bosnia y Herzegovina'   ,'Bosnia');
CALL insert_pais_nacinalidad('Botsuana'               ,'Botsuana');
CALL insert_pais_nacinalidad('Brasil'                 ,'Brasileña');
CALL insert_pais_nacinalidad('Brunéi'                 ,'Bruneana');
CALL insert_pais_nacinalidad('Bulgaria'               ,'Búlgara');
CALL insert_pais_nacinalidad('Burkina Faso'           ,'Burkinés');
CALL insert_pais_nacinalidad('Burundi'                ,'Burundésa');
CALL insert_pais_nacinalidad('Bután'                  ,'Butanésa');
CALL insert_pais_nacinalidad('Cabo Verde'             ,'Caboverdiana');
CALL insert_pais_nacinalidad('Camboya'                ,'Camboyana');
CALL insert_pais_nacinalidad('Camerún'                ,'Camerunesa');
CALL insert_pais_nacinalidad('Canadá'                 ,'Canadiense');
CALL insert_pais_nacinalidad('Catar'                  ,'Catarí');
CALL insert_pais_nacinalidad('Chad'                   ,'Chadiana');
CALL insert_pais_nacinalidad('Chile'                  ,'Chilena');
CALL insert_pais_nacinalidad('China'                  ,'China');
CALL insert_pais_nacinalidad('Chipre'                 ,'Chipriota');
CALL insert_pais_nacinalidad('Ciudad del Vaticano'    ,'Vaticana');
CALL insert_pais_nacinalidad('Colombia'               ,'Colombiana');
CALL insert_pais_nacinalidad('Comoras'                ,'Comorense');
CALL insert_pais_nacinalidad('Corea del Norte'        ,'Norcoreana');
CALL insert_pais_nacinalidad('Corea del Sur'          ,'Surcoreana');
CALL insert_pais_nacinalidad('Costa de Marfil'        ,'Marfileña');
CALL insert_pais_nacinalidad('Costa Rica'             ,'Costarricense');
CALL insert_pais_nacinalidad('Croacia'                ,'Croata');
CALL insert_pais_nacinalidad('Cuba'                   ,'Cubana');
CALL insert_pais_nacinalidad('Dinamarca'              ,'Danésa');
CALL insert_pais_nacinalidad('Dominica'               ,'Dominiqués');
CALL insert_pais_nacinalidad('Ecuador'                ,'Ecuatoriana');
CALL insert_pais_nacinalidad('Egipto'                 ,'Egipcia');

CALL insert_pais_nacinalidad('El Salvador'            ,'Salvadoreña');
CALL insert_pais_nacinalidad('Emiratos Árabes Unidos' ,'Emiratí');
CALL insert_pais_nacinalidad('Eritrea'                ,'Eritrea');
CALL insert_pais_nacinalidad('Eslovaquia'             ,'Eslovaca');
CALL insert_pais_nacinalidad('Eslovenia'              ,'Eslovena');
CALL insert_pais_nacinalidad('España'                 ,'Española');
CALL insert_pais_nacinalidad('Estados Unidos'         ,'Estadounidense');
CALL insert_pais_nacinalidad('Estonia'                ,'Estonia');
CALL insert_pais_nacinalidad('Etiopía'                ,'Etíope');
CALL insert_pais_nacinalidad('Filipinas'              ,'Filipina');
CALL insert_pais_nacinalidad('Finlandia'              ,'Finlandésa');
CALL insert_pais_nacinalidad('Fiyi'                   ,'Fiyiana');
CALL insert_pais_nacinalidad('Francia'                ,'Francésa');
CALL insert_pais_nacinalidad('Gabón'                  ,'Gabonésa');
CALL insert_pais_nacinalidad('Gambia'                 ,'Gambiana');
CALL insert_pais_nacinalidad('Georgia'                ,'Georgiana');
CALL insert_pais_nacinalidad('Gibraltar'              ,'Gibraltareña');
CALL insert_pais_nacinalidad('Ghana'                  ,'Ghanésa');
CALL insert_pais_nacinalidad('Granada'                ,'Granadina');
CALL insert_pais_nacinalidad('Grecia'                 ,'Griega');
CALL insert_pais_nacinalidad('Groenlandia'            ,'Groenlandésa');
CALL insert_pais_nacinalidad('Guatemala'              ,'Guatemalteca');
CALL insert_pais_nacinalidad('Guinea ecuatorial'      ,'Ecuatoguineana');
CALL insert_pais_nacinalidad('Guinea'                 ,'Guineana');
CALL insert_pais_nacinalidad('Guinea-Bisáu'           ,'Guineana');
CALL insert_pais_nacinalidad('Guyana'                 ,'Guyanesa');
CALL insert_pais_nacinalidad('Haití'                  ,'Haitiana');
CALL insert_pais_nacinalidad('Honduras'               ,'Hondureña');
CALL insert_pais_nacinalidad('Hungría'                ,'Húngara');
CALL insert_pais_nacinalidad('India'                  ,'Hindú');
CALL insert_pais_nacinalidad('Indonesia'              ,'Indonesia');
CALL insert_pais_nacinalidad('Irak'                   ,'Iraquí');
CALL insert_pais_nacinalidad('Irán'                   ,'Iraní');
CALL insert_pais_nacinalidad('Irlanda'                ,'Irlandésa');
CALL insert_pais_nacinalidad('Islandia'               ,'Islandésa');
CALL insert_pais_nacinalidad('Islas Cook'             ,'Cookiana');
CALL insert_pais_nacinalidad('Islas Marshall'         ,'Marshalésa');
CALL insert_pais_nacinalidad('Islas Salomón'          ,'Salomonense');
CALL insert_pais_nacinalidad('Israel'                 ,'Israelí');
CALL insert_pais_nacinalidad('Italia'                 ,'Italiana');
CALL insert_pais_nacinalidad('Jamaica'                ,'Jamaiquina');
CALL insert_pais_nacinalidad('Japón'                  ,'Japonésa');
CALL insert_pais_nacinalidad('Jordania'               ,'Jordana');
CALL insert_pais_nacinalidad('Kazajistán'             ,'Kazaja');
CALL insert_pais_nacinalidad('Kenia'                  ,'Keniata');
CALL insert_pais_nacinalidad('Kirguistán'             ,'Kirguisa');
CALL insert_pais_nacinalidad('Kiribati'               ,'Kiribatiana');
CALL insert_pais_nacinalidad('Kuwait'                 ,'Kuwaití');
CALL insert_pais_nacinalidad('Laos'                   ,'Laosiana');
CALL insert_pais_nacinalidad('Lesoto'                 ,'Lesotense');
CALL insert_pais_nacinalidad('Letonia'                ,'Letóna');
CALL insert_pais_nacinalidad('Líbano'                 ,'Libanésa');
CALL insert_pais_nacinalidad('Liberia'                ,'Liberiana');
CALL insert_pais_nacinalidad('Libia'                  ,'Libia');
CALL insert_pais_nacinalidad('Liechtenstein'          ,'Liechtensteiniana');
CALL insert_pais_nacinalidad('Lituania'               ,'Lituana');

CALL insert_pais_nacinalidad('Luxemburgo'             ,'Luxemburguésa');
CALL insert_pais_nacinalidad('Madagascar'             ,'Malgache');
CALL insert_pais_nacinalidad('Malasia'                ,'Malasia');
CALL insert_pais_nacinalidad('Malaui'                 ,'Malauí');
CALL insert_pais_nacinalidad('Maldivas'               ,'Maldiva');
CALL insert_pais_nacinalidad('Malí'                   ,'Maliense');
CALL insert_pais_nacinalidad('Malta'                  ,'Maltésa');
CALL insert_pais_nacinalidad('Marruecos'              ,'Marroquí');
CALL insert_pais_nacinalidad('Martinica'              ,'Martiniqués');
CALL insert_pais_nacinalidad('Mauricio'               ,'Mauriciana');
CALL insert_pais_nacinalidad('Mauritania'             ,'Mauritana');
CALL insert_pais_nacinalidad('México'                 ,'Mexicana');
CALL insert_pais_nacinalidad('Micronesia'             ,'Micronesia');
CALL insert_pais_nacinalidad('Moldavia'               ,'Moldava');
CALL insert_pais_nacinalidad('Mónaco'                 ,'Monegasca');
CALL insert_pais_nacinalidad('Mongolia'               ,'Mongola');
CALL insert_pais_nacinalidad('Montenegro'             ,'Montenegrina');
CALL insert_pais_nacinalidad('Mozambique'             ,'Mozambiqueña');
CALL insert_pais_nacinalidad('Namibia'                ,'Namibia');
CALL insert_pais_nacinalidad('Nauru'                  ,'Nauruana');
CALL insert_pais_nacinalidad('Nepal'                  ,'Nepalí');
CALL insert_pais_nacinalidad('Nicaragua'              ,'Nicarangüense');
CALL insert_pais_nacinalidad('Níger'                  ,'Nigeriana');
CALL insert_pais_nacinalidad('Nigeria'                ,'Nigeriana');
CALL insert_pais_nacinalidad('Noruega'                ,'Noruega');
CALL insert_pais_nacinalidad('Nueva Zelanda'          ,'Neozelandésa');
CALL insert_pais_nacinalidad('Omán'                   ,'Omaní');
CALL insert_pais_nacinalidad('Países Bajos'           ,'Neerlandésa');
CALL insert_pais_nacinalidad('Pakistán'               ,'Pakistaní');
CALL insert_pais_nacinalidad('Palaos'                 ,'Paluana');
CALL insert_pais_nacinalidad('Palestina'              ,'Palestina');
CALL insert_pais_nacinalidad('Panamá'                 ,'Panameña');
CALL insert_pais_nacinalidad('Papúa Nueva Guinea'     ,'Papú');
CALL insert_pais_nacinalidad('Paraguay'               ,'Paraguaya');
CALL insert_pais_nacinalidad('Perú'                   ,'Peruana');
CALL insert_pais_nacinalidad('Polonia'                ,'Polaca');
CALL insert_pais_nacinalidad('Portugal'               ,'Portuguésa');
CALL insert_pais_nacinalidad('Puerto Rico'            ,'Puertorriqueña');
CALL insert_pais_nacinalidad('Reino Unido'            ,'Británica');

CALL insert_pais_nacinalidad('República Centroafricana'           ,'Centroafricana');
CALL insert_pais_nacinalidad('República Checa'                    ,'Checa');
CALL insert_pais_nacinalidad('República de Macedonia'             ,'Macedonia');
CALL insert_pais_nacinalidad('República del Congo'                ,'Congoleña');
CALL insert_pais_nacinalidad('República Democrática del Congo'    ,'Congoleña');
CALL insert_pais_nacinalidad('República Dominicana'               ,'Dominicana');
CALL insert_pais_nacinalidad('República Sudafricana'              ,'Sudafricana');
CALL insert_pais_nacinalidad('Ruanda'                             ,'Ruandésa');
CALL insert_pais_nacinalidad('Rumanía'                            ,'Rumana');
CALL insert_pais_nacinalidad('Rusia'                              ,'Rusa');
CALL insert_pais_nacinalidad('Samoa'                              ,'Samoana');
CALL insert_pais_nacinalidad('San Cristóbal y Nieves'             ,'Cristobaleña');
CALL insert_pais_nacinalidad('San Marino'                         ,'Sanmarinense');
CALL insert_pais_nacinalidad('San Vicente y las Granadinas'       ,'Sanvicentina');
CALL insert_pais_nacinalidad('Santa Lucía'                        ,'Santalucense');
CALL insert_pais_nacinalidad('Santo Tomé y Príncipe'              ,'Santotomense');
CALL insert_pais_nacinalidad('Senegal'                            ,'Senegalésa');
CALL insert_pais_nacinalidad('Serbia'                             ,'Serbia');
CALL insert_pais_nacinalidad('Seychelles'                         ,'Seychellense');
CALL insert_pais_nacinalidad('Sierra Leona'                       ,'Sierraleonésa');
CALL insert_pais_nacinalidad('Singapur'                           ,'Singapurense');
CALL insert_pais_nacinalidad('Siria'                              ,'Siria');
CALL insert_pais_nacinalidad('Somalia'                            ,'Somalí');
CALL insert_pais_nacinalidad('Sri Lanka'                          ,'Ceilanésa');
CALL insert_pais_nacinalidad('Suazilandia'                        ,'Suazi');
CALL insert_pais_nacinalidad('Sudán del Sur'                      ,'Sursudanésa');
CALL insert_pais_nacinalidad('Sudán'                              ,'Sudanésa');
CALL insert_pais_nacinalidad('Suecia'                             ,'Sueca');
CALL insert_pais_nacinalidad('Suiza'                              ,'Suiza');
CALL insert_pais_nacinalidad('Surinam'                            ,'Surinamesa');
CALL insert_pais_nacinalidad('Tailandia'                          ,'Tailandésa');
CALL insert_pais_nacinalidad('Tanzania'                           ,'Tanzana');
CALL insert_pais_nacinalidad('Tayikistán'                         ,'Tayika');
CALL insert_pais_nacinalidad('Timor Oriental'                     ,'Timorense');
CALL insert_pais_nacinalidad('Togo'                               ,'Togolésa');
CALL insert_pais_nacinalidad('Tonga'                              ,'Tongana');
CALL insert_pais_nacinalidad('Trinidad y Tobago'                  ,'Trinitense');
CALL insert_pais_nacinalidad('Túnez'                              ,'Tunecina');
CALL insert_pais_nacinalidad('Turkmenistán'                       ,'Turcomana');
CALL insert_pais_nacinalidad('Turquía'                            ,'Turca');
CALL insert_pais_nacinalidad('Tuvalu'                             ,'Tuvaluana');
CALL insert_pais_nacinalidad('Ucrania'                            ,'Ucraniana');
CALL insert_pais_nacinalidad('Uganda'                             ,'Ugandésa');
CALL insert_pais_nacinalidad('Uruguay'                            ,'Uruguaya');
CALL insert_pais_nacinalidad('Uzbekistán'                         ,'Uzbeka');
CALL insert_pais_nacinalidad('Vanuatu'                            ,'Vanuatuense');
CALL insert_pais_nacinalidad('Venezuela'                          ,'Venezolana');
CALL insert_pais_nacinalidad('Vietnam'                            ,'Vietnamita');
CALL insert_pais_nacinalidad('Yemen'                              ,'Yemení');
CALL insert_pais_nacinalidad('Yibuti'                             ,'Yibutiana');
CALL insert_pais_nacinalidad('Zambia'                             ,'Zambiana');
CALL insert_pais_nacinalidad('Zimbabue'                           ,'Zimbabuense');



INSERT INTO privilegio VALUES(null,'Administrador');
INSERT INTO privilegio VALUES(null,'Normal');

INSERT INTO persona VALUES('19851468-3','Diego','Henríquez Miranda','Av España #90',20,39,39);
INSERT INTO persona VALUES('19851578-4','Nilsson','Loyola Ilabaca','Av Puente #69',20,39,39);

INSERT INTO cuenta VALUES(null,'19851578-4','admin',1);
INSERT INTO cuenta VALUES(null,'19851468-3','diego123',2);

INSERT INTO partido VALUES(null,'Partido por la Democracia',1987);
INSERT INTO partido VALUES(null,'Renovación Nacional',1987);
INSERT INTO partido VALUES(null,'Partido Socialista',1933);
INSERT INTO partido VALUES(null,'Partido Radical Socialdemócrata',1994);


SELECT * FROM pais;
SELECT * FROM nacionalidad;
