/**
* Ejercicio 7, array: Escribe un programa que genere 100 números
* aleatorios del 0 al 20 y que los muestre por pantalla separados por
* espacios. El programa pedirá entonces por teclado dos valores y a 
* continuación cambiará todas las ocurrencias del primer valor por el
* segundo en la lista generada anteriormente. Los números que se han 
* dicho deben aparecer entrecomillados.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio7 {
  public static void main(String[] args) {
	  
	  int [] num = new int [100];
	  int i;
	  
	  System.out.println("Cien números aleatorios entre el 0 y" +
	  " el 20: ");	  
	  
	  for (i = 0; i < 100; i++) {
		  
		  num [i] = (int)(Math.random()*21);
		  
		  System.out.print(num[i] + " ");
		  
	  }
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Dime el número que quieras sustituir de los" +
	  " mostrados anteriormente: ");
	  int numFue = Integer.parseInt(System.console().readLine());
	  System.out.print("Dime por cuál número quieres sustituirlo: ");
	  int numDen = Integer.parseInt(System.console().readLine());
	  System.out.println();
	  
	  for (i = 0; i < 100; i++){
		  
		  if (num [i] == numFue) {
			  System.out.print("'" + numDen + "' ");
		  } else {
			  System.out.print(num [i] + " ");
		  }
	  }
 }
}
