/**
 *Ejercicio 7, lectura de datos desde el teclado: Escribe un programa
 * que calcule el total de una factura a partir de la base imponible.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {
    
   System.out.print("Dime la base imponible de tu factura: ");
   double b = Double.parseDouble(System.console().readLine());

   double iva = b * 0.21;
   
   double total = b + iva;
   
   System.out.println("El total de tu factura, con una base " + 
   "imponible de " + b + " y " + iva + " de IVA, es " + total +
   " euros.");
  
  }
}
