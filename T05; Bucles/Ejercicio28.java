/**
 * 
 *Ejercicio 28, bucles: Escribe un programa que calcule el factorial de
 * un número entero leído por teclado.
 * 
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio28 {
  public static void main(String[] args) {
	
	int num;
	
	do {
		System.out.print("Introduce un número y yo te diré su" +
		" factorial: ");
		num = Integer.parseInt(System.console().readLine());	
		
		if (num < 0) {
			System.out.print("El número es negativo, por lo cual no " +
			"puedo hacer su factorial. Introduce otro número distinto: ");
		}
	} while ( num < 0);
	
	int factor = num;
	
	if ( num == 0) {
		System.out.println("El factorial de 0 es 1.");
		System.out.print("(0! = 1)");
	} else {
		for (int i = 1; i < num; i++) {
			factor *= i;
			}
	System.out.println("El factorial de " + num + " es " + factor);
	System.out.print("(" + num + "! = " + factor + ")");	
	}					
}
}
