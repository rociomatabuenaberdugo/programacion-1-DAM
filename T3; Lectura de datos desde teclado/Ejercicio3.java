/**
 *
 *Ejercicio 3, lectura de datos desde el teclado: Realiza un conversor
 * de pesetas a euros. La cantidad de pesetas que se quiere convertir
 * debe ser introducida por teclado.
 *
 *Rocío Matabuena Berdugo
 *
 */
 
public class Ejercicio3 {
 public static void main(String[] args) {
  
  System.out.print("¿Qué cantidad de pesetas quieres pasar a euros? ");
  double p = Double.parseDouble(System.console().readLine());
  
  double eu = p / 166.386;
  
  System.out.println (p + " pesetas equivalen a " + eu + " euros.");
  
  }
 }
