Algoritmo pp_21
	Definir alumnos,c ,contRepro,contAproInt,contAprobParc Como Entero
	Definir notaInt,notaParc,notaExp,notaFin,acumRepro, mayorExpo Como Real
	Escribir "Ingrese la cantidad de alumnos"
	leer alumnos
	c = 0
	contRepro = 0
	contAproInt=0
	acumRepro =0
	mayorExpo =0
	Repetir
		Escribir 'ALUMNO Nº', c+1
		Escribir "Ingrese nota integrador"
		leer notaInt
		Escribir "ingrese nota parcial"
		leer notaParc
		Escribir 'ingrese nota expo'
		leer notaExp
		notaFin= (notaInt*0.35)+(notaParc*0.4)+(notaExp*0.25)
		
		Si notaFin < 6.5 Entonces
			contRepro = contRepro + 1
			acumRepro = acumRepro + notaFin
	
		Fin Si
		
		Si notaInt >= 7.5 Entonces
			contAproInt= contAproInt + 1 
			
		Fin Si
		
		Si notaExp > mayorExpo Entonces
			mayorExpo = notaExp
		FinSi
		
		
		//Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
		Si notaParc>=4 y notaParc<=7.5  Entonces
			contAprobParc = contAprobParc + 1
		
		Fin Si

		
		Escribir 'nota f de alumno',c+1,'es',notaFin
		Esperar Tecla
		Limpiar Pantalla
		c = c+1
		
	Hasta Que c = alumnos
	
	Escribir "La nota promedio de desaprobados es=",acumRepro / contRepro
	Escribir  "el promedio que aprobaron el integrador con +7,5 =",(contAproInt *100) / alumnos
	Escribir  "La nota mayor en expo es =",mayorExpo
	
	
	
	
	
	
	
	
FinAlgoritmo
