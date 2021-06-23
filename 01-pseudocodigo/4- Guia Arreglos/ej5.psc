SubProceso iniciaVectores(a,b,c,n)
	definir i Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		
		a(i)=0
		b(i)=0
		c(i)=0
	Fin Para
	
	
FinSubProceso


SubProceso  procesaOpAyB(a,n)
	definir i Como Entero
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		a(i)=Aleatorio(-100,100)
	Fin Para
	
FinSubProceso


SubProceso procesaOpCyD(a,b,c,sig,n)
	Definir  i Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		
		si sig ='+'
			
			c(i)=a(i) + b(i)
			
		SiNo
			c(i)= a(i) - b(i)
			
		FinSi
		
		
	Fin Para
	
	
FinSubProceso

SubProceso muestraEspecifica(vec,ch,n)
	Definir  i Como Entero
	Escribir 'VECTOR ',ch
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		
		Escribir 'POS (',i, ")  = ",vec(i)
		
		
	Fin Para
	
	
	
FinSubProceso

SubProceso muestraVec(vecA,vecB,vecC,n)
	Definir op2 Como Caracter
	Escribir 'Ingrese la letra del vector que desea mostrar'
	leer op2
	op2 = Mayusculas(op2)
	Segun op2 Hacer
		'A':
			muestraEspecifica(vecA,'A',n)
		'B':
			muestraEspecifica(vecB,'B',n)
		'C':
			muestraEspecifica(vecC,'C',n)
		De Otro Modo:
			Escribir 'ERROR, OP INCORRECTA'
	Fin Segun
	
	
FinSubProceso















Algoritmo ej_5
	Definir op Como Caracter
	Definir n Como Entero
	Definir  vecA,vecB,vecC Como Real
	
	Escribir 'Ingrese dimension de los arreglos'
	Leer n
	
	Dimension vecA(n)
	Dimension vecB(n)
	Dimension vecC(n)
	iniciavectores(vecA,vecB,vecC,n)
	Limpiar Pantalla
	
	Repetir
		
		Escribir 'Ingrese una opcion'
		Escribir 'A: Llenar vector A'
		Escribir 'B: Llenar vector B'
		Escribir 'C: Llenar vector C con suma de A Y B'
		Escribir 'D: Llenar vector C con resta de A Y B'
		Escribir 'E: Seleccionar un vector a mostrar'
		Escribir 'F: Salir'
		
		Leer op
		op=Mayusculas(op)
		
		
		Segun op Hacer
			'A':
				procesaOpAyB(vecA,n)
				Escribir 'Opcion A procesada con exito!'
				Esperar Tecla
				Limpiar Pantalla
				
			'B':
				procesaOpAyB(vecB,n)
				Escribir 'Opcion B procesada con exito!'
				Esperar Tecla
				Limpiar Pantalla
			
  		     'C':
				 procesaOpCyD(vecA,vecB,vecC,'+',n)
				 Escribir 'Opcion C procesada con exito!'
				 Esperar Tecla
				 Limpiar Pantalla
			'D':
				procesaOpCyD(vecA,vecB,vecC,'-',n)
				Escribir 'Opcion D procesada con exito!'
				Esperar Tecla
				Limpiar Pantalla
			'E':
				muestraVec(vecA,vecB,vecC,n)
				Esperar Tecla
				Limpiar Pantalla
			'F':
				Escribir 'Saliendo del programa, oprima cualquier tecla para continuar'
				
		     
			
			De Otro Modo:
				Escribir 'error, opcion incorrecta'
		Fin Segun
		
	Hasta Que op = 'F' 	
	Escribir 'Fin PP L:125'
	
FinAlgoritmo
