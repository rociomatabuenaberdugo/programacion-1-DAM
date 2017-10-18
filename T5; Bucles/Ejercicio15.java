/**
 * 
 *Ejercicio 15, bucles: Escribe un programa que dados dos números, uno
 * real (base) y un entero positivo (exponente), saque por pantalla
 * todas las potencias con el base el número dado y exponentes entre uno
 * y el exponente introducido. No se deben utilizar funcionaes de 
 * exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán
 * mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio15 {
  public static void main(String[] args) {
         System.out.println("Dime una base.");
         int base = Integer.parseInt(System.console().readLine());
         System.out.println("Dime un exponente que debe ser entero " + 
         "positivo.");
		 int exfinal = Integer.parseInt(System.console().readLine());
		 
		 double potencia;
		 int ex;
		 
		 for (int i = 1; i <= exfinal ; i++) {
		 
			potencia = 1;
			ex = i;
		 	
			for (int j = 0; j < ex ; j++) {
				potencia *= base;	
			}
			
		
		 System.out.println(base + "^" + i + "= " + potencia);				
		} 
}
}
