/**
 * 
 *Ejercicio 20, bucles: Igual que el ejercicio anterior pero esta vez se
 * debe pintar una pirámide hueca.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio20 {
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
	  int internos = 0;
	  
	  while ( alt < h ) {
		  
		for ( i = 1; i <= espacio ; i++) {
			System.out.print(" ");
			}
			
			System.out.print(car);
		for ( i = 1; i < internos; i++) {
			System.out.print(" ");
			}
			if (alt > 1) {
				System.out.print(car);
				}
		System.out.println();
		
		alt++;
		espacio--;	
		internos += 2;	
	  }
	  for (i = 1; i<alt*2; i++) {
		  System.out.print(car);
		  }
}
}
