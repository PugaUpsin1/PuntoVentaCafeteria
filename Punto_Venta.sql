create database Punto_Venta;

use Punto_Venta;

create table if not exists tipo_usuario(
id_tipo int auto_increment primary key not null,
nombre varchar (50) not null
);

create table if not exists usuarios (
idUsuario int auto_increment primary key not null ,
usuario varchar(30) not null,
nombre varchar (30) not null,
apellido varchar (30) not null,
tel varchar (30) not null,
password varchar(60) not null,
id_tipo int (11),

constraint fkusuarios_tipo
foreign key (id_tipo)
references tipo_usuario(id_tipo)
);

create table if not exists categoria_pr(
idCatego int auto_increment primary key not null,
Categoria varchar (45) not null
);

create table if not exists productos(
idProducto int auto_increment primary key not null,
nombre varchar (50) not null,
tamaño double not null,
unidad varchar (50) not null,
precioVent double not null,
idCatego int,

constraint fkcatego_prod
foreign key (idCatego)
references categoria_pr(idCatego)
);

create table if not exists inventario(
idInventario int auto_increment primary key not null,
nombre varchar (50) not null,
Cantidad double not null,
unidad varchar (50) not null,
PrecioUni double not null,
Proveedor varchar (50) not null
);


create table if not exists receta_prod(
id_ingrd int auto_increment primary key  not null,
ingrediente varchar (50) not null,
cantidad double not null,
unidad varchar (50) not null,
idProducto int not null,
idInventario int not null,

constraint  fkrecetaProd_producto
foreign key (idProducto)
references productos(idProducto)
ON DELETE cascade
ON UPDATE cascade,

constraint fkrecetaInv_inventario
foreign key (idInventario)
references inventario(idInventario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
);

create table if not exists Clientes(
idCliente int auto_increment primary key not null,
Nombre varchar (45) not null,
Apellidos varchar (45) not null,
Edad int (30) not null,
Telefono varchar (45) not null,
Email varchar (45) not null,
NumVisi int (30) not null
);

create table if not exists venta_estado(
idVE int auto_increment primary key not null,
Estado varchar (45) not null
);

create table if not exists metodo_pago(
idMP int auto_increment primary key not null,
Metodo varchar (45) not null
);	

create table if not exists ventas (
idVent int auto_increment primary key not null,
total double not null,
referencias varchar(45),
fecha timestamp DEFAULT CURRENT_TIMESTAMP(),
idVE int,
idMP int,
idCliente int,

constraint fkestado_ven
foreign key (idVE)
references venta_estado (idVE),

constraint fkmetodopago_ventas
foreign key (idMP)
references metodo_pago (idMP),

constraint fkClientes_ven
foreign key (idCliente)
references Clientes (idCliente)
);

create table if not exists venta_prod(
idVP int auto_increment primary key not null,
cantidad int (55),
idVent int,
idProducto int,

constraint  fkventaprodd_producto
foreign key (idProducto)
references productos(idProducto)
ON DELETE NO ACTION
ON UPDATE NO ACTION,

constraint fkventaprod_ventas
foreign key (idVent)
references ventas(idVent)
ON DELETE cascade
ON UPDATE cascade
);

create table if not exists Info(
idIn int auto_increment primary key,
mensaje varchar(90)
);

-- registros

INSERT INTO `tipo_usuario` (`id_tipo`, `nombre`) VALUES
(1, 'Administrador'),
(2, 'Usuario');

INSERT INTO `usuarios` (`idUsuario`, `usuario`, `nombre`, `apellido`, `tel`, `password`, `id_tipo`) VALUES
(1, 'admin', 'Issac', 'Puga', 'null', 'd033e22ae348aeb5660fc2140aec35850c4da997', 1),
(2, 'usr', 'Diana', 'Rice', 'null', 'd033e22ae348aeb5660fc2140aec35850c4da997', 2);

INSERT INTO `categoria_pr` (`idCatego`, `Categoria`) VALUES
(1, 'Cafe'),
(2, 'Galletas'),
(3, 'Té');

INSERT INTO `inventario` (`idInventario`, `nombre`, `Cantidad`, `unidad`, `PrecioUni`, `Proveedor`) VALUES
(1, 'Leche', 50, 'Litros', 10, 'Soriana'),
(2, 'Cafe', 20, 'Kilogramos', 5, 'Soriana'),
(3, 'Azucar Glass', 20, 'Kilogramos', 10, 'Sams'),
(4, 'Sal', 10, 'Kilogramos', 10, 'Sams'),
(5, 'Pimienta', 10, 'Kilogramos', 10, 'Sams'),
(6, 'Caramello', 20, 'Kilogramos', 10, 'Sams'),
(7, 'Vasos', 20, 'Kilogramos', 5, 'Sams'),
(8, 'Azucar Morena', 20, 'KIlogramos', 5, 'Soriana'),
(9, 'Cafe Capuccino', 20, 'Kilogramos', 10, 'Nescafe'),
(10, 'Cafe Irlandes', 20, 'Kilogramos', 10, 'Soriana'),
(11, 'Canela', 20, 'Kilogramos', 10, 'Fruteria'),
(12, 'Chocolate', 20, 'Kilogramos', 1, 'Sams'),
(13, 'Cocoa', 20, 'Kilogramos ', 12, 'Sams'),
(14, 'Te', 15, 'Kilogramos', 12, 'Sams'),
(15, 'Leche Desc', 12, 'Litros', 10, 'Soriana'),
(16, 'Leche Light', 20, 'Litros', 12, 'Soriana'),
(17, 'Mermelada', 10, 'Litros', 20, 'Soriana'),
(18, 'Jamon', 10, 'Kilogramos', 20, 'Soriaana'),
(19, 'Jamon', 10, 'Kilogramos', 20, 'Soriaana'),
(20, 'Aguacate', 20, 'Kilogramos', 60, 'Fruteria Macias');

INSERT INTO `productos` (`idProducto`, `nombre`, `tamaño`, `unidad`, `precioVent`, `idCatego`) VALUES
(1, 'Cafe Sencillo', 8, 'Onzas', 50, 1),
(1, 'Cafe Sencillo', 8, 'Onzas', 50, 1),
(2, 'Chai Latte', 8, 'Onzas', 60, 1),
(3, 'Galletas de Avena', 200, 'Gramos', 50, 2),
(4, 'Te de Manzanilla', 200, 'Gramos', 50, 3),
(5, 'Cafe Americano', 4, 'Onzas', 50, 1),
(6, 'Frapuccino Moka ', 8, 'Onzas', 80, 1),
(7, 'Cafe Expresso', 4, 'Onzas', 50, 1);

INSERT INTO `receta_prod` (`id_ingrd`, `ingrediente`, `cantidad`, `unidad`, `idProducto`, `idInventario`) VALUES
(1, 'Leche', 0.35, 'Litros', 1, 1),
(3, 'Leche', 0.5, 'Litros', 2, 1),
(4, 'Leche', 0.3, 'Litros', 5, 1),
(5, 'Cafe', 0.4, 'Kilogramos', 5, 2),
(6, 'Azucar Morena', 0.02, 'Kilogramos', 4, 8),
(7, 'Vasos', 1, 'Kilogramos', 4, 7),
(8, 'Cafe', 0.2, 'Litros', 1, 2),
(9, 'Leche', 1, 'Litros', 3, 1);

INSERT INTO `venta_estado` (`idVE`, `Estado`) VALUES
(1, 'Pendiente'),
(2, 'Terminada');

INSERT INTO `Clientes` (`idCliente`, `Nombre`, `Apellidos`, `Edad`, `Telefono`, `Email`, `NumVisi`) VALUES
(1, 'Predeterminado', '', '0', '0', '', 1),
(2, 'Alejandra', 'Alvarez', '22', '6699346578', 'ale@mail.com', 1),
(3, 'Justin', 'Hernandez', '20', '6692452365', 'justin@mail.com', 1),
(4, 'Julieta', 'Alvarez', '21', '6699343434', 'yuli@mail.com', 1);

INSERT INTO `metodo_pago` (`idMP`, `Metodo`) VALUES
(1, 'Efectivo'),
(2, 'Tarjeta');

INSERT INTO `ventas` (`idVent`, `total`, `referencias`, `fecha`, `idVE`, `idMP`, `idCliente`) VALUES
(37, 200, NULL, '2023-02-10 06:46:52', 2, 1, 1),
(38, 100, NULL, '2023-02-10 06:47:02', 2, 1, 1),
(39, 50, '0', '2023-02-10 06:41:25', 2, 1, 1),
(41, 50, NULL, '2023-02-10 06:50:17', 2, 1, 1),
(42, 50, NULL, '2023-02-10 06:53:52', 2, 1, 1),
(43, 0, NULL, '2023-02-10 07:03:20', 2, 1, 1),
(44, 0, NULL, '2023-02-10 07:03:49', 2, 1, 1),
(45, 50, NULL, '2023-02-10 07:10:26', 2, 1, 2),
(46, 60, NULL, '2023-02-10 08:55:06', 2, 1, 1),
(47, 120, NULL, '2023-02-10 08:57:33', 2, 1, 1),
(48, 100, NULL, '2023-02-10 08:58:12', 2, 1, 1),
(49, 50, '1234455', '2023-02-10 09:45:35', 2, 1, 1),
(50, 50, NULL, '2023-02-10 10:06:19', 2, 1, 1),
(51, 100, '234542345', '2023-02-10 10:06:59', 2, 1, 1),
(52, 50, NULL, '2023-02-10 10:49:53', 2, 1, 1),
(53, 160, NULL, '2023-02-10 10:53:29', 2, 1, 1),
(54, 240, NULL, '2023-02-10 19:35:16', 2, 1, 2),
(55, 100, NULL, '2023-02-10 19:37:17', 2, 1, 3),
(56, 100, NULL, '2023-02-10 22:32:58', 2, 1, 3),
(58, 0, NULL, NULL, 1, 1, 1),
(59, 0, NULL, NULL, 1, 1, 1);

INSERT INTO `venta_prod` (`idVP`, `cantidad`, `idVent`, `idProducto`) VALUES
(36, 1, 37, 1),
(37, 2, 37, 3),
(38, 1, 37, 1),
(39, 2, 38, 1),
(40, 1, 39, 1),
(42, 1, 41, 1),
(43, 1, 42, 1),
(44, 1, 45, 5),
(45, 1, 46, 2),
(46, 2, 47, 2),
(47, 2, 48, 1),
(48, 1, 49, 1),
(49, 1, 50, 1),
(50, 2, 51, 5),
(51, 1, 52, 3),
(52, 2, 53, 6),
(53, 2, 54, 2),
(54, 1, 54, 2),
(55, 1, 54, 2),
(56, 1, 55, 7),
(57, 1, 55, 3),
(58, 1, 56, 3),
(59, 1, 56, 1);

-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------


SELECT r.idInventario, r.ingrediente, r.cantidad, r.unidad, p.nombre 
FROM receta_prod AS r 
INNER JOIN productos AS p ON r.idProducto=p.idProducto 
WHERE p.idProducto = 1;
select * from inventario where idInventario = 1;
select * from inventario where idInventario = 2;


SELECT p.idProducto, p.nombre, p.tamaño, p.tamaño, p.unidad,p.precioVent, c.Categoria 
FROM productos AS p 
INNER JOIN categoria_pr AS c ON p.idCatego = c.idCatego WHERE c.idCatego = 1;

SELECT * FROM ventas WHERE idVE = 1;

ALTER TABLE venta_prod ADD cantidad int(55); 

DELETE FROM usuarios WHERE idUsuario=2;
DELETE FROM receta_prod WHERE idInventario=2;

select * from venta_prod;

Delete from venta_prod where idVent=97;

Delete from ventas where idVent=2;

SELECT p.idProducto, p.nombre, p.tamaño, p.unidad, vp.cantidad, p.precioVent
FROM productos AS p 
INNER JOIN venta_prod AS vp ON vp.idProducto = p.idProducto 
INNER JOIN ventas AS v ON vp.idVent = v.idVent 
WHERE v.idVent = 1;

insert into venta_prod (idVent, idProducto) value (1,1),(1,2);

select * from inventario;

-- ----------------------------------------------------------------------------------------------------------------------------------------------------
-- trigger
DELIMITER $$
CREATE TRIGGER restar_ingredientes
AFTER UPDATE ON ventas
FOR EACH ROW
BEGIN
	  DECLARE @cantidad INT ;
	  DECLARE @id_producto INT;
	  DECLARE @id_inventario INT;
	  DECLARE @cantidad_ingre INT;
      DECLARE @idV INT;
      
      SELECT @idV = idVent 
      FROM ventas 
      WHERE idVent = NEW.id;

	  SELECT @cantidad = cantidad, @id_producto = idProducto
	  FROM venta_prod
	  WHERE idVent = @idV;

	  SELECT @cantidad_ingre = cantidad
	  FROM receta_prod
	  WHERE idProducto = @id_producto;

	  SET @cantidad_ingre = @cantidad * @cantidad_necesaria;

	  SELECT @id_inventario = idInventario
	  FROM receta_prod
	  WHERE idProducto = @id_producto;

	  UPDATE inventario
	  SET cantidad = cantidad - @cantidad_necesaria
	  WHERE idInventario = @id_inventario;
END;
DELIMITER ;

drop trigger mensaje_inf;

DELIMITER $$
CREATE TRIGGER mensaje_inf
AFTER INSERT ON ventas
FOR EACH ROW
BEGIN
	INSERT INTO Info (mensaje,num) VALUES ("Se inserto una venta",1);
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER mensaje_inf
AFTER INSERT ON ventas
FOR EACH ROW
BEGIN
	DECLARE idv INT;
    DECLARE idP INT;
    DECLARE cantPro Double;
    set idv = new.idVent;
    SELECT cantPro = cantidad, idP = idProducto
    FROM venta_prod
    WHERE idVent = idv;
    INSERT INTO Info (mensaje,num) VALUES ("Se inserto una venta",idP);
END$$
DELIMITER ;
