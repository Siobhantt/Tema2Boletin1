package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio9 {
/*Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA.
	El juego debe mostrar por pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar el caso de que empaten.*/
	
	public static void main(String[] args) {
		//Declaramos las variables
		int jugador1, jugador2;
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud al usuario y guardamos las opciones en sus variables correspondientes
		
		System.out.println("¡Esto es piedra, papel o tijeras!");
		System.out.println("Piedra es el numero 1.");
		System.out.println("Papel es el numero 2.");
		System.out.println("Tijeras es el numero 3.");
		System.out.println("Jugador 1, indique cual sera su elemento: ");
		System.out.println("Jugador 2, indique cual sera su elemento: ");
		jugador1 = lee.nextInt();
		jugador2 = lee.nextInt();
		
		if (jugador1 == jugador2) {
			System.out.println("EMPATE!");
		}
		else if (jugador1 == PIEDRA && jugador2 == TIJERAS || jugador1 == PAPEL && jugador2 == PIEDRA || jugador1 == TIJERAS && jugador2 == PAPEL) {
			System.out.println("Gana el jugador 1!");
		}
		else {
			System.out.println("Gana el jugador 2!");
		}
		
		//cerramos el scannenr
		lee.close();
	
		

	}

}
