create database springdb;

use springdb;

drop table users;
create table Personaje(idP int  not null AUTO_INCREMENT, Imagen varchar(200), Nombre varchar(20),edad int,peso int,historia varchar(400), Primary key(id));

create table Pelicula(idpeli int not null AUTO_INCREMENT,Imagen varchar(200),Titulo varchar(20),fecha date,calificacion int);

create table Personajepeli(idP int, idPeli int, Primary key(idp, idpeli), Foreign key(idp) references Personaje(idP), Foreign key(idpeli) references Pelicula(idpeli));

create table Genero(idgen int not null AUTO_INCREMENT,Nombre varchar(20), Imagen varchar(200),Primary key(idgen));

create table GeneroPeli(idPeli int, idgen int,Primary key(idgen, idpeli), Foreign key(idgen) references Genero(idgen), Foreign key(idpeli) references Pelicula(idpeli));




insert into users(username,pass,email,telefono)
values("videla","12345","macrigatogmail.com","11161");

