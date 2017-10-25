/**
 * 
 *Ejercicio 24, bucles: Escribe un programa que lea un número n e 
 * imprima una pirámide de número con n filas como en la siguiente figura:
 * 
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio24 {
  public static void main(String[] args) {
 
	int h;
	int altura = 1;
	int i = 0;
	
	System.out.println("¿Cuántas filas quieres que tenga tu " + 
	"pirámide?");
	h = Integer.parseInt(System.console().readLine());
 
	int espacio = h - 1;
	
	while ( altura <= h ) {
					//espacios
		for (i=1; i <= espacio ; i++) {
			System.out.print(" ");
		}
					//caracteres
		for (i=1; i < altura; i++) {
			System.out.print(i);
		}
		for ( i=altura; i > 0; i--) {
			System.out.print(i);
			}
		System.out.println();
		
		altura++;
		espacio--;
 }
}
}
