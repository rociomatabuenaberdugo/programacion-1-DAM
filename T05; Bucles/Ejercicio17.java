/**
 * 
 *Ejercicio 17, bucles: Realiza un programa que sume los 100 números
 * siguientes a un número entero y positivo introducido por teclado.
 * Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo).
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio17 {
  public static void main(String[] args) {
	  
		int num = 0;
		int suma = 0;
	  
	  do {
         System.out.println("Dime un número y yo te sumaré los " +
         "siguientes 100 números. El número introducido deberá ser " +
         "entero y positivo.");
         num = Integer.parseInt(System.console().readLine());
		 
		 if (num < 0 ) {
			 System.out.println("El número introducido es erróneo. " + 
			 "Te pedí un número entero positivo.");
		 }
	 } while (num < 0);
	 
	 for (int i = num; i < num + 100; i++ ) {
		suma += i;
	}
	
		System.out.println("La suma de los 100 número siguientes al " +
		"número introducido es " + suma);
	 
		 
		 
}
}
