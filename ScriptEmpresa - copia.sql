CREATE DATABASE BDEmpresa; 
USE BDEmpresa; 

CREATE TABLE IF NOT EXISTS Empregado(
Nome VARCHAR(25) NOT NULL, 
Apelido_1 VARCHAR(25) NOT NULL, 
Apelido_2 VARCHAR(25) NOT NULL, 
NSS VARCHAR(15) NOT NULL,
Rua VARCHAR(30),
Numero_rua INTEGER, 
Piso VARCHAR(4),
CP CHAR(5), 
Localidade VARCHAR(25), 
Data_nacemento DATE, 
Salario FLOAT, 
Sexo CHAR(1), 
NSS_Supervisa VARCHAR(15), 
Num_departamento_pertenece INTEGER,
PRIMARY KEY (NSS),
FOREIGN KEY (NSS_Supervisa) REFERENCES Empregado (NSS) 
-- FOREIGN KEY (Num_departamento_pertenece) REFERENCES Departamento(Num_departamento_pertenece)
); 


CREATE TABLE IF NOT EXISTS Departamento(
Num_departamento INTEGER NOT NULL, 
Nome_departamento VARCHAR(25), 
NSS_dirige VARCHAR(15),
Data_direccion DATE,
PRIMARY KEY (Num_departamento),
FOREIGN KEY (NSS_dirige) REFERENCES Empregado(NSS)
); 


ALTER TABLE Empregado ADD CONSTRAINT Num_departamento_pertenece FOREIGN KEY (Num_departamento_pertenece) REFERENCES Departamento(Num_departamento);


CREATE TABLE IF NOT EXISTS Proxecto(
Num_proxecto INTEGER NOT NULL,
Nome_proxecto VARCHAR(25) NOT NULL,
Lugar VARCHAR(25) NOT NULL, 
Num_departamento INT NOT NULL, 
PRIMARY KEY (Num_proxecto),
FOREIGN KEY (Num_departamento) REFERENCES Departamento (Num_departamento)
); 


CREATE TABLE IF NOT EXISTS Empregado_Proxecto(
NSS_Empregado VARCHAR(15) NOT NULL,
Num_proxecto INTEGER NOT NULL, 
Horas_semanais INTEGER, 
PRIMARY KEY (NSS_Empregado), 
-- PRIMARY KEY (Num_proxecto),
FOREIGN KEY (Num_proxecto) REFERENCES Proxecto (Num_proxecto)
);  
