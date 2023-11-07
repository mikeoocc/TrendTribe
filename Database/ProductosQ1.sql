CREATE DATABASE TrendTribe;

USE TrendTribe;

CREATE TABLE Productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    categoria VARCHAR(255) NOT NULL,
    marca VARCHAR(255) NOT NULL,
    cantidad INT NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    talla VARCHAR(10), -- Solo si es ropa
    color VARCHAR(20), -- Solo si es ropa
    numeroPie INT, -- Solo si es zapatos
    estilo VARCHAR(20) -- Solo si es zapatos
);

INSERT INTO Productos (nombre, precio, categoria, marca, cantidad, tipo, talla, color, numeroPie, estilo)
VALUES ('CamisetaJordanA2', 12.99, 'Camisetas', 'NIKE', 5, 'Ropa', 'M', 'Rojo', NULL, NULL);

INSERT INTO Productos (nombre, precio, categoria, marca, cantidad, tipo, talla, color, numeroPie, estilo)
VALUES ('Vaqueros', 16.99, 'Pantalones', 'EL CORTE INGLES', 10, 'Ropa', 'XL', 'Azul', NULL, NULL);

INSERT INTO Productos (nombre, precio, categoria, marca, cantidad, tipo, talla, color, numeroPie, estilo)
VALUES ('AdidasZero', 61.99, 'Deporte', 'ADIDAS', 2, 'Zapatos', NULL, NULL, 46, 'Deportivas');

INSERT INTO Productos (nombre, precio, categoria, marca, cantidad, tipo, talla, color, numeroPie, estilo)
VALUES ('NikeAir', 79.99, 'Moda', 'NIKE', 6, 'Zapatos', NULL, NULL, 40, 'Vestir');
