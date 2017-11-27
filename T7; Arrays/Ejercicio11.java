/**
* Ejercicio 11, arrays: Realiza un programa que pida 10 números por
* teclado y que los almacene en un array. A continuación se mostrará
* el contenido de ese array junto al índice (0-9) utilizando para ello
* una tabla. Seguidamente el programa pasará los primeros a las primeras
* posicioes, desplazando el resto de números (los que no son primos) de
* tal forma que no se pierda ninguno. Al final se debe mostrar el array
* resultante.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio11 {
  public static void main(String[] args) {
	  
		int[] num = new int[10];
		int[] numPrimo = new int[10];
		int[] numNoPrimo = new int[10];
		int i;
		int j;
		int primo = 0;
		int noPrimo = 0;

		System.out.println("Dime diez números enteros: ");

		for (i = 0; i < 10; i++) {

			num[i] = Integer.parseInt(System.console().readLine());

			for (j = 2; j < num[i]; j++) {
				if ((num[i] % j) == 0) {
					numPrimo[primo++0] = num[i];
				} else {
					numNoPrimo[noPrimo++] = num[i];
				}
			}

		}

		System.out.println();
		System.out.println();

		for (i = 0; i < primo; i++) {
			num[i] = numPrimo[i];
		}

		for (i = primo; i < 10; i++) {
			num[i] = numNoPrimo[i - primo];
		}

		System.out.println("Array obtenido:");
		for (i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
