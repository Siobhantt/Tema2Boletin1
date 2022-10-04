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
		
		System.out.print("1): ");
		numero1 = lee.nextInt();
		System.out.print("2): ");
		numero2 = lee.nextInt();
		
		if (numero1 > numero2) {
			System.out.print(numero1 + ", " + numero2);
		}
		else {
			System.out.println(numero2 + ", " + numero1);
		}
		// TODO Auto-generated method stub

	}

}
