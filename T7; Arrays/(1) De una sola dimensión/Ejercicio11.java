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

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] num = new int[10];
		int[] numPrimo = new int[10];
		int[] numNoPrimo = new int[10];
		int i;
		int j;
		int primo = 0;
		int noPrimo = 0;
		boolean esPrimo = false;

		System.out.println("Dime diez números enteros: ");

		for (i = 0; i < 10; i++) {

			num[i] = Integer.parseInt(s.nextLine());

			for (j = 2; j < num[i]; j++) {
				if ((num[i] % j) == 1) {
					esPrimo = true;
				} else {
					esPrimo = false;
				}
			}

			if (esPrimo) {
				numPrimo[primo++] = num[i];
			} else {
				numNoPrimo[noPrimo++] = num[i];
			}
		}

		System.out.println();
		System.out.println();

		System.out.println("Array original:");
		System.out.println("*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");
		System.out.print("* Indice ");
		for (i = 0; i < 10; i++) {
			System.out.printf("*%4d ", i);
		}
		System.out.println("*\n*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");
		System.out.print("* Valor  ");
		for (i = 0; i < 10; i++) {
			System.out.printf("*%4d ", num[i]);
		}
		System.out.println("*\n*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");

		for (i = 0; i < primo; i++) {
			num[i] = numPrimo[i];
		}

		for (i = primo; i < primo + noPrimo; i++) {
			num[i] = numNoPrimo[i-primo];
		}

		System.out.println("\n\nArray con los primos al principio:");
		System.out.println("*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");
		System.out.print("* Indice ");
		for (i = 0; i < 10; i++) {
			System.out.printf("*%4d ", i);
		}
		System.out.println("*\n*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");
		System.out.print("* Valor  ");
		for (i = 0; i < 10; i++) {
			System.out.printf("*%4d ", num[i]);
		}
		System.out.println("*\n*--------*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*");
	}
}
