package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio10 {
//Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número.
	public static void main(String[] args) {
		//declaramos las variables
		int numero1User, numero2User,numero3User;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos los numeros al usuario
		
		System.out.println("Introduzca un entero: ");
		numero1User = lee.nextInt();
		System.out.println("Introduzca un entero: ");
		numero2User = lee.nextInt();
		System.out.println("Introduzca un entero: ");
		numero3User = lee.nextInt();
		
		//hacemos la condicion en la que si numero1User y numero2User son iguales a numero3User se imprima en pantalla 
		
		if (numero1User + numero2User == numero3User) {
			System.out.println("La suma del primer y el segundo numero da como resultado el tercero!");
		}
		else if (numero2User + numero3User == numero1User) {
			System.out.println("La suma del segundo y el tercer numero da como resultado el primero!");
		}
		else if (numero3User + numero1User == numero2User) {
			System.out.println("La suma del tercer y el primer numero da como resultado el segundo!");
		}
		else {
			System.out.println("La suma de 2 los numeros NO da como resultado el otro");
		}
		
		
		//cerramos el scanner
		
		lee.close();


	}

}
