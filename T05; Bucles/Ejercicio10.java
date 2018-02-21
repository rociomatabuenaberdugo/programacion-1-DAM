/**
 *Ejercicio 10, bucles: Escribe un programa que calcule la media de un
 * conjunto de números positivos introducidos por teclado. A priori, el
 * programa no sabe cuántos números se introducirán. El usuario indicará
 * que ha terminado de introducir los datos cuando meta un número
 * negativo.
 *
 *Rocío Matabuena Berdugo
 */

public class Ejercicio10 {
  public static void main(String[] args) {
        
    double nums = 0;
    double numintroducido = 0;
    double suma = 0;
        
    System.out.println("Dime todos los números que quieras " +
    "(positivos) para hacer su media. Cuando quieras dejar de meter " +
    "números introduce un número negativo.");
    
    while (numintroducido >= 0) {
		numintroducido = Double.parseDouble(System.console().readLine());
		nums++;
		suma += numintroducido;
	}
	
	double media = (suma - numintroducido) / (nums - 1);
	
	System.out.println("La media de los números introducidos por " +
	" es " + media);
    
    
    
    }
  }
