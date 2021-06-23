
Funcion fn_valida_nota8
	Definir nota,c Como Real;
	Definir bandera como caracter;
	
	bandera = 'S'
	c = 0
	Repetir
		Escribir  "ingrese nota"
		leer nota
		si nota >=1 y nota <=10
			bandera = 'S'
		SiNo
			bandera='N'
			
		FinSi
		
		c = c + 1 
	Hasta Que c = 3
	
	si bandera = 'S'
		Escribir "notas correctas"
	SiNo
		Escribir "notas incorrectas"
		
	FinSi
	
	
FinFuncion

Funcion fn_letra_a_9
	Definir cad como cadena
	Escribir "ingrese una cadena"
	leer cad
	cad = SubCadena(cad,0,0)
	
	si cad = 'A' o cad = 'a'
		Mostrar 'CORRECTA'
	SiNo
		Mostrar cad
		Mostrar 'INCORRECTA'
		
	FinSi

FinFuncion

Funcion fn_letra_10
	Definir cad como cadena
	Definir  car1,car2 como caracter
	Escribir "ingrese una cadena"
	leer cad
	car1 = SubCadena(cad,0,0)
	car2 = Subcadena(cad,Longitud(cad)-1,Longitud(cad))
	car1 = Mayusculas(car1)
	car2 = Mayusculas(car2)

	si car1 = car2
		Mostrar 'CORRECTA'
	SiNo
		Mostrar cad
		Mostrar 'INCORRECTA'
		
	FinSi
	
FinFuncion

Funcion fn_menu_11
	Definir  op,continua Como Caracter
	definir num1,num2 Como entero
	Repetir
		
		
		Escribir "         //MENU//          "
		Escribir "  INGRESE UNA OPCION       " 
		Escribir "  S- SUMA                  " 
		Escribir "  R- RESTA                 " 
		Escribir "  M- MULTIPLICACION        " 
		Escribir "  D- DIVISION              " 
		Leer op
		op = Mayusculas(op)
		Limpiar Pantalla
		Escribir "Ingrese el primer numero   "
		Leer num1
		Limpiar Pantalla
		Escribir "Ingrese el segundo numero   "
		Escribir op
		Leer num2
		Limpiar Pantalla
		Segun op hacer
			Opcion "S":
				Escribir"    ", num1," + ",num2," = ",num1+num2
			Opcion "R":
				Escribir"    ", num1," - ",num2," = ",num1-num2
			Opcion 'M':
				Escribir"    ", num1," x ",num2," = ",num1*num2
			Opcion 'D':
				Escribir"    ", num1," / ",num2," = ",num1/num2
			De Otro Modo:
				Escribir 'OPCION INCORRECTA'
		FinSegun
		
		
		Escribir "desea continuar? V/F"
		Leer continua
		continua = Mayusculas(continua)
		Limpiar Pantalla
	Mientras Que continua ='v' o continua ='V'
	
	
	
FinFuncion

Funcion fn_operario13
	Definir perf,defec como entero
	Definir  grado como cadena
	
	Escribir "ingrese cant de tornillos defectuosos"
	leer defec
	Escribir "ingrese cant de tornillos sin defectos"
	leer perf
	
	si defec < 200
		grado= '6'
		si perf > 10000
			grado = '8'
		FinSi
	SiNo
		si perf > 10000
			grado = '7'
		SiNo
			grado = '5'
		FinSi
		
		
	FinSi
	
	Escribir "el grado es ",grado
	
	
	
FinFuncion

Funcion fn_sumatoria_15
	Definir vInic,vAux,vSum,vConta Como Entero
	Escribir "Ingrese un valor inicial"
	leer vInic
	vConta=0
	vSum = 0
	
	Repetir
		Limpiar Pantalla
		vConta = vConta +1
		Escribir "Ingrese un numero a sumar  "
		Escribir "                 rep. nro: ",vConta
		Leer vAux
		vSum = vSum + vAux
		
	Hasta Que vInic < vSum
	Limpiar Pantalla
	Escribir "se completo la ejecucion con ",vConta," repeticiones"
	Escribir "Numero Inicial= ",vInic
	Escribir "Numero Final =  ",vSum
	
	
	
FinFuncion

