
Funcion res=fn_suma_rec(sum)
	
	Definir res Como Entero
	res=0
	Repetir
		res = res + sum
		sum = sum-1
	Mientras Que sum <> 0

FinFuncion



Algoritmo ej10
	definir sum Como Entero
	Escribir "Ingrese numero a sumar sus recursivos"
	leer sum
	Escribir "la suma recursiva de ",sum, " es = " , fn_suma_rec(sum)
	
FinAlgoritmo
