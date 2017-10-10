/**
 *Ejercicio 11, lectura de datos desde el teclado: Realia un conversor
 * de Kb a Mb.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    
   System.out.print("Dime cuántos Kb quieres que pase a Mb: ");
   double kb = Double.parseDouble(System.console().readLine());
   
   double mb = kb / 1024;
   
   System.out.println(kb + " Kb son " + mb + " Mb.");
  
  }
}
