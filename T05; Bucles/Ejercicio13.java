/**
 * 
 *Ejercicio 13, bucles: Escribe un programa que lea una lista de diez
 * números y determine cuántos son positivos, y cuántos son negativos.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio13 {
  public static void main(String[] args) {
         System.out.println("Dime diez números y yo te diré cuántos " +
         "son negativos y cuántos son positivos.");
		 System.out.println("                         ");
		 
         int positivo = 0;
         int negativo = 0;
         
    for (int i = 0 ; i < 10; i++) {
		
		if (Integer.parseInt(System.console().readLine()) < 0) {
			negativo++;
		}else{
			positivo++;
    }
  }
  
		System.out.println("                         ");
		System.out.println("Has introducido " + positivo +
		" positivos y " + negativo + " negativos.");
  
}
}
