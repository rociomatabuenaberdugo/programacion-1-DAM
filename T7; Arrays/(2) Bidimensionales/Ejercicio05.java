/**
* Ejercicio 5, array bidimensional: Realiza un programa que rellene un
* array de 6 filas por 10 columnas con números enteros positivos
* comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el
* programa deberá dar la posición tanto del máximo como del mínimo.
* 						 
* Rocío Matabuena Berdugo
*/



public class Ejercicio05 {
  public static void main(String[] args) 
  throws InterruptedException{
	  
		int[][] num = new int[4][5];
		int fil;
		int col;
		int sumFil;
		int sumCol;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = (int)(Math.random()*900 + 100);
			}
		}

		System.out.println();

		for (fil = 0; fil < 4; fil++) {
			sumFil = 0;
			for (col = 0; col < 5; col++) {
				Thread.sleep(500);
				System.out.printf("%7d   ", num[fil][col]);
				sumFil += num[fil][col];
			}
			System.out.print("*");
			Thread.sleep(1500);
			System.out.printf("%7d\n", sumFil);
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
			
			Thread.sleep(1500);
			sumTo += sumCol;
			System.out.printf("%7d   ", sumCol);
		}
		
		System.out.print("*");
		Thread.sleep(1500);
		System.out.printf("%7d   ", sumTo);
	}
}
