/**
 *Ejercicio 9, bucles: Realiza un programa que nos diga cuántos dígitos
 * tiene un número introducido por teclado.
 *
 *Rocío Matabuena Berdugo
 */

public class Ejercicio09 {
  public static void main(String[] args) {
        
    int digitos = 1, n, num;
        
    System.out.println("Dime un número y te diré cuántos dígitos tiene.");
    num = Integer.parseInt(System.console().readLine());
    
    if (num >= 0) {
    n = num;
	} else {
	n = -num;
	}
    
    while ( n > 10) {
		n/=10;
		digitos++;
	}
	
	System.out.println("El número " + num + " tiene " + digitos +
	" dígito/s.");
    
    
    
    }
  }
