DROP DATABASE IF EXISTS juegodb;
CREATE DATABASE IF NOT EXISTS juegodb;
USE juegodb;

CREATE TABLE arma (
id_arma INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(128)
);

CREATE TABLE jugador (
id_jugador INT PRIMARY KEY AUTO_INCREMENT,
nickname VARCHAR(50),
id_arma_jugador INT,
FOREIGN KEY (id_arma_jugador) REFERENCES arma (id_arma)
);

CREATE TABLE partida (
id_partida INT PRIMARY KEY AUTO_INCREMENT,
id_jugador_partida INT,
FOREIGN KEY (id_jugador_partida) REFERENCES jugador (id_jugador),
bajas INT,
muertes INT
);