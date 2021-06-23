Algoritmo ejemplos 
	Definir alumno como cadena
	Definir  nota como real
	
	nota = 6
	
//////////////////////////////////////CONDICIONALES///////////////////////////////	
	
//CO0NDICION SIMPLE  01
	Si nota >= 6 Entonces
		Escribir 'Alumno aprobo'
	
	Fin Si
	
//CONDICION DOPBLE 02
	Si nota >= 6 Entonces
		Escribir 'Alumno aprobo'
	SiNo
		Escribir 'Alumno desaprobo'
	Fin Si
	
	
//CONDICIONAL MULTIPLE

	Segun nota Hacer
		1:
			Escribir 'Alumno desaprobo'
		2:
			Escribir 'Alumno desaprobo'
		3:
			Escribir 'Alumno desaprobo'
		4:
			Escribir 'Alumno desaprobo'
		8:
			Escribir 'Alumno aprobo'
			
		De Otro Modo:
			Escribir 'error, numero incorrecto'
	Fin Segun
	
	
	//CONDICIONAL ANIDADO
	// nota3 .2
	
	Si nota >= 6 Entonces
			Si nota >=8 Entonces
				Escribir 'esta promovido'
			SiNo
				Escribir 'esta regular'
			Fin Si
	SiNo
		Si nota >= 3 Entonces
			Escribir 'desaprobo'
		SiNo
			Escribir 'Quedo libre '
		Fin Si
	Fin Si
	
	//////////////////////////////////////REPETITIVAS/////////////////////////////
	//MIENTRAS
	
		leer nota  // 8
		
		Mientras   nota < 0 o nota >10 Hacer   //mientras nota no este entre 0 o 10 repetira las lineas que tiene adentro
			Escribir 'error, nota erronea .Por favor ingrese otra nota'
			Leer nota  //24
		Fin Mientras
		
	//REPETIR
		
		
		Repetir
			Escribir 'iNGRESE UNA NOTA'
			leer nota   //9
		Mientras que nota < 0 o nota >10
		
		//hasta que nota>=0 o nota <=10
		
	//PARA
		// 
		//
		DEFINIR varPromedio,nota,acumNota como real
		Definir cantAlumnos,i Como Entero
		// cantAlumnos =10
		acumNota = 0
		Para i<-1 Hasta cantAlumnos  Hacer
			
			Escribir 'Ingrese nota del alumno',i
			leer nota  
			acumNota = acumNota + nota
			
		Fin Para

		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
