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

CREATE TABLE tipoUsuario(
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
    tipoUsuario_fk INT,
    PRIMARY KEY (rut),
    FOREIGN KEY(paisRecidencia_fk)        REFERENCES pais(id),
    FOREIGN KEY(nacionalidad_fk)        REFERENCES nacionalidad(id),
    FOREIGN KEY(tipoUsuario_fk)        REFERENCES tipoUsuario(id)
    
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
