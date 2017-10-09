/**
 *Ejercicio 1, lectura de datos desde el teclado: Realiza un programa
 *que pida dos números y que luego muestre el resultado de su
 *multiplicación.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
   
   System.out.print("Dime un número: ");
   int primerNum = Integer.parseInt(System.console().readLine());
   
   System.out.print("Dime otro número: ");
   int segundoNum = Integer.parseInt(System.console().readLine());
   
   int multi = primerNum * segundoNum;
   
   System.out.print("La multiplicación del número " + primerNum +
   " y el número " + segundoNum + " es igual a " + multi );
  }
 }
