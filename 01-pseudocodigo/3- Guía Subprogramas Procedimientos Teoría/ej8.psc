
SubProceso resta_sucesiva(num,denom)
	Definir cond como cadena
	Definir c Como Entero
	cond =''
	c = 0
	Repetir
		
		num = num-denom
		c = c+1
		Si num < denom Entonces
			cond = 'si'
		Fin Si
   hasta que cond = 'si'
	Escribir "el resultado es= ",c,"y el resto es = ",num
	
FinSubProceso



Algoritmo ej8
	Definir num, denom Como Entero
	escribir "Ingrese numerador de la division"
	leer num
	Escribir  "Ingrese el denominador de la division"
	leer denom
	 resta_sucesiva(num,denom)
	
FinAlgoritmo
