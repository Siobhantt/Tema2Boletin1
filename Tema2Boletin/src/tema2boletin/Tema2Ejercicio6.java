package tema2boletin;

import java.util.Scanner;

public class Tema2Ejercicio6 {
/*Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen, habrá que indicarlo.
 *  Hay que tener en cuenta que las soluciones de una ecuación de segundo grado
	ax2 + bx + c = 0
			se calculan de la siguiente forma:
			x= -b +- raiz (b*b)-4*a*c/2*a 
*/
	public static void main(String[] args) {
		//declaramos la variables
		double a, b, c, x1, x2, raiz;
		
		//declaramos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos a, b ,c al usuario
		System.out.println("Introduca valor para a: ");
		a = lee.nextDouble();
		
		System.out.println("Introduca valor para b: ");
		b = lee.nextDouble();
		
		System.out.println("Introduca valor para c: ");
		c = lee.nextDouble();
		
		//establecemos la raiz
		 
		raiz = (b*b)-4*a*c;
		
		//establecemos la condicion de que si la raiz es igual a 0 no tiene solucion
		if (raiz < 0) {
			System.out.println("No existe solucion");
		}
		else {//en caso de que no procedemos a hacer las dos operaciones de la formula e imprimimos ambas 
			x1= (-b + Math.sqrt(raiz))/2*a;
			x2= (-b - Math.sqrt(raiz))/2*a;
			
			System.out.println("Hay 2 soluciones, la primera: " + x1 + "Y la segunda: " + x2);
		}
		
		lee.close();
		// TODO Auto-generated method stub

	}

}
