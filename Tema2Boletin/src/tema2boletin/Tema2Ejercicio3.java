package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio3 {
/*Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero
 * , que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero.
 *  Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.*/
	public static void main(String[] args) {
		//declaramos las variables
		double numeroUsuario;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud
		System.out.println("Introduzca el numero a verificar: ");
		numeroUsuario = lee.nextDouble();
		
		//Verificamos el numero que introducirá el usuario
		if (numeroUsuario < 1 && numeroUsuario > -1 && numeroUsuario!= 0) {
			System.out.println("El numero es un casi-cero.");
		}
		
		else {
		System.out.println("No es casi-cero.");
		}
		
		//cerramos el scanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
