/**
* Ejercicio 2, array bidimensional: Escribe un programa que pida 20 
* números enteros. Estos números enteros se deben introducir en un array
* de 4 filas por 5 columnas. El programa mostrará las sumas parciales de
* filas y columnas igual que si de una hoja de cálculo se tratara. La
* suma total debe aparecer en la esquina inferior derecha.
* 						 
* Rocío Matabuena Berdugo
*/

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
	  
		int[][] num = new int[4][5];
		Scanner s = new Scanner(System.in);
		int fil;
		int col;
		int sumFil;
		int sumCol;

		System.out.print("Dime 20 números enteros: ");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = s.nextInt();
			}
		}

		System.out.println();

		for (fil = 0; fil < 4; fil++) {
			sumFil = 0;
			for (col = 0; col < 5; col++) {
				System.out.printf("%7d   ", num[fil][col]);
				sumFil += num[fil][col];
			}
			System.out.printf("*%7d\n", sumFil);
		}

		for (col = 0; col < 5; col++) {
			System.out.print("***********");
		}
		System.out.println("***********");

		int sumTo = 0;
		for (col = 0; col < 5; col++) {
			sumCol = 0;
			for (fil = 0; fil < 4; fil++) {
				sumCol += num[fil][col];
			}

			sumTo += sumCol;
			System.out.printf("%7d   ", sumCol);
		}
		System.out.printf("*%7d   ", sumTo);
	}
}
