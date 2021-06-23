

Funcion EjExt1_CantPibesEsc
	
	Definir varB como numero
	Definir varG como numero
	Definir varTotal Como Real
	Definir  varBps Como cadena	
	Definir  varGps Como cadena
	
    Mostrar ('****** EJ EXTRA 01 ******')
	Mostrar "ingresa cant niños"
	leer varB
	Limpiar Pantalla
	
	Mostrar "ingresa cant niñas"
	Leer  varG
	Limpiar Pantalla
	
	varTotal = varB + varG              //500 100
							        //300  X
	
	varBps = Subcadena(ConvertirATexto((varB*100)/varTotal),0,4)
	
	varGps = Subcadena(ConvertirATexto((varG*100)/varTotal),0,4)
	
	Mostrar 'Cantidad de Niños: ',varB
	Mostrar 'Cantidad de Niñas: ',varG
	Mostrar 'Cantidad de Niños totales: ',varTotal
	Mostrar '---------'
	Mostrar '---------'
	Mostrar 'Porcentaje de Niños: ',varBps,'%'
	Mostrar 'Porcentaje de Niñas: ',varGps,'%'

	
FinFuncion


Funcion EjExt2_AreaPerim
	
	Definir base como numero
	Definir altura como numero
	
	Mostrar ('****** EJ EXTRA 02 ******')
	Mostrar "Ingresa la base del rectuangulo"
	leer base
	Limpiar Pantalla
	
	Mostrar "Ingresa el altura del rectuangulo"
	Leer  altura
	Limpiar Pantalla
	

	Mostrar 'Area del rectangulo:      ',base * altura
	Mostrar 'Perimetro del rectangulo: ',(2*base + 2*altura)
	
	
FinFuncion

Funcion EjExt3_VolumenCilindro
	
	Definir radio como real
	Definir altura como real
	Definir volumen como cadena
	
	Mostrar ('****** EJ EXTRA 03 ******')
	Mostrar "Ingresa el radio del cilindro"
	leer radio
	Limpiar Pantalla
	
	Mostrar "Ingresa el altura del cilindro"
	Leer  altura
	Limpiar Pantalla
	
	volumen = Subcadena(ConvertirATexto(PI * radio^2 *altura ),0,4)
	
	Mostrar ''
	Mostrar ''
	Mostrar 'Volumen del cilindro: ',volumen,"cm3"
	
	
FinFuncion

Funcion EjExt4_CalcHMS
	
	Definir dias como entero
	
	Mostrar ('****** EJ EXTRA 04 ******')
	Mostrar "Ingresa los dias a convertir:"
	leer dias
	Limpiar Pantalla
	
    Mostrar ''
	Mostrar  dias ,' dias'
	Mostrar  dias*24 ,' hs'
	Mostrar  dias*1440,' min'
	Mostrar  dias*86400,' seg'
	
	
FinFuncion

Funcion EjExt5_Aumento
	
	Definir pinic como real
	Definir pfin como real
	Definir porc como cadena
	
	Mostrar ('****** EJ EXTRA 05 ******')
	Mostrar "Ingresa precio del prod a inicio de año:"
	leer pinic
	Limpiar Pantalla
	Mostrar "Ingresa precio del prod a fin de año  :"
	leer pfin
	Limpiar Pantalla
	
	porc = Subcadena(ConvertirATexto( ((pfin*100)/pinic)-100),0,4)
	
	Mostrar 'El porcentaje de aumento es del: ',porc,' %'
	
    
	
	
FinFuncion


Algoritmo ppextra
	
	EjExt5_Aumento
	
FinAlgoritmo
