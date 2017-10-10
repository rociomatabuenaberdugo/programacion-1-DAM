/**
 *Ejercicio 6, lectura de datos desde el teclado: Escribe un programa
 * que calcule el área de un triángulo.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
    
   System.out.print("Dime la base de tu triángulo: ");
   double b = Double.parseDouble(System.console().readLine());
   
   System.out.print("Dime la altura de tu triángulo: ");
   double h = Double.parseDouble(System.console().readLine());
   
   double a = (b * h) / 2;
   
   System.out.println("El área de un triángulo con base " + b +
   " y con altura " + h + " es igual a " + a);
  
  }
}
