/**
 * 
 *Ejercicio 26, bucles: Realiza un programa que pida primero un número
 * y a continuación un dígito. El programa nos debe dar la posición (o
 * posiciones) contando de izquierda a derecha que ocupa ese dígito en
 * el número introducido.
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio26 {
  public static void main(String[] args) {
	  
	  System.out.println("Dime un número y yo te diré la posición que " +
	  "ocupa un dígito de ese número.");
	  System.out.print("Dime un número: ");
	  int numEnt = Integer.parseInt(System.console().readLine());
	  System.out.print("Dime un dígito que pertenezca a ese número: ");
	  int dig = Integer.parseInt(System.console().readLine()); 
	  System.out.println("El dígito " + dig + " ocupa las siguientes " +
	  "posiciones en el número " + numEnt + ": ");
	  
	  int vuelta = 0;
	  int longitud = 0;
	  int posicion = 1;
   //Longitud del número 
	  //Si el número que nos ha dado es 0
	  if ( numEnt == 0) {
		  longitud = 1;
	  }
	  
	  while ( numEnt > 0) {
		vuelta = (vuelta * 10) + (numEnt % 10);
		numEnt /= 10;
		longitud++;   
	  }
	  
	//Posición del número
	while (vuelta > 0) {
		if ((vuelta % 10) == dig) {
			System.out.print(" " + posicion + " ");
			}
		vuelta /= 10;
		posicion++;
	}
	
	System.out.println();
}
}
