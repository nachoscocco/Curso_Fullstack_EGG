
Funcion resp=fn_par_impar(num)
	Definir resp Como Caracter
	definir resul Como Entero
	
	resul = num mod 2
	Si resul = 0 Entonces
		resp ='F'
	SiNo
		resp ='V'
	Fin Si
FinFuncion



Algoritmo PP_2
	Definir num como entero
	definir resp como caracter
	Escribir "Ingrese un numero"
	leer num
	resp = fn_par_impar(num)
	
	si resp = 'V'
		Escribir "ESTE NUMERO ES IMPAR"
	SiNo
		Escribir "ESTE NUMERO ES PAR"
	FinSi
	
FinAlgoritmo
