DROP SCHEMA crud;

CREATE DATABASE crud;

USE crud;

CREATE TABLE Veiculos (
  id int not null auto_increment primary key,
  modelo varchar(20) not null,
  ano int not null,
  preco decimal(10,2) not null
);

INSERT INTO Veiculos (modelo, ano, preco) VALUES
("Parati CL", 1991, 14900.0),
("Pickup Corsa", 2004, 26010.90),
("Fox", 2009, 31005.0),
("S10", 2013, 86010.00),
("TITAN 160", 2020, 14900.20),
("MT07", 2017, 34500.15),
("CB300", 2014, 14900.30),
("HB20", 2021, 50000.00);

SELECT * FROM Veiculos;