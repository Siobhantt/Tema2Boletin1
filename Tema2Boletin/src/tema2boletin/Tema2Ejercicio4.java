package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio4 {
	//Pedir dos números y mostrarlos ordenados de menor a mayor.
	public static void main(String[] args) {
		//Declaramos las variables
		int numero1, numero2;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos los numeros
		System.out.println("Por favor introduzca los numeros: ");
		
		System.out.print("Primer numero: ");
		numero1 = lee.nextInt();
		System.out.print("Segundo numero: ");
		numero2 = lee.nextInt();
		
		if (numero1 < numero2) {
			System.out.print(numero1 + ", " + numero2);
		}
		else {
			System.out.println(numero2 + ", " + numero1);
		}
		
		//Cerramos el scanner
		lee.close();
		// TODO Auto-generated method stub

	}

}
