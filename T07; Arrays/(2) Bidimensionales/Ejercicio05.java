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
  {
	  
		int[][] num = new int[6][10];
		int numMax = -1;
		int numMin = 1001;
		int posicionimin = 0;
		int posicionjmin = 0;
		int posicionimax = 0;
		int posicionjmax = 0;
		int fil;
		int col;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				num[i][j] = (int) (Math.random() * 1001);

				if (numMin > num[i][j]) {
					numMin = num[i][j];
					posicionimin = i;
					posicionjmin = j;
				}

				if (numMax < num[i][j]) {
					numMax = num[i][j];
					posicionimax = i;
					posicionjmax = j;
				}

			}
		}
		
		System.out.print("               ");
		for (col = 0; col < 10; col++) {
			System.out.printf("%-7s %2d   ","Columna", col + 1);
		}
		
		System.out.println();
		
		for (fil = 0; fil < 6; fil++) {
			System.out.print("Fila " + (fil+1) + "      ");
			for (col = 0; col < 10; col++) {
				System.out.printf("%10d   ", num[fil][col]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.print("El número máximo de la anterior serie de"
				+ " números se encuentra en la fila " +
				(posicionimax+1) + " y  en la columna " +
				(posicionjmax+1));

		System.out.println();

		System.out.print("El número mínimo de la anterior serie de"
				+ " números se encuentra en la fila " + (posicionimin+1)
				+ " y  en la columna " + (posicionjmin+1));
	}
}
