/**
 *Ejercicio 12, bucles: Escribe un programa que muestre los n primeros 
 * términos de la serie de Fibonacci. El primer término de la serie de 
 * Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3,
 * 5, 8, 13, 21, 34, 55, 89, 144,... El número n se debe introducir por
 * teclado.
 *
 *Rocío Matabuena Berdugo
 */

public class Ejercicio12 {
  public static void main(String[] args) {
        
    System.out.println("Dime cuántos números quieres que muestre de " +
    "la serie de Fibonacci. ");
    
	int num = Integer.parseInt(System.console().readLine());
	
	switch (num) {
		case 1:
		System.out.print("0");
		break;
		case 2:
		System.out.print("0, 1");
		break;
		default:
		System.out.print("0, 1");
		int fib1 = 0;
		int fib2 = 1;
		int help;
		while (num > 2) {
			help = fib1;
			fib1 = fib2;
			fib2 = help + fib1;
			System.out.print(", " + fib2);
			num--;
		}	
      }
    }
  }
