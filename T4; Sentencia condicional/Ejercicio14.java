/**
 *Ejercicio 14, sentencia condicional: Realiza un programa que diga si
 * un número introducido por teclado es par y/o divisible entre 5.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
   
   System.out.println("Dime un número y yo te diré si es par y/o si " + 
   "es divisible entre 5. ");
   System.out.println("Introduce tu número: ");   
    int num = Integer.parseInt(System.console().readLine());
   
   if ((num % 2 == 0)&&(num % 5 == 0)) {
	   System.out.println("Tu número es par y divisible entre 5. "); 
   } 
   if ((num % 2 != 0)&&(num % 5 == 0)) {
	   System.out.println("Tu número es impar y divisible entre 5. "); 
   } 
   if ((num % 2 != 0)&&(num % 5 != 0)) {
	   System.out.println("Tu número es impar y no es divisible entre 5."); 
   }    
   if ((num % 2 == 0)&&(num % 5 != 0)) {
	   System.out.println("Tu número es par y no es divisible entre 5. "); 
   }    
   
}
}
