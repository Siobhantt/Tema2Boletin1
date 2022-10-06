package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio7 {
//Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, que está comprendido entre 0 y 99.999. 
	public static void main(String[] args) {
		//Declaramos las variables
		int numero;
		
		//Inicimaos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Procedemos a imprimir la solicitud, leer el numero del usuario y guardarlo en la variables numero
		
		System.out.println("Por favor introduzca un numero entre 0 y 99.999: ");
		numero = lee.nextInt();
		
		//Hacemos la condicion
		
		if (numero < 10 && numero>=0) {
			System.out.println("El numero tiene una cifra");
		}
		else if (numero < 100 && numero >= 10) {
			System.out.println("El numero tiene 2 cifras");
		}
		else if (numero < 1000 && numero >= 100) {
			System.out.println("El numero tiene 3 cifras");
		}
		else if (numero < 10000 && numero >= 1000) {
			System.out.println("El numero tiene 4 cifras");
		}
		else if (numero < 100000 && numero >= 10000) {
			System.out.println("El numero tiene 5 cifras");
		}
		
		//cerramos el scanner
		
		lee.close();
		// TODO Auto-generated method stub

	}

}
