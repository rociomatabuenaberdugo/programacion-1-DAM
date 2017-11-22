/**
* Ejercicio 6, array: Escribe un programa que lea 15 números por teclado
* y que los almacene en un array. Rota los elementos de ese array, es
* decir, el elemento de la posición 0 debe pasar a la posición 1, el de
* la 1 a la 2, etc. El númro que se encuentra en la última posición debe
* pasar a la posición 0. Finalmente, muestra el contenido del array.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio6 {
  public static void main(String[] args) {
	  
	  int [] num = new int [15];
	  int aux;
	  int i;
	  
	  System.out.println("Dime quince números: ");	  
	  
	  for (i = 0; i < 15; i++) {
		  
		  num [i] = Integer.parseInt(System.console().readLine());
		  
	  }
	  
	  aux = num [14];
	  for (i = 14; i > 0; i--) {
		  num [i] = num [i-1];
	  } 
	  num [0] = aux;
	  
	  System.out.println("Los números rotados una posición a la " +
	  "derecha son: ");
	  for (i = 0; i < 15; i++) {
		  System.out.println(num[i]);
	  }
 }
}
