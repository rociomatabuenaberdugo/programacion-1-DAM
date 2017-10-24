/**
 * 
 *Ejercicio 21, bucles: Realiza un programa que vaya pidiendo números
 * hasta que se introduzca un número negativo y nos diga cuántos números
 * se han introducido, la media de los impares y el mayor de los pares.
 * El número negativo sólo se utiliza para indicar el final de la
 * introducción de datos pro no se incluye en el cómputo.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio21 {
  public static void main(String[] args) {
 
		double numsIntroducidosImpar = 0;
		int numsIntroducidos = 0;
		double suma = 0;
 
	  System.out.println("Dime los números positivos que quieras y" + 
	  " yo te diré la media de los impares y el mayor de los pares." + 
	  " Para dejar de introducir números, introduce uno negativo.");
	  int num = Integer.parseInt(System.console().readLine());
	  
	  do {
		  num = Integer.parseInt(System.console().readLine());
			numsIntroducidos++;
			if ((num % 2 != 0)&&(num>=0)) {
				suma += num;
				numsIntroducidosImpar++;
				}
	  } while (num >= 0);
	  
	  double media = (double)(suma) / (double)numsIntroducidosImpar;
	  
	  System.out.println("números introducidos: " + numsIntroducidos + 
	  " suma de impares introducidos: " + suma + " media: " + media + 
	  "numero de impares introducidos: " + numsIntroducidosImpar); 
	  
	  System.out.println("Se han introducido " +
	  numsIntroducidos + " números, la media de impares es " + media);
	}
 }
