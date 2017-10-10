/**
 *Ejercicio 4, lectura de datos desde el teclado: Escribe un programa
 * que sume, reste, multiplique y divida dos números introducidos por
 * por teclado.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
    
   System.out.print("Dime un número: ");
   double num1 = Double.parseDouble(System.console().readLine());
   
   System.out.print("Dime otro número: ");
   double num2 = Double.parseDouble(System.console().readLine());
   
   System.out.println("Mi primer número vale: " + num1);
   System.out.println("Mi segundo número vale: " + num2);
   
   System.out.println("La suma de mis variables es igual a " +
   (num1 + num2));
   
   System.out.println("La resta de mis variables es igual a " +
   (num1 - num2));
   
   System.out.println("El resultado de dividir mis variables es " +
   (num1 / num2));
   
   System.out.println("El resultado de multiplicar mis variables es " +
   (num1 * num2));
  }
}
