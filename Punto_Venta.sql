create database Punto_Venta;

use Punto_Venta;


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

create table if not exists tipo_usuario(
id_tipo int auto_increment primary key not null,
nombre varchar (50) not null
);

create table if not exists productos(
idProducto int auto_increment primary key not null,
nombre varchar (50) not null,
tamaño double not null,
unidad varchar (50) not null
);
create table if not exists inventario(
idInventario int auto_increment primary key not null,
nombre varchar (50) not null,
Cantidad int not null,
unidad varchar (50) not null,
PrecioUni double not null,
Proveedor varchar (50) not null
);



create table if not exists receta_prod(
ingrediente varchar (50) not null,
cantidad double not null,
unidad varchar (50) not null,
idProducto int not null,
idInventario int not null,

constraint  fkrecetaProd_producto
foreign key (idProducto)
references productos(idProducto),

constraint fkrecetaInv_inventario
foreign key (idInventario)
references inventario(idInventario)
);



drop table usuarios;