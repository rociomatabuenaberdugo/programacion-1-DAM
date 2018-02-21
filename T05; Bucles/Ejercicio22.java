/**
 * 
 *Ejercicio 22, bucles: Muestra por pantalla todos los números primos
 * entre 2 y 100, ambos incluidos.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio22 {
  public static void main(String[] args) {
 
	boolean siPrimo = true;
 
	for (int n = 2 ; n < 101 ; n++) {
		
		siPrimo = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0 ) {
				siPrimo = false;
		}
	}
	
	if (siPrimo) {
		System.out.print(" " + n + " ");
	}
	}
	
	System.out.println();
	
 }
}
