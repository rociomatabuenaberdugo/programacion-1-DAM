/**
* Ejercicio 24, números aleatorio: Escribe un programa que muestre por
* pantalla 100 números enteros separados por un espacio. Los números
* deben estar generados de forma aleatoria en un rango entre 10 y 200,
* ambos incluidos. Los primos deben aparecer entre almohadillas(p. ej.
* #19#) y los múltiplos de 5 entre corchetes (p.ej. [25]).
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio24 {
  public static void main(String[] args) {
	  
		int num = (int)(Math.random() *191 + 10);
		
		for (int i = 2; i < num; i++) {
			if (num % i == 1) {
				System.out.print("#" + num + "# ");
			}
			if (num % 5 == 0) {
				System.out.print("[" + num + "] ");
			}
			else if {
				System.out.print( num + " ");
			}
		}
		
	}
}
