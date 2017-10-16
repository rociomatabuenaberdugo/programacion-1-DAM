/**
 *Ejercicio 7, sentencia condicional: Realiza un programa que calcule la
 * media de tres notas.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio07 {
  public static void main(String[] args) {
   
   System.out.println("Dime tu primera nota: ");
   double uno = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu segunda nota: ");
   double dos = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu tercera nota: ");
   double tres = Double.parseDouble(System.console().readLine());
   
   double media = (uno + dos + tres) / 3;
   
   if (media < 5) {
	   System.out.println("Lo siento, has suspendido con un " + media);
	   
   } else {
	   System.out.println("Felicidades, has aprobado con un " + media);
		}
				
	}	
}
