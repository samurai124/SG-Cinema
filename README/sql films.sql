 create database  sg_cinema;
use  sg_cinema;


create table Films(
 idFilm int primary key auto_increment,
 titre varchar(255) not null ,
 duree varchar(255) NOT null,
 categorie varchar (255)
 
);

insert into Films (titre , duree , categorie)
values 
("harryPoter","two hours ","action"),
("milificent","one hours","fantastic");

select * from Films

