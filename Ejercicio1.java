/*Realiza un programa denominado Ejercicio1.java, que dado dos números, imprima los números
desde el primero al segundo, ambos inclusive. Debes tener en cuenta lo siguiente:
Comprobar que el primer número es mayor que el segundo. En caso que no sea así debe imprimir
los número desde el segundo al primero y en el caso que sean iguales deben indicar que son iguales
y no imprimir nada.*/

import java.util.Scanner;
public class Ejercicio1{
	public static void main (String args[]){
		/**
		* @author Jesus
		* @version 1.0
		* @param numero1 introducir un numero
		* @param numero2 introducir un numero
		* @param menor para saber en siguientes casos cual de los dos numeros es menor
		* @param mayor para saber en siguientes casos cual de los dos numeros es mayor
		*/
		
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int menor = 0;
		int mayor = 0;
		
		System.out.println("Introduce el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el primer numero: ");
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		System.out.printf("El valor medio del numero %d y el numero %d es, %.2f%n",numero1,numero2,calcularValorMedio(numero1, numero2)); 
		
		if(numero1 > numero2){
			mayor=numero1;
			menor=numero2;
			System.out.printf("La secuencia del numero %d al numero %d",numero1,numero2);
			for(int i = numero1; i>=numero2; i--){
				System.out.printf("%2d",i);
			}
		}if(numero1 < numero2){
			menor=numero1;
			mayor=numero2;
			System.out.printf("La secuencia del numero %d al numero %d",numero2,numero1);
			for(int i = numero2; i>=numero1; i--){
				System.out.printf("%2d",i);
			}
		}
		
		if (numero1 == numero2){
			System.out.printf("El numero %d es igual al numero %d",numero1,numero2);
		}
		
		System.out.println();
		System.out.println("Vamos a representarlo en dos columnas");
		
		int contador = 0;
		for (int i = mayor; i>=menor; i--){ 
			if(mayor == menor){
				System.out.println("No se puede representar en dos columnas");
				break;
			}
			System.out.printf("%2d",i);
			contador++;
			 if(contador == 2){
				System.out.println();
				contador = 0;
			 }
		}
	}
	
	/**
	 * @author Jesus
	 * @version 1.0
	 * @param valorMenor indica el numero menor introducido
	 * @param valorMayor indica el numero mayor introducido
	 * @return nos devuelve el calculo del valor medio de los dos parametros anteriores
	 */
	public static double calcularValorMedio(int valorMenor, int valorMayor){
		return 1.0*(valorMenor + valorMayor)/2.0;
	}
}
