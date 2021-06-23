
Funcion ret=fn_es_primo(num)
	Definir i,ret,resmod Como Entero
	i=1
	ret=0
	Mientras i <=num Hacer
		resmod = num mod i
		Si resmod = 0 Entonces
			ret=ret+1
		Fin Si
		i = i+1
	Fin Mientras
FinFuncion



Algoritmo ej5
	Definir num Como Entero	
	escribir"Ingrese un numero"
	leer num
	Si  fn_es_primo(num)=2 Entonces
		Escribir "el numero es primo"
	SiNo
		Escribir "el numero no es primo"
	Fin Si
	
	
FinAlgoritmo
