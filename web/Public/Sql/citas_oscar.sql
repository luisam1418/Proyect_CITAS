Drop database if exists Ordenes;

create database Ordenes;
use Ordenes;

drop table if exists Examenes;
create table Examenes
(
    IdUsuario Int  NOT NULL,
    NombreDoctor Varchar(100) NOT NULL,
    TipoExamen Varchar(100) NOT NULL,
    Consultorio Varchar (20) NOT NULL,
    PRIMARY KEY (IdUsuario)
);

INSERT INTO examenes (IdUsuario, NombreDoctor, TipoExamen, Consultorio) 
VALUES
(7, 'Stiven', 'Medicina General', '7'),
(8, 'Alejandro', 'Odontologia', '10'),
(9, 'Duncan', 'Ginecologia', '6');