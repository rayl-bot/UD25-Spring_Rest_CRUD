
DROP TABLE IF EXISTS `empleados`;
DROP TABLE IF EXISTS `departamentos`;

CREATE TABLE `departamentos` (
  `id` int auto_increment primary key,
  `nombre` varchar(100),
  `presupuesto` int
);

CREATE TABLE `empleados` (
  `DNI` varchar(8) primary key,
  `nombre` varchar(100),
  `apellidos` varchar(255),
  `cod_dept` int,
  foreign key(cod_dept) references departamentos(id)
);

INSERT INTO `departamentos` (nombre, presupuesto) Values("Investigacion", 20000);
INSERT INTO `departamentos` (nombre, presupuesto) Values("Desarrollo", 25000);
INSERT INTO `departamentos` (nombre, presupuesto) Values("Marketing", 15000);
INSERT INTO `departamentos` (nombre, presupuesto) Values("Direccion", 30000);

INSERT INTO `empleados` (DNI,nombre,apellidos,cod_dept) Values ("1234567Q","Alex","El Capo" ,1);
INSERT INTO `empleados` (DNI,nombre,apellidos,cod_dept) Values ("5463271G","Lucia","Lopez Degea" ,2);
INSERT INTO `empleados` (DNI,nombre,apellidos,cod_dept) Values ("7654321L","David","Rivera Artero", 3);
INSERT INTO `empleados` (DNI,nombre,apellidos,cod_dept) Values ("6342348K","Marta","Costa Martinez" ,4);