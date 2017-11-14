/**
* Ejercicio 14, números aleatorio: Realiza un programa que haga justo
* lo contrario a lo que hace el ejercicio 6. El programa intentará
* adivinar el número en el que estás pensando - un número entre 0 y 100-
* teniendo para ello 5 oportunidades . En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o
* menor quue el que te acaba de decir.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio14 {
  public static void main(String[] args) {
  
	System.out.print("Dime el número en el que estés pensando" +
	" -entre 0 y 100- (sólo tendré 5 intentos para adivinarlo): ");
	int numUsu = Integer.parseInt(System.console().readLine());
	System.out.println(" ");
	do {
		System.out.println("Te he dicho que tiene que ser un número " +
		"entre 0 y 100");
		System.out.print("Introduce otro número: ");
		numUsu = Integer.parseInt(System.console().readLine());
	} while ( (numUsu < 0) && (numUSu > 100));
  
    int numCom; = (int)(Math.random()*101);
	int tryi = 5;
	
	do {
		numCom = (int)(Math.random()*101);
		tryi--;
	
	} while ( (numCom != numUsu) && (tryi > 0);
	
	if (numCom != numUsu) {
		System.out.print("Felicidades, has ganado tú. No he " +
		"conseguido adivinar tu número antes de que se me acabaran " +
		"los cinco intentos.");
	}
   
 }
}
