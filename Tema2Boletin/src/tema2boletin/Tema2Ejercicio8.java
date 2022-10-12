package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio8 {
/*Escribir una aplicación que pida al usuario un número real y muestre por pantalla la nota del alumno, teniendo en cuenta:
	[0-5) es INSUFICIENTE (0 inclusive)
	[5-6) es SUFICIENTE (5 inclusive)
	[6-7) es BIEN (6 inclusive)
	[7-9) es NOTABLE (7 inclusive)
	[9-10] es SOBRESALIENTE (9 y 10 inclusives)
*/
	
	public static void main(String[] args) {
		//Declaramos las variables 
		double nota;
		
		//Declaramos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Leemos el numero del usuario y lo guardamos en una variable llamada nota
		System.out.println("Por favor introduzca la nota: ");
		nota = lee.nextDouble();
		
		//hacemos las comparaciones de las notas paras meterlas en los intervalos correspondientes
		
		if (nota<5 && nota >=0) {
			System.out.println("Su nota es INSUFICIENTE." );
		}
		else if (nota<6 && nota >=5) {
			System.out.println("Su nota es SUFICIENTE");
		}
		else if (nota<7 && nota >=6) {
			System.out.println("Su nota es BIEN");
		}
		else if (nota<9 && nota >=7) {
			System.out.println("Su nota es NOTABLE");
		}
		else if (nota<10 && nota >=9) {
			System.out.println("Su nota es SOBRESALIENTE");
		}
		
		//cerramos el SCANNER
		
		lee.close();
		
		

	}

}
