DROP DATABASE IF EXISTS db_obras_teatro;
CREATE DATABASE db_obras_teatro;
USE db_obras_teatro;


CREATE TABLE categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre_categoria VARCHAR(50)
);

CREATE TABLE obra (
    id_obra INT PRIMARY KEY AUTO_INCREMENT,
    nombre_obra VARCHAR(60),
    id_categoria INT,
    fecha_presentacion DATE,
    lugar_presentacion VARCHAR(100),
    duracion VARCHAR(100),
    actor_principal VARCHAR(100),
    FOREIGN KEY (id_categoria) REFERENCES categorias (id_categoria)
);



