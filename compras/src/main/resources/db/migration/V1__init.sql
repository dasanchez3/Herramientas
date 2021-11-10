CREATE TABLE IF NOT EXISTS  cliente(
  id serial,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );
 CREATE TABLE IF NOT EXISTS  producto(
   id serial,
   nombre VARCHAR(45) NOT NULL,
   descripcion VARCHAR(45) NULL,
   PRIMARY KEY (id)
   );