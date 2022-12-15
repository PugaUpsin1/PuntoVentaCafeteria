create database Punto_Venta;

use Punto_Venta;


create table if not exists usuarios (
idUsuario int auto_increment primary key not null ,
usuario varchar(30) not null,
nombre varchar (30) not null,
apellido varchar (30) not null,
tel varchar (30) not null,
password varchar(60) not null,
id_tipo int (11)
);

create table if not exists tipo_usuario(
id_tipo int auto_increment primary key not null,
nombre varchar (50) not null
);

drop table usuarios;