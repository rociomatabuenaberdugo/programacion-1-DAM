/**
* Ejercicio 5, array: Escribe un programa que pida 10 números por
* teclado y que luego muestre los números introducidos junto con las 
* palabras "máximo" y "mínimo" al lado del máximo y del mínimo 
* respectivamente.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio05 {
  public static void main(String[] args) {
	  
	  int [] numero = new int [10];
	  int numMax = -10000;
	  int numMin = 1000000000;
	  int i;
	  
	  System.out.println("Dime diez números: ");	  
	  
	  for (i = 0; i < 10; i++) {
		  
		  numero [i] = Integer.parseInt(System.console().readLine());
		  
		  if (numMax < numero [i]) {
			  numMax = numero [i];
		  }
		  if (numMin > numero [i]) {
			  numMin = numero [i];
		  }		  
	
	  }
	  
	  System.out.println();
	  
	  for (i = 0; i < 10; i++) {
		  System.out.print("El hueco " + (i+1) + " está ocupado por el"
		  + " número: " + numero [i] + ".");
		  
		  if (numero[i] == numMax) {
			  System.out.print(" Este número es el número máximo.");
		  }
		  
		  if (numero[i] == numMin) {
			  System.out.print(" Este número es el número mínimo.");
		  }		  
		  
		  System.out.println();
	  }
 }
}
