create database springdb;

use database springdb;

create table users(id int  not null AUTO_INCREMENT, username varchar(40), pass varchar(20),email varchar(300),telefono varchar(100), Primary key(id));


insert into users(username,pass,email,telefono)
values("videla","12345","macrigatogmail.com","11161");
