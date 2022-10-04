package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio1 {
//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
	
	public static void main(String[] args) {
		//Declaramos las variables
		int numeroUsuario, resto;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud y leemos el numero
		System.out.println("Por favor introduzca el numero a verificar: ");
		numeroUsuario = lee.nextInt();
		
		//en la variable resto guardaremos el resto de la divison que nos dirá si es par o impar
		resto = numeroUsuario % 2;
		
		//establecemos la condicional doble donde si el resto de la divison es igual a 1 nos imprimirá en pantalla que el numero es impar
		
		if (resto == 1) {
			System.out.println("El numero es impar!");		
		}
		
		//pero si al contrario es 0 imprimira que el numero introducido por el usuario es par
		
		else {
			System.out.println("El numero es par!");
		}
		
		//cerramos el Scanner
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
