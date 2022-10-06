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
		
		//declaramos que si el num1 es mayor que el num2 y el num2 es mayor que el num3 se imprima num1,num2,num3
		if (numero1 > numero2 && numero2 >numero3 ){
			
			System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		}
		//si el num1 es mayor que el num3 y el num3 es mayor que num2 se imprima num1, num3, num2
		else if (numero1 > numero3 && numero3 > numero2) {
			
			System.out.println(numero1 + ", " + numero3 + ", " + numero2);
		}
		//si el num2 es mayor que el num1  y el num1 es mayor que el num3 se imprime num2, num1, num3
		else if (numero2 > numero1 && numero1 > numero3) {
			
			System.out.println(numero2 + ", " + numero1 + ", " + numero3);
		}
		else if (numero2 > numero3 && numero3 > numero1) {
			
			System.out.println(numero2 + ", " + numero3 + ", " + numero1);
			
		}
		else if (numero3 > numero2 && numero2 > numero1) {
			
			System.out.println(numero3 + ", " + numero2 + ", " + numero1);
		}
		else if (numero3 > numero1 && numero1 > numero2) {
			
			System.out.println(numero3 + ", " + numero1 + ", " + numero2);
		}
		
		//Cerramos el scanner 
		lee.close();
		// TODO Auto-generated method stub

	}

}
