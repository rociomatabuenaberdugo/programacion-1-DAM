/**
* Ejercicio 13, números aleatorio: Escribe un programa que simule la
* tirada de dos dados. El programa deberá continuar tirando los dados
* una y otra vez hasta que en alguna tirada los dos dados tengan el
* mismo valor.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio13 {
  public static void main(String[] args) {
  
	System.out.println("Programa que mostrará la tirada de dos dados " +
	"hasta que ambos saquen lo mismo.");
	System.out.println(" ");
  
    int dado1 = (int)(Math.random()*6 + 1);
    int dado2 = (int)(Math.random()*6 + 1);
    int tirada = 1;
    
    if (dado1 != dado2) {
		do {
			System.out.println(" TIRADA " + tirada);
			System.out.println("Resultado del dado 1: " + dado1);
			System.out.println("Resultado del dado 2: " + dado2);
			System.out.println(" ");
			dado1 = (int)(Math.random()*6 + 1);
			dado2 = (int)(Math.random()*6 + 1);
			tirada++;
		} while (dado1 != dado2);
	}
	
	System.out.println(" TIRADA " + tirada);
	System.out.println("Resultado del dado 1: " + dado1);
	System.out.println("Resultado del dado 2: " + dado2);
	System.out.println(" ");
 }
}
