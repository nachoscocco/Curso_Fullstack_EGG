
Funcion ret=codif_word(palabra)
	Definir long,i Como Entero
	definir letra,ret Como Caracter
	long =Longitud(palabra)
	ret=''
	Para i<-0 Hasta long  Hacer
		letra=Subcadena(palabra,i,i)
		
		Segun letra Hacer
			'a' O 'A':
				letra='@'
			'e' o 'E':
				letra='#'
			'i' o 'I':
				letra='$'
			'o' o 'O':
				letra='%'
			'u' o 'U':
				letra='*'
	
		Fin Segun
		ret = Concatenar(ret,letra)
	Fin Para
FinFuncion



Algoritmo pp9
	Definir word como cadena
	Escribir "Ingrese una palabra a codificar"
	leer word
	Escribir "su palabra codificada es ",codif_word(word)
	
	
FinAlgoritmo
