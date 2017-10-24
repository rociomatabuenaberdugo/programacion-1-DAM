/**
 * 
 *Ejercicio 19, bucles: Realiza un programa que pinte una pirámide por
 * pantalla. La altura se debe pedir por teclado. El carácter con el que
 * se pinta la pirámide también se debe pedir por teclado.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio19 {
  public static void main(String[] args) {
	  
	  String car;
	  
	  System.out.println("Dime la altura que quieres que tenga" +
	  " tu pirámide.");
	  int h = Integer.parseInt(System.console().readLine());
	  System.out.println("Dime con qué caráctes quieres que se pinte" +
	  " tu pirámide.");
	  car = System.console().readLine();
	  
	  int alt = 1;
	  int i = 0;
	  int espacio = h - 1;
	  
	  while ( alt <= h ) {
		  
		for ( i = 1; i <= espacio ; i++) {
			System.out.print(" ");
			}
		for ( i = 1; i < alt*2; i++) {
			System.out.print(car);
			}
		System.out.println();
		
		alt++;
		espacio--;
			
	  }
}
}
