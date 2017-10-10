/**
 *
 *Ejercicio 2, lectura de datos desde el teclado: Realiza un conversor
 * de euros a pesetas. La cantidad de euros que se quiere convertir debe
 * ser introducida por teclado.
 *
 *Rocío Matabuena Berdugo
 *
 */
 
public class Ejercicio2 {
 public static void main(String[] args) {
  
  System.out.print("¿Qué cantidad de euros quieres pasar a pesetas? ");
  double eu = Double.parseDouble(System.console().readLine());
  
  double p = eu * 166.386;
  
  System.out.println (eu + " euros equivalen a " + p + " pesetas.");
  
  }
 }
