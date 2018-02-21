/**
* Ejercicio 6, números aleatorio: Escribe un programa que piense un
* número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para
* ello 5 oportunidades. Después de cada intento fallido, el programa
* dirá cuántas oportunidades quedan y si el número introducido es menor
* o mayor que el número secreto.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("¿Quieres intentar adivinar mi número? Está" +
    " comprendido entre 0 y 100, incluyendo estos. Tendrás cinco" +
    " oportunidades para intentar adivinarlo.");
	
	int tryi = 5;
	int num;
	int azar = (int)(Math.random()*101);
	
	do {
		num = Integer.parseInt(System.console().readLine());
		while ( num < 0 ) {
			System.out.println("Te he dicho que mi número está comprendido" +
			" entre 0 y 100, por lo que mi número no podrá ser menor que" +
			" 0.");
			System.out.print("Introduce otro número: ");
			num = Integer.parseInt(System.console().readLine());	
		}
		while ( num > 100 ) {
			System.out.println("Te he dicho que mi número está comprendido" +
			" entre 0 y 100, por lo que mi número no podrá ser mayor que" +
			" 100.");
			System.out.print("Introduce otro número: ");
			num = Integer.parseInt(System.console().readLine());
		}	
		
		tryi--;
		
		if ( (num > azar) && (tryi > 0) ) {
			System.out.println("Mi número es menor que " + num);
			System.out.println("Te quedan " + tryi + " intentos.");
		}
		if ( (num < azar) && (tryi > 0) ) {
			System.out.println("Mi número es mayor que " + num);
			System.out.println("Te quedan " + tryi + " intentos.");
		}
		if ( (num == azar) ) {
			System.out.println("¡Correcto! Mi número era " + num);
			System.out.println("Te quedaban " + tryi + " intentos.");
		}		
	} while ( (num != azar) && (tryi > 0) );
	
	if (num != azar) {
		System.out.print("Lo siento, te has quedado sin intentos y " +
		"no has adivinado mi número. Mi número era " + azar);
	}
	
  }
}
