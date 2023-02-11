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
Telefono int (30) not null,
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


-- insert into receta_prod(ingrediente,cantidad,unidad,)

-- drop table usuarios;
insert into tipo_usuario (id_tipo, nombre) values 
-- (1, "Administrador"),
(2,"Usuario");

insert into usuarios (idUsuario,usuario,nombre,apellido,tel,password,id_tipo)values
(1,"admin","Issac","Puga","null","d033e22ae348aeb5660fc2140aec35850c4da997",1),
(2,"usr","Diana","Rice","null","d033e22ae348aeb5660fc2140aec35850c4da997",2);

insert into inventario (idInventario,nombre,Cantidad,unidad,PrecioUni,Proveedor) values 
(1,"Leche",10.0,"Litros",10.0,"Soriana");

-- Productos
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (1,'Leche',0.35,'Litros',1,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (3,'Leche',0.5,'Litros',2,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (4,'Leche',0.3,'Litros',5,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (5,'Cafe',0.4,'Kilogramos',5,2);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (6,'Azucar Morena',0.02,'Kilogramos',4,8);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (7,'Vasos',1,'Kilogramos',4,7);

-- receta
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (1,'Leche',0.35,'Litros',1,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (3,'Leche',0.5,'Litros',2,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (4,'Leche',0.3,'Litros',5,1);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (5,'Cafe',0.4,'Kilogramos',5,2);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (6,'Azucar Morena',0.02,'Kilogramos',4,8);
INSERT INTO `receta_prod` (`id_ingrd`,`ingrediente`,`cantidad`,`unidad`,`idProducto`,`idInventario`) VALUES (7,'Vasos',1,'Kilogramos',4,7);

-- clientes
INSERT INTO `Punto_Venta`.`Clientes` (`idCliente`, `Nombre`, `Apellidos`, `Edad`, `Telefono`, `Email`, `NumVisi`) VALUES ('1', 'Julieta', 'Alvarez', '21', '6691233445', 'julieta@mail.com', '1');
INSERT INTO `Punto_Venta`.`Clientes` (`idCliente`, `Nombre`, `Apellidos`, `Edad`, `Telefono`, `Email`, `NumVisi`) VALUES ('2', 'Alejandra', 'Alvarez', '22', '6699346578', 'ale@mail.com', '1');
INSERT INTO `Punto_Venta`.`Clientes` (`idCliente`, `Nombre`, `Apellidos`, `Edad`, `Telefono`, `Email`, `NumVisi`) VALUES ('3', 'Justin', 'Hernandez', '20', '6692452365', 'justin@mail.com', '1');