
SubProceso temp_media(tmin,tmax,c)
	Escribir "La temperatura media del dia ",c+1," es ",(tmin + tmax )/2 ,"ºC"
	
FinSubProceso


Algoritmo pp
	Definir cantDias,c Como Entero
	Definir tmin,tmax Como Real
	
	Escribir "Ingrese cant dias a medir temperatura"
	leer cantDias;
	Limpiar Pantalla
	c = 0;
	Repetir
		
		Escribir "ingrese temperatura minima en ºC"
		leer tmin
		Limpiar Pantalla
		Escribir "ingrese temperatura maxima en ºC"
		leer tmax
		Limpiar Pantalla
		temp_media(tmin,tmax,c)
		c =c+1
		
	Hasta Que c = cantDias
	
	
	
	
	
FinAlgoritmo
