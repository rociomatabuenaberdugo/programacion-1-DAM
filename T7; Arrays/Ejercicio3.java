/**
* Ejercicio 3, array: Escribe un programa que lea 10 números por teclado
* y que luego los muestre en orden inverso, es decir, el primero que se
* introduce es el último en mostrarse y viceversa.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio3 {
  public static void main(String[] args) {
	  
	  int [] num = new int [10];
	  
	  System.out.println("Dime diez números: ");
	  
	  for (int i = 1; i < 11; i++) {
		  
		  num [i-1] = Integer.parseInt(System.console().readLine());		  
	  
	  }
	  
	  System.out.println(" ");
	  System.out.println("Los números en orden inverso son: ");
	  
	  for (int j = 9; j > -1; j--) {
		  System.out.println( num [j] );
	  }
 }
}
