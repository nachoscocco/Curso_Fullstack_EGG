Funcion  EJ_01_Peg
	
	Definir  varDia como Cadena 
	Limpiar Pantalla
	
	Mostrar '****** EJ 02 ******'
	Mostrar ''
	Mostrar ''
	Mostrar "Como esta el dia de hoy?"
	Leer varDia
	Limpiar Pantalla
	Mostrar  "El dia de hoy esta ",varDia
FinFuncion


Funcion  EJ_02_CaluclaRA
	
	Definir  varRadio como Entero
	Mostrar ('****** EJ 02 ******')
	Mostrar ("Ingrese el radio de una circunferencia")
	Leer varRadio
	Limpiar Pantalla
	
	Mostrar  "El AREA de la circunferencia es "     ,PI*(varRadio^2)
	Mostrar  "El PERIMETRO de la circunferencia es ",2*PI*varRadio
	
	
FinFuncion

Funcion  EJ_03_PrecioProm
	
	Definir  varN1 como Entero
	Definir  varN2 como Entero
	Definir  varN3 como Entero
	Definir  varProm Como Real
	Mostrar ('****** EJ 03 ******')
	
	Mostrar ("Ingrese valor del producto en el Negocio 1")
	Leer varN1
	Limpiar Pantalla
	Mostrar ("Ingrese valor del producto en el Negocio 2")
	Leer varN2
	Limpiar Pantalla
	Mostrar ("Ingrese valor del producto en el Negocio 3")
	Leer varN3
	Limpiar Pantalla
	varProm = (varN1 + varN2 + varN3)/3
	Mostrar  "El Promedio del valor del producto es " ,SubCadena(ConvertirATexto(varProm),0,4)
	
	
	
FinFuncion

Funcion  EJ_04_CambioUnidad
	
	Definir  varMedida como Real
	Definir  varResul Como Real
	
	Mostrar ('****** EJ 04 ******')
	
	Mostrar ("Ingrese valor de la medida en metros")
	Leer varMedida
	Limpiar Pantalla
	
	
	Mostrar  "El valor en cm es: ",varMedida * 100," cm"
	Mostrar ''
	Mostrar  "El valor en mm es: ",varMedida * 1000," mm"
	Mostrar ''
	
	Mostrar  "El valor en pulgadas es: ",varMedida * 39,3701 ," pulgadas"
	
	
	
FinFuncion

Funcion  EJ_05_CalculaCons
	
	Definir  varLitros como Real
	Definir  varKm Como Real
	Definir  varConsumo Como cadena	
	
	Mostrar ('****** EJ 05 ******')
	
	Mostrar ("Ingrese Litros cargados")
	Leer varLitros
	Limpiar Pantalla
	
	Mostrar ("Ingrese KM recorridos")
	Leer varKm
	Limpiar Pantalla
	
	
	varConsumo = Subcadena(ConvertirATexto(varKm / varLitros),0,4)
	
	Mostrar  "El consumo de km/l es: " varConsumo
	Mostrar ''
	
FinFuncion


Funcion  EJ_06_CambiaVar
	
	Definir  num1 como entero	
	Definir  num2 como entero	
	Definir  aux como entero	
	
	
	Mostrar ('****** EJ 06 ******')
	
	Mostrar ("Ingrese valor de num1")
	Leer num1
	Limpiar Pantalla
	
	Mostrar ("Ingrese valor de num2")
	Leer num2
	Limpiar Pantalla
	
	aux  = num1
	num1 = num2
	num2 = aux
	
	mostrar "valor num1: ", num1
	mostrar "valor num2: ", num2
	
FinFuncion
//
//
Funcion  EJ_07_OperacionesBasicas
	
	Definir  num1 como real	
	Definir  num2 como real	

	
	Mostrar ('****** EJ 07 ******')
	
	Mostrar ("Ingrese valor de num1")
	Leer num1
	Limpiar Pantalla
	
	Mostrar ("Ingrese valor de num2")
	Leer num2
	Limpiar Pantalla
	
	Mostrar '( + ) SUMA'
	
	mostrar num1 ,'+', num2 ,'=', num1 + num2
//	mostrar''
	Mostrar '( - ) RESTA'
	
	mostrar num1 ,'-', num2 ,'=', num1 - num2
	mostrar''
	Mostrar '( x ) MULTIPLICACION'
	
	mostrar num1 ,'x', num2 ,'=', num1 * num2
	mostrar''
	Mostrar '( / ) DIVISION'
	
	mostrar num1 ,'/', num2 ,'=', num1 / num2
	mostrar''
	
FinFuncion


Algoritmo pp
	EJ_07_OperacionesBasicas
FinAlgoritmo
