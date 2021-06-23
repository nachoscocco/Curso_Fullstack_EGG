

//IGNACIO SCOCCO
//



Algoritmo pp_parcial
	
	Definir muestra,op Como Caracter      //muestra es variable de entrada a mi funcion
	Definir matriz como cadena           //matriz es variable de entrada de multiples funciones
	Definir n Como Entero                 //n es variable de salida obtenida de la funcion
	
	Repetir
		
		
		Escribir 'Ingrese una muestra'
		Escribir 'RECUERDE:'
		Escribir 'Las dimensiones permitidas son:'
		Escribir '3x3, 4x4 Y 37x37'
			leer muestra
		n=fnAsignaDimension(muestra)
		si n=0 
			Escribir 'ERROR, LA CADENA INGRESADA TIENE UNA CANTIDAD DE CARACTERES INVALIDAS'
			Escribir 'Presione una tecla para repetir. . .'
			Esperar Tecla
			Limpiar Pantalla
			
		SiNo
			si n=1
				Escribir 'ERROR, LA CADENA INGRESADA TIENE CARACTERES INVALIDOS'
				Escribir 'Presione una tecla para repetir. . .'
				Esperar Tecla
				Limpiar Pantalla
			FinSi
		
			
		FinSi
	Mientras Que n=0 o n=1
	
	Dimension  matriz[n,n]
	cargaMatriz(matriz,muestra,n)
	verificaGenZ(matriz,n)
	
	
	
	
	
	
	
	
FinAlgoritmo



Funcion n=fnAsignaDimension(muestra)
	Definir n,long Como Entero
	Definir caract Como Caracter
	Definir valid Como Logico
	muestra=Mayusculas(muestra)
	long=Longitud(muestra)
	valid=fnValidaCadena(muestra,long)
	
	Si (long=9 o long=16 o long=1369) y valid=Verdadero  Entonces
		//Escribir 'entro al verdadero'
		n= rc(long)
	SiNo
		si valid 
			n=0
		SiNo
			n=1
			
		FinSi
	
		
	
	Fin Si
	
	
FinFuncion


Funcion valid=fnValidaCadena(muestra,long)  //variables de entrada muestra long.. de salida valid
	definir caract Como Caracter
	definir valid como logico
	definir i Como Entero
	valid=Verdadero
	
	Para i=0 Hasta long-1  Hacer
		caract = SubCadena(muestra,i,i)
		//Escribir caract
		si caract <> 'A' y caract <> 'B' y caract <>'C' y caract <>'D'
			valid=Falso
			//Escribir 'se seteo en falso valid CON CARACTER = '+caract
		FinSi
	Fin Para
	
FinFuncion


SubProceso  cargaMatriz(matriz,muestra,n)    //variables de entrada matriz , n y muestra
	Definir i,j,cont Como Entero
	cont=0
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			
			matriz[i,j]= Subcadena(muestra,cont,cont)
			//Escribir 'FILA ',I,' // COLUMNA ',J , '// VALOR = ', matriz[i,j]
			cont= cont+1
			
		Fin Para
	Fin Para
	
FinSubProceso

SubProceso verificaGenZ(matriz,n)    //variables de entrada matriz y n
	Definir diag1,diag2 Como Caracter
	Definir i,j,aux Como Entero
	Definir verifd1,verifd2 Como Logico
	verifd1 = Verdadero
	verifd2 = Verdadero
	diag1 = matriz[0,0]
	diag2 = matriz[0,(n-1)]
	aux=0
	
	Para i=0 Hasta n-1  Hacer
		Para j=0 Hasta n-1  Hacer
			si i=j y matriz[i,j]<>diag1
				verifd1=Falso
			FinSi
			si (i+j)=n-1 y  matriz[i,j]<>diag2
				verifd2=Falso
				
			FinSi
			
		Fin Para
	Fin Para
	
	si verifd1 y verifd2
		Limpiar Pantalla
		Escribir 'ACABA DE ENCONTRAR EL GEN Z!!!'
		Escribir ""
		muestraMatriz(matriz,n)
		Escribir ""
	SiNo
		Limpiar Pantalla
		Escribir'Las muestra ingresada no corresponde al genz :c'
		Escribir ""
		muestraMatriz(matriz,n)
		Escribir ""
	FinSi
	
	
	
	
FinSubProceso

SubProceso muestraMatriz(matriz,n)   //variable de entrada matriz y n
	Definir i , j Como Entero
	Para i=0 Hasta n-1  Hacer
		Para j=0 Hasta n-1  Hacer
			si j= n-1
				Escribir  matriz[i,j],""
			SiNo
				Escribir Sin Saltar matriz[i,j]," "
			FinSi
		Fin Para
	Fin Para
	
FinSubProceso



