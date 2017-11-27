/**
* Ejercicio 10, arrays: Escribe un programa que genere 20 números
* enteros aleatorios entre 0 y 100 y que los almacene en un array. El
* programa debe ser capaz de pasar todos los números pares a las
* primeras posicionaes del array (del 0 en adelante) y que todos los
* números impares a las celdas restantes. Utiliza arrays auxiliares si
* es necesario.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio10 {
  public static void main(String[] args) {
	  
	  
		int[] num = new int[20];
		int[] numPar = new int[20];
		int[] numImpar = new int[20];
		int i;
		int par = 0;
		int impar = 0;

		System.out.println("Veinte números aleatorios entre 0 y 100("
				+ "primero pares y después imapres):");

		for (i = 0; i < 20; i++) {

			num[i] = (int) (Math.random() * 101);
			
			if (num[i] % 2 == 0) {
				numPar[par++] = num[i];
			} else {
				numImpar[impar++] = num[i];
			}

		}

		System.out.println();
		System.out.println();

		for (i = 0; i < par; i++) {
			num[i] = numPar[i];
		}

		for (i = par; i < 20; i++) {
			num[i] = numImpar[i - par];
		}

		System.out.println("Array obtenido:");
		for (i = 0; i < 20; i++) {
			System.out.print(num[i] + " ");
		}

	}
}

