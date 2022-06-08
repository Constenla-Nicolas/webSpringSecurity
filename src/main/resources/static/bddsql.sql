create database springdb;

use springdb;


create table Personaje(idP int  not null AUTO_INCREMENT , Nombre varchar(20),edad int,peso int,historia varchar(400), Primary key(idP),  image_path varchar(2024));

create table Pelicula(idpeli int not null AUTO_INCREMENT,Titulo varchar(20),fecha date,calificacion int, image_path varchar(2024), Primary key(idpeli));

create table Personajepeli(idP int, idPeli int, Primary key(idp, idpeli), Foreign key(idp) references Personaje(idP), Foreign key(idpeli) references Pelicula(idpeli));

create table Genero(idgen int not null AUTO_INCREMENT,Nombre varchar(20), Imagen varchar(200),Primary key(idgen));

create table GeneroPeli(idPeli int, idgen int,Primary key(idgen, idpeli), Foreign key(idgen) references Genero(idgen), Foreign key(idpeli) references Pelicula(idpeli));




 

use dndsql;

create table Usuario(iduser int not null AUTO_INCREMENT, username varchar(20), contra varchar(50), mail varchar(400), Primary key(iduser));

create table Razas(idraza int not null AUTO_INCREMENT, nombre varchar(15),size varchar(10),speed int, Primary key(idraza));

create table RacialTraits(idtraits int not null AUTO_INCREMENT, nombre varchar(20), descripcion varchar(500), Primary key(idtraits));


create table RazasyTraits(idraza int, idtraits int, Primary key(idraza, idtraits),Foreign key(idraza) references Razas(idraza),
 Foreign key(idtraits) references RacialTraits(idtraits));

create table Skills(idskill int not null AUTO_INCREMENT, nombre varchar(10),modifier int, score int, Primary key(idskill));


create table Transfondos(idback int not null AUTO_INCREMENT,skill1 int,skill2 int,lenguages int, toolprof varchar(120), equip varchar(500),
 Primary key(idback), Foreign key(skill1) references Skills(idskill), Foreign key(skill2) references Skills(idskill));

create table Lenguages(idlenguages)

create table Personaje(idP int  not null AUTO_INCREMENT , Nombre varchar(20),idraza int,nivel int, idbackground int,
 Primary key(idp),Foreign key(idraza) references Razas(idraza),Foreign key(idbackground) references Transfondos(idback));



create table Usuario_PJ(iduser int, idp int, Primary key(iduser, idp), Foreign key(iduser) references Usuario(iduser), Foreign key(idp) references Personaje(idp));

insert into usuario(username,contra,mail)
values("videla","80","40");
