/**
* Ejercicio 14, números aleatorio: Realiza un programa que haga justo
* lo contrario a lo que hace el ejercicio 6. El programa intentará
* adivinar el número en el que estás pensando - un número entre 0 y 100-
* teniendo para ello 5 oportunidades . En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o
* menor que el que te acaba de decir.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio14 {
  public static void main(String[] args) {
  
	System.out.println("Piensa un número entre el 100 y el 0. Yo tendré" + 
	" que intentar adivinar tu número con un máximo de cinco intentos.");
    System.out.println("Pulsa INTRO para comenzar.");
    System.console().readLine();
    int numUsu;
	int tryi = 5;
	int numMin = 0;
	int numMax = 100;
	int numOp;
	boolean acierto = false;
	
	
	do {
		int numCom = (int)(Math.random()*(numMax - numMin) + numMin);
		
		System.out.print("¿Es " + numCom + " mayor (1) a tu número," +
		" menor (2) o igual (3) al tuyo? ");
		numOp = Integer.parseInt(System.console().readLine());
		tryi--;
		
		if ( (numOp == 1) && (tryi > 0) ) {
			numMax = numCom;
		}
		if ( (numOp == 2) && (tryi > 0) ) {
			numMin = numCom;
		}
		if (numOp == 3) {
			numUsu = numCom;
			acierto = true;
			System.out.print("¡Bien! He acertado.");
		}		
	
	} while ( !acierto && (tryi > 0) );
	
	if (!acierto) {
		System.out.print("Vaya, ya no tengo más intentos. No he" +
		" conseguido adivinar tu número a tiempo.");
	}
   
 }
}
