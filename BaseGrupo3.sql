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
  Altura INT
);

-- Crear un usuario llamado "usuario_practica"
CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';

-- Otorgar todos los privilegios al usuario "usuario_practica" en la base de datos "practica"
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';

INSERT INTO arbol (ruta_imagen, nombre_comun, tipo_flor, dureza_madera, Hojas, Altura)
VALUES
  ('https://th.bing.com/th/id/OIP.XTQqld83Ptwa02sr-8XlbQHaE7?pid=ImgDet&rs=1', 'Roble', 'No aplica', 'Dura', 100, 20),
  ('https://thumbs.dreamstime.com/b/%C3%A1rbol-de-pino-alto-fresco-54706497.jpg', 'Pino', 'No aplica', 'Blanda', 150, 25),
  ('https://todoviveros.com/wp-content/uploads/2021/03/MANZANO-1.jpg', 'Manzano', 'Rosada', 'Media', 80, 10),
  ('https://th.bing.com/th/id/R.3839a84a6e5cf73a8a2a932663b186e6?rik=pgUpBPGgdgWMFQ&riu=http%3a%2f%2fvitalaromaterapia.com%2fwp-content%2fuploads%2f2019%2f04%2fCedro_arbol.jpg&ehk=R5ESVAVRNtFWwcl3w3frt7oNp%2bmeWOpw2goRmPS8JGI%3d&risl=&pid=ImgRaw&r=0', 'Cedro', 'No aplica', 'Dura', 200, 30),
  ('https://th.bing.com/th/id/OIP.g4JEd3vCeZrlabCk6CpigwHaFf?pid=ImgDet&rs=1', 'Álamo', 'No aplica', 'Blanda', 90, 18),
  ('https://hablemosdeaves.com/wp-content/uploads/2020/12/%C3%81RBOL-DE-CEREZO-4.jpg', 'Cerezo', 'Blanca', 'Media', 120, 15),
  ('https://th.bing.com/th/id/R.e519e2277e6cf1dd41fb48c6055f7508?rik=bZU%2bLQy1kOCpvw&pid=ImgRaw&r=0', 'Caoba', 'No aplica', 'Dura', 180, 28),
  ('https://th.bing.com/th/id/R.f06ed7ad0c3444235f1d7fac1e5dcbf9?rik=ORaSF8dxpZ3IUw&riu=http%3a%2f%2fwww.gtush.com%2fwp-content%2fuploads%2f2018%2f05%2farbol-de-peras-perales-peral-vivero-suenos-del-alma-D_NQ_NP_728221-MLA20751145555_062016-F.jpg&ehk=jZrhK0Ao2AcXrtn7568cC3GGgpb6x%2bcY2FxGdP2ur18%3d&risl=&pid=ImgRaw&r=0', 'Peral', 'Blanca', 'Media', 70, 12),
  ('https://4.bp.blogspot.com/-Mui_uWl12yE/VWNDBM7Iq3I/AAAAAAAAKfk/RkjVLtdANZA/s320/abeto%2Brojo.jpg', 'Abeto', 'No aplica', 'Blanda', 110, 22),
  ('https://th.bing.com/th/id/R.9d16938c6b6964dbeb5cd35282049ab4?rik=QFDSN%2bXMDX2KDQ&pid=ImgRaw&r=0', 'Olivo', 'No aplica', 'Dura', 160, 26);
  
  
  