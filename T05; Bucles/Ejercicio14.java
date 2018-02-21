/**
 * 
 *Ejercicio 14, bucles: Escribe un programa que pida una base y un
 * exponente (entero positivo) y calcule la potencia.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio14 {
  public static void main(String[] args) {
         System.out.println("Dime una base.");
         int base = Integer.parseInt(System.console().readLine());
         System.out.println("Dime un exponente que debe ser entero " + 
         "positivo.");
		 int ex = Integer.parseInt(System.console().readLine());
		 
		 double potencia = 1;
		 
		 if (ex == 0) {
				potencia = 1;
			}
			
		 if (ex < 0) {
		   for (int i = 0; i < -ex ; i++) {
				potencia *= base;
			}
			potencia = 1/potencia;
			}
					
		 if (ex > 0) {
		   for (int i = 0; i < ex ; i++) 
				potencia *= base;	
		}
		
		 System.out.println(base + "^" + ex + "= " + potencia);				
		 
		
  
}
}
