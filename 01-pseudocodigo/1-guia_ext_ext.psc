Funcion fn_randomize
	Definir  varNumero Como Entero
	Definir  varSorteo Como Entero
	Definir  varBool  Como caracter
	Repetir
		
		Limpiar Pantalla
		Escribir "Ingrese un numero "
		leer varNumero
		Repetir
			varSorteo = azar(varNumero)
		Mientras Que  varSorteo >  varNumero
		Escribir "El numero sorteado es =",varSorteo
		Escribir "Desea repetir el proceso?? (S/N)"
		Leer varBool
	Mientras Que varBool = 'S' O varBool = 's'
FinFuncion

Funcion ret = fn_entre(num,numrandom)
	Definir ret Como Caracter
	Definir num1,num2 como enteros
	num1 = num*3
	num2 = num*5
	SI numrandom > num1 y numrandom <= num2 Entonces
		ret ='S'
	SiNo
		ret ='N'
		
	FinSi
	
	
FinFuncion

Funcion fn_randomize2
	Definir  varNumero Como Entero
	Definir  varSorteo Como Entero
	
	Definir  varBool,varReturn  Como caracter
	
	Repetir
		
		Limpiar Pantalla
		Escribir "Ingrese un numero "
		leer varNumero
		Repetir
			varSorteo = azar(varNumero*5)
			//Escribir "numero=",varNumero
			//Escribir "sorteo=",varSorteo
			varReturn = fn_entre(varNumero,varSorteo)
		Mientras Que  varReturn = 'N'
		Escribir "El numero sorteado es =",varSorteo
		Escribir "Desea repetir el proceso?? (S/N)"
		Leer varBool
	Mientras Que varBool = 'S' O varBool = 's'
FinFuncion







Algoritmo PP_EXTRA_EXTRA
	

	fn_randomize2
	
FinAlgoritmo
