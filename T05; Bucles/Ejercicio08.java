/**
 * 
 *Ejercicio 8, bucles: Muestra la tabla de multiplicar de un número
 * introducido por teclado.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio08 {
  public static void main(String[] args) {
         System.out.println("Dime un número y te diré su tabla de " +
         "multiplicar.");
         
         int multi = Integer.parseInt(System.console().readLine());
        
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(multi + "*" + i + "= " + multi*i);
    }
  }
}
