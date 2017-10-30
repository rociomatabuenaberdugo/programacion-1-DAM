/**
 * 
 *Ejercicio 25, bucles: Realiza un programa que pida un número por
 * teclado y que luego muestre es número al revés.
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio25 {
  public static void main(String[] args) {
 
	System.out.println("Dime un número y yo te lo diré del revés.");
	int num = Integer.parseInt(System.console().readLine());
		
	int vuelta = 0;
	int numresul = num;
	while ( num > 0) {
		vuelta = (vuelta * 10) + (num % 10);
		num/=10;
	}
	
	System.out.println("Si le damos la vuelta al número " + numresul +
	" el resultado es " + vuelta);
}
}
