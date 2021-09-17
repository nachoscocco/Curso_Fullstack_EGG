select nombre,precio 
from tienda.producto ;

#listar todas las columnas de la tabla producto
select * 
from producto;

#listar precios de productos en dolares y euros

select nombre,precio as precioEnPeso , 
		(precio/185) as precioEnDolar ,
        (precio/200) as PrecioEnEuro
from producto;

#nombres en MAYUS

select nombre, upper(nombre) as NOMBRE
from producto;

# Lista el nombre de todos los fabricantes en una columna, y en otra columna
#obtenga en mayúsculas los dos primeros caracteres del nombre del fabricante

select nombre , 
	   upper(substr(nombre,1,2)) as nombreChikito
from fabricante;

#listar productos y redondeAR PRECIO 

select nombre,
	   precio,
       round(precio,0)
from producto;

#ahora truncando

select nombre,
	   precio,
       truncate(precio,0)
from producto;

#codigo fabricante q tienen productos en la tabla del mismo nombre

select distinct codigo_fabricante
from producto;

#fabricantes de forma ascendente segun su nombre

select nombre
from fabricante
order by nombre ASC ;

#ista los nombres de los productos ordenados en primer lugar por el nombre de
#forma ascendente y en segundo lugar por el precio de forma descendente.

SELECT *
from producto
order by nombre ASC,precio desc;

#5 primeras filas

select * from fabricante 
limit 5;
#prod mas barato
select nombre,precio
from producto
order by precio
limit 1;

 #prod mas caro
 select nombre,precio
from producto
order by precio desc
limit 1;

#ista el nombre de todos los productos del fabricante cuyo código de fabricante es
#igual a 2
select nombre,codigo_fabricante
from producto
where codigo_fabricante = 2;

select nombre,precio
from producto
where precio <= 120;

select nombre,precio
from productos
where precio >=80 and precio <=300;

#con between

select nombre,precio
from producto
where precio between 60 and 200;

select nombre,codigo_fabricante
from producto
where codigo_fabricante = 1 or codigo_fabricante = 3 or codigo_fabricante = 5;

select nombre,codigo_fabricante
from producto
where codigo_fabricante in(1,3,5);

select precio , (precio * 100) as centimo
from producto;

select nombre
from fabricante
where length(nombre) = 4;

select nombre
from producto
where nombre like '%Port%';

# Devuelve una lista con el nombre del producto, precio y nombre de fabricante de
#todos los productos de la base de datos. Ordene el resultado por el nombre del
#fabricante, por orden alfabético.

select p.nombre,p.precio,f.nombre
from producto p,
	 fabricante f
ORDER BY f.nombre asc;

select p.nombre,
	   p.codigo as codigoDeProducto,
       f.nombre,
       f.codigo as codigoDeFabricante
from producto p,
	 fabricante f
ORDER BY f.nombre asc;

select p.nombre,
	   MIN(p.precio) as precioChikito,
       f.nombre
from producto p,
	 fabricante f
HAVING precioChikito >40
ORDER BY p.precio asc
;

#Devuelve un listado con todos los productos de los fabricantes Asus, 
#HewlettPackardy Seagate. Utilizando el operador IN.

select p.nombre,
	   f.nombre
from producto p,
	 fabricante f
WHERE f.nombre in ("Asus","Seagate","Hewlett-Packard")
ORDER BY p.precio asc
;

#Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de
#todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado
#en primer lugar por el precio (en orden descendente) y en segundo lugar por el
#nombre (en orden ascendente)
select p.nombre,
	   p.precio,
       f.nombre
from producto p,
	 fabricante f
WHERE p.precio >= 180











       