/**
* Ejercicio 9, arrays: Realiza un programa que pida 8 números enteros
* y que luego muestre esos números junto con la palabra "par" o "impar",
* según proceda.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio9 {
  public static void main(String[] args) {
	  
	  
	  int [] num = new int [8];
	  
	  System.out.println("Dime ocho números enteros:");	  
	  		  
	  for (int i = 0; i < 8; i++) {
		  
		  num [i] = Integer.parseInt(System.console().readLine());

	  }
	  System.out.println();
	  System.out.println();
	  
	  for (int j = 1; j <= 8; j++) {
		  
		  if (num[j-1] % 2 == 0) {
			  System.out.println(" " + num[j-1] + " es par.");
		  } else {
			  System.out.println(" " + num[j-1] + " es impar.");
		  }
	  
	  }
	  
 }
}
