-- Crear la base de datos "practica"
CREATE DATABASE practica;

-- Usar la base de datos "practica"
USE practica;

-- Crear la tabla "arbol"
CREATE TABLE arbol (
  id INT PRIMARY KEY AUTO_INCREMENT,
  ruta_imagen TEXT,
  nombre_comun VARCHAR(255),
  tipo_flor VARCHAR(255),
  dureza_madera VARCHAR(255),
  Hojas INT,
  Altura VARCHAR(255)
);

-- Crear un usuario llamado "usuario_practica"
CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';

-- Otorgar todos los privilegios al usuario "usuario_practica" en la base de datos "practica"
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';