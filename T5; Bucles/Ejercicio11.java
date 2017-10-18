/**
 * 
 *Ejercicio 11, bucles: Escribe un programa que muestre en tres
 * columnas, el cuadrado y el cubo de los 5 primeros números enteros a 
 * partir de uno que se introduce por teclado.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio11 {
  public static void main(String[] args) {
         System.out.println("Dime un número y te diré su cuadrado y " +
         "su cubo, al igual que de sus siguientes cuatro números.");
         
         int numIntro = Integer.parseInt(System.console().readLine());
        
        
    for (int i = numIntro ; i <= (numIntro+4); i++) {
		
		System.out.println("╭──────────────┬─────────────────────┬────────────────────╮");
		System.out.println("│    Número    │     Su cuadrado     │       Su cubo      │");
		System.out.println("╰──────────────┴─────────────────────┴────────────────────╯");
		System.out.println("       " + i + "                  " + (i*i) + 
		"                 " + (i*i*i) + "       ");
		System.out.println("                                               ");
		
    }
  }
}
