/**
* Ejercicio 4, números aleatorio: Muesta 20 núumeros enteros aleatorios
* entre 0 y 10 (ambos incluidos) separados por espacios.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("20 números aleatorios entre 0 y 10:");
    
    for (int i = 0; i != 20; i++) {
		System.out.print((int)(Math.random()*11) + " ");
		}
  }
}
