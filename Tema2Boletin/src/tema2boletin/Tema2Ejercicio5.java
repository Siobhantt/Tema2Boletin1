package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio5 {
//Pedir tres números y mostrarlos ordenados de mayor a menor.
	public static void main(String[] args) {
		//Declaramos las variables
		int numero1, numero2, numero3;
	
		//declaramos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos los numeros a comparar
		System.out.println("Introduzca el primer numero: ");
		numero1 = lee.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		numero2 = lee.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		numero3 = lee.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println(numero1);
		}
		else 
		}
		
		// TODO Auto-generated method stub

	}

}
