/**
* Ejercicio 25, números aleatorio: Escribe un programa que muestre por
* pantalla 100 números enteros separados por un espacio. Los números
* deben estar generados de forma aleatoria en un rango entre 10 y 200,
* ambos incluidos. Los primos deben aparecer entre almohadillas(p. ej.
* #19#) y los múltiplos de 5 entre corchetes (p.ej. [25]).
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio25 {
  public static void main(String[] args) {
	  
		for (int b = 0; b < 100; b++) {
			int num = (int) (Math.random() * 191 + 10);
			
			boolean esPrimo = true;
		
			for (int j = 2; j < num; j++) {
				if ((num % j) == 0) {
					esPrimo = false;
				}
			}

			if (esPrimo) {
				System.out.print(" #" + num + "# ");
			} else if ((num % 5) == 0) {
				System.out.print(" [" + num + "] ");
			} else {
				System.out.print(" " + num + " ");
			}
		} 
	}
}
