/**
 * 
 *Ejercicio 29, bucles: Escribe un programa que muestre por pantalla 
 * todos los números enteros positivos menores a uno leído por teclado
 * que no sean divisibles entre otro también leído de igual forma.
 * 
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio29 {
  public static void main(String[] args) {
	
	System.out.println("Dime dos números y yo te diré todos los números"
	+ " enteros positivos menores al primero introducido y que no sean "
	+ "divisibles por tu segundo número introducido.");
	System.out.print("Dime un número: ");
	int num = Integer.parseInt(System.console().readLine());
	
	if ( num < 0 ) {
		do {
		System.out.println("El dato metido es negativo, por lo que es " 
		+ "erróneo. Introduce otro número: ");
		num = Integer.parseInt(System.console().readLine());
		} while (num < 0);
		
	}	
	
	System.out.print("Dime el segundo número (no muy grande, por" +
	" favor): ");
	int noDiv = Integer.parseInt(System.console().readLine());
	
	if (num > 0 ) {
		for (int j = 0; j < num; j++) {
			if (( j % noDiv ) != 0) {
				System.out.print(j + " ");
			}
		}
	}
}
}
