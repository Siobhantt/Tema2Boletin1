package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio2 {

	//Pedir dos números enteros y decir si son iguales o no.
	
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero1, numero2;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos en pantalla la solicitud de los numeros y los guardamos en sus variables correspondientes que son numero1 y numero2
		System.out.println("Por favor introduzca el numero 1: ");
		numero1 = lee.nextInt();
		
		System.out.println("Por favor introduzca el numero 2: ");
		numero2 = lee.nextInt();
		
		//Realizamos la compraracion he imprimimos en pantalla segun si son iguales o no
		if (numero1 == numero2) {
			System.out.println("Los numeros introducidos son iguales.");
		}
		else {
			System.out.println("Los numeros introducidos son distintos.");
		}
		
		//cerramos el scanner
		lee.close();
		// TODO Auto-generated method stub

	}

}
