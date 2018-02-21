/**
 * 
 *Ejercicio 23, bucles: Escribe un programa que permita ir introduciendo
 * una serie indeterminada de números mientras su suma no supere el
 * valor 10000. Cuando esto último ocurra, se debe mostrar el total
 * acumulado, el contador de los números introducidos y la media.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio23 {
  public static void main(String[] args) {
 
		int num;
		int suma = 0;
		int contador = 0;
 
		System.out.println("Introduce números hasta que la suma de " + 
		"estos sume 10001 o más. Te mostraré el resultado, el contador " +
		"de números introducidos y la media de estos.");
		
		do {
			num = Integer.parseInt(System.console().readLine());
			contador++;
			suma += num;
		} while ( suma < 10001);
		
		System.out.println("Has introducido " + contador + " números. ");
		
		System.out.println("Esos números han sumado en total " + suma);
		
		System.out.println("Su media es " + (suma/contador));
 }
}
