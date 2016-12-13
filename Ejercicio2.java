/*Crea un programa denominado Ejercicio2.java que leída una frase con la clase Scanner implemente
la siguiente lógica: (en el caso que no seas capaz de usar la clase Scanner incluye la frase en el
código fuente, esto te restará medio punto)
Nos de el número de z y c que contiene la frase.
Nos de el número de palabras que contiene.
Nos de la frase en mayúscula y en minúscula concatenada*/

import java.util.Scanner;
public class Ejercicio2{
	public static void main (String args[]){
		Scanner teclado = new Scanner (System.in);
		String fraseLeida;
		int contador = 0;
		
		System.out.println("Introduce una frase: ");
		fraseLeida = teclado.nextLine();
		teclado.close();
		
		System.out.printf("La frase introducida %s tiene un numero de letras z de %d%n",fraseLeida,numeroLetrasZ(fraseLeida,contador));
		System.out.printf("La frase introducida %s tiene un numero de letras c de %d%n",fraseLeida,numeroLetrasC(fraseLeida,contador));
		System.out.println("La frase en minuscula + mayuscula es " + fraseLeida.toUpperCase() + " " + fraseLeida.toLowerCase());
		System.out.printf("La frase tiene %d palabras",numeroPalabras(fraseLeida,contador));
	}
		
	public static int numeroLetrasZ(String fraseLeida, int contador){
		for (int i = 0; i<fraseLeida.length(); i++){
			if(fraseLeida.charAt(i) == 'z'){
				contador++;
			}
		}
		return contador;
	}
	
	public static int numeroLetrasC(String fraseLeida, int contador){
		for (int i = 0; i<fraseLeida.length(); i++){
			if(fraseLeida.charAt(i) == 'c'){
				contador++;
			}
		}
		return contador;
	}
	
	public static int numeroPalabras(String fraseLeida, int contador){
		contador = contador + 1;
		for (int i=0; i<fraseLeida.length(); i++){
			if(fraseLeida.charAt(i) == ' '){
				contador++;
			}
		}
		return contador;
	}
}
