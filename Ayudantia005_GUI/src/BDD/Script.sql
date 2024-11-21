CREATE TABLE Marca(
    id					INT 			PRIMARY KEY AUTO_INCREMENT,
    nombre                              VARCHAR(100)            NOT NULL,
    habilitado				INT			NOT NULL,
    UNIQUE(nombre)
);

CREATE TABLE Producto6(
    id					INT 			PRIMARY KEY AUTO_INCREMENT,
    codigo 				INT				NOT NULL,
    descripcion 		VARCHAR(200)	NOT NULL,
    precio				INT				NOT NULL,
    UNIQUE(codigo)
);


INSERT INTO Marca (nombre, habilitado) values ('Pepsi', 1);
INSERT INTO Marca (nombre, habilitado) values ('Coca Cola', 1);
INSERT INTO Marca (nombre, habilitado) values ('Bilz', 1);
INSERT INTO Marca (nombre, habilitado) values ('Pap', 1);

INSERT INTO producto6 (id, codigo, descripcion, precio) VALUES (NULL, '1000', 'bebida 2lt', '1500');
INSERT INTO producto6 (id, codigo, descripcion, precio) VALUES (NULL, '1001', 'bebida 3lt', '2300');