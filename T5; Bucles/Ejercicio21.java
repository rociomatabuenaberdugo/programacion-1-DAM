/**
 * 
 *Ejercicio 21, bucles: Realiza un programa que vaya pidiendo números
 * hasta que se introduzca un número negativo y nos diga cuántos números
 * se han introducido, la media de los impares y el mayor de los pares.
 * El número negativo sólo se utiliza para indicar el final de la
 * introducción de datos pero no se incluye en el cómputo.
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio21 {
  public static void main(String[] args) {
 
		System.out.println("Dime los números positivos que quieras y" + 
	  " yo te diré la media de los impares y el mayor de los pares." + 
	  " Para dejar de introducir números, introduce uno negativo.");
 
		int num;
		int numsIntroducidosImpar = 0;
		int numsIntroducidos = 0;
		int suma = 0;
		int maxPar = 0;
	  
	  do {
		  num = Integer.parseInt(System.console().readLine());
			if ( num >= 0 ) {
				numsIntroducidos++;
				if ((num % 2) == 1) {
					suma +=num;
					numsIntroducidosImpar++;
				} else {
					if ( num > maxPar )
					maxPar = num;
				}
			}	
		} while (num >= 0);
		
		System.out.println("Has introducido " + numsIntroducidos +
		" números. La media de los impares es: " +
		(suma / numsIntroducidosImpar) + 
		" y el mayor de los pares introducidos es el número " + maxPar);
 }
}
