/**
 * 
 *Ejercicio 24, bucles: Escribe un programa que lea un número n e
 * imprima una pirámide de números con n filas como en la siguiente
 * figura:
 * 
 *     1
 *    121
 *   12321
 *  1234321
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio24 {
  public static void main(String[] args) {
 
	System.out.print("Dime qué altura quieres que tenga tu pirámide " + 
	"de números: ");
	int h = Integer.parseInt(System.console().readLine());
 
	int espaciosDelanteros = h - 1;
	int i = 0;
	int alt =1;
	
	while ( alt <= h) {
	
		//Pintas espacios delanteros
		for (i = 1; i <= espaciosDelanteros; i++) {
			System.out.print(" ");
		}
		
		//Pintar caracteres/////////////////////////////////////////////
		
		//Parte de la izquierda
		for ( i = 1; i < alt; i++) {
			System.out.print(i);	
		}
		
		//Parte de la derecha
		for ( i = alt; i > 0; i--) {
				System.out.print(i);
		}
		
		////////////////////////////////////////////////////////////////
		System.out.println();
	
		alt++;
		espaciosDelanteros--;
	}
}
}
