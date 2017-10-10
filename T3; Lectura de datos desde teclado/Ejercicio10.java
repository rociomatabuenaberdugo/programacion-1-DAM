/**
 *Ejercicio 10, lectura de datos desde el teclado: Realia un conversor
 * de Mb a Kb.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
    
   System.out.print("Dime cuántos Mb quieres que pase a Kb: ");
   double mb = Double.parseDouble(System.console().readLine());
   
   double kb = mb * 1024;
   
   System.out.println(mb + " Mb son " + kb + " Kb.");
  
  }
}