Funcion fn_prom_16
	Definir input,sum Como Real
	Definir  conta Como Entero
	conta=0
	sum=0
	Hacer
		Escribir 'Ingrese un numero ,y ingrese -1 para finalizar'
		Leer input
		sum = sum + input
		conta = conta +1
	Mientras Que input <> (-1)
	sum = sum +1
	conta = conta - 1
	sum =  sum / conta
	Escribir  "promedio es=", sum
	
FinFuncion

Funcion fn_func19
	Definir i Como Entero

	Para i<- 1 Hasta 9  Hacer
		Escribir i," al cuadrado es=",i*i
		
	FinPara

FinFuncion

Funcion fn_func20
	Definir frase como cadena
	Definir car Como Caracter
	Definir lng,i Como Entero
	
	Escribir "ingrese una frase"
	Leer  frase
	lng = Longitud(frase)
	Limpiar Pantalla
	Para i<-0 Hasta lng Hacer
		car = Subcadena(frase,i,i)
		escribir Sin Saltar car," "
	Fin Para
	
FinFuncion

Funcion fn_prom_21
	definir nota1,nota2,nota3,notaF,promRechazo,porcMejores,mayorExpo como Real
	definir cantEst,c1,cantRechazo,cantMejores,cantRegulares como entero
	c1=0
	cantRechazo = 0
	mayorExpo = 0
	cantMejores = 0
	cantRegulares = 0
	promRechazo = 0
	Escribir "Ingrese cantidad de estudiantes"
	leer cantEst
	Repetir
		Escribir "estudiante numero=",c1+1
		Escribir "ingrese del parcial"
		leer nota1
		Limpiar Pantalla
		Escribir "ingrese de la integrador"
		leer nota2
		Limpiar Pantalla
		Escribir "ingrese nota expo"
		leer nota3
		Limpiar Pantalla
			si nota3>mayorExpo
				mayorExpo = nota3
		FinSi
		
		
		nota1 = (40*nota1)/100
		nota2 = (35*nota2)/100
		nota3 = (25*nota3)/100
		notaF= nota1 + nota2 + nota3
		
		si  notaF < 6.5 
			promRechazo = notaF + promRechazo
			cantRechazo = cantRechazo + 1
		FinSi
		si notaF >= 4 y notaF <= 7.5
			cantRegulares = cantRegulares+1
		FinSi
		
		si notaF > 7.5
			cantMejores = cantMejores + 1
		FinSi
		
		
		c1=c1+1
		
	Hasta Que c1 = cantEst
	
	Escribir "Nota promedio reprobados              =", promRechazo /cantRechazo
	Escribir "Porcentaje con nota mayor a 7         = ", (cantMejores*100)/cantEst, "%"
	Escribir "Mayor nota obtenida en exposiciones   = ",mayorExpo
	Escribir "estudiantes q obtuvieron entre 4 y 7,5= ",cantRegulares
	
	
	
	
FinFuncion

//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza 
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor 
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la 
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada 
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto 
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por 
//cada venta
Funcion fn_func23
	Definir  cantVend,ventasVen,c,c2 Como Entero
	Definir sueldoBase,comision,valorVenta,acumVenta Como Real
	
	Escribir "Ingrese la cantidad de vendedores "
	leer cantVend
	
	c=0
	Repetir
	//vendedor
		Escribir "Vendedor numero:",c+1
		Escribir "Ingrese cantidad de ventas del vendedor nro: ",c+1
		Leer ventasVen
		Escribir "Ingrese sueldo base para vendedor nro: ",c+1
		leer sueldoBase
		Limpiar Pantalla
		c2=0
		acumVenta=0   //va a acumular el  monto total de ventas x vendedor y se limpia cada vez q cambio vendedor
		Repetir
		//venta
			Escribir  "ingrese el monto de la venta nro=",c2+1
			Leer valorVenta
			acumVenta = valorVenta + acumVenta
			c2=c2+1
			Limpiar Pantalla
		hasta Que ventasVen = c2
		comision= (acumVenta*10)/100
		escribir "Ventas x comision del vendedor nro ",c+1,"= ",comision
		Escribir "Sueldo basde del vendedor nro ",c+1,"     = ",sueldoBase
		Escribir "Sueldo total del vendedor nro ",c+1,    " = ",comision+sueldoBase
		Esperar Tecla
		Limpiar Pantalla
		c=c+1
		
		
	Hasta Que c = cantVend
	
	
	
	
FinFuncion



Algoritmo pp_2
	
	
	fn_func23

FinAlgoritmo
