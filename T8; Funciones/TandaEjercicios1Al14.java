/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandaejercicios1al14;

import java.util.Scanner;

public class TandaEjercicios1Al14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int c;
		int e;
		int dp;
		int dd;
		int diz;
		int ad;

		//Capicua ////////////////////////////////////////////////////////////////////////
		System.out.print("Introduzca un número entero positivo (de hasta cinco cifras) y"
				+ " te diré si es o no capicuo: ");
		c = s.nextInt();

		if (matematicas.Matematicas.esCapicua(c)) {
			System.out.println("El " + c + " es capicuo.");
		} else {
			System.out.println("El " + c + " no es capicuo.");
		}

		System.out.println();
		// Primo /////////////////////////////////////////////////////////////////////////
		System.out.print("Introduce otro número y te diré si es o no es primo: ");
		c = s.nextInt();

		if (matematicas.Matematicas.esPrimo(c)) {
			System.out.println("El " + c + " es primo.");
		} else {
			System.out.println("El " + c + " no es primo.");
		}

		System.out.println();
		// Siguiente primo ///////////////////////////////////////////////////////////////
		System.out.print("Ahora dime un número y yo te diré el menor primo siguiente"
				+ " a él: ");
		c = s.nextInt();

		System.out.println("El siguiente número primo mayor al número " + c + " es "
				+ matematicas.Matematicas.sigPrimo(c));

		System.out.println();
		// Potencia //////////////////////////////////////////////////////////////////////
		System.out.println("A continuación, calcularemos una potencia.");
		System.out.print("Dime la base: ");
		c = s.nextInt();
		System.out.print("Dame un exponente: ");
		e = s.nextInt();

		System.out.println(c + "^" + e + " = " + matematicas.Matematicas.potencia(c, e));

		System.out.println();
		// Digitos ///////////////////////////////////////////////////////////////////////
		System.out.print("Dime un número y yo te diré el número de dígitos que tiene: ");
		c = s.nextInt();

		System.out.println("El número " + c + " presenta "
				+ matematicas.Matematicas.digitos(c) + " digitos.");

		System.out.println();
		// Voltea ////////////////////////////////////////////////////////////////////////
		System.out.print("Dime un número y yo le daré la vuelta: ");
		c = s.nextInt();

		System.out.println("Si damos la vuelta al número " + c + " quedaría el número "
				+ matematicas.Matematicas.voltea(c));

		System.out.println();
		// Digito en posición ////////////////////////////////////////////////////////////
		System.out.print("Dime un número: ");
		c = s.nextInt();
		System.out.print("Dime la posición de la cual quieres averiguar el número(no"
				+ " puede ser una posición superior al número de dígitos que contiene el"
				+ " número introducido anteriormente): ");
		dp = s.nextInt();

		System.out.println("El dígito que se encuentra la posición " + dp
				+ " en el número " + c + " es el número "
				+ matematicas.Matematicas.digitoN(c, dp));

		System.out.println();
		// Primera posición de un dígito /////////////////////////////////////////////////
		System.out.print("Dime un número: ");
		c = s.nextInt();
		System.out.print("Dime el dígito del cual quieres saber la primera posición en"
				+ " la cual se pueda encontrar: ");
		dp = s.nextInt();

		if ((matematicas.Matematicas.posicionDeDigito(c, dp)) == -1) {
			System.out.println("El dígito " + dp + " no se encuentra en el número " + c);
		} else {
			System.out.println("El dígito " + dp + " se encuentra por primera vez en"
					+ " la posición " + matematicas.Matematicas.posicionDeDigito(c, dp));
		}

		System.out.println();
		// Quitar números por detrás /////////////////////////////////////////////////////
		System.out.print("Dime un número:");
		c = s.nextInt();
		System.out.print("Dime cuántos dígitos quieres quitarle al número por la"
				+ " derecha: ");
		dd = s.nextInt();

		if (matematicas.Matematicas.quitaPorDetras(c, dd) == -1) {
			System.out.println("Has intentado quitar más dígitos de los que hay en el"
					+ " número " + c);
		} else {
			System.out.println("Al quitarle " + dd + " dígito/s al número " + c
					+ " queda como resultado: "
					+ matematicas.Matematicas.quitaPorDetras(c, dd));
		}

		System.out.println();
		// Quitar números por delante ////////////////////////////////////////////////////
		System.out.print("Dime un número:");
		c = s.nextInt();
		System.out.print("Dime cuántos dígitos quieres quitarle al número por la"
				+ " izquierda: ");
		diz = s.nextInt();

		if (matematicas.Matematicas.quitaPorDelante(c, diz) == -1) {
			System.out.println("Has intentado quitar más dígitos de los que hay en el"
					+ " número " + c);
		} else {
			System.out.println("Al quitarle " + diz + " dígito/s al número " + c
					+ " queda como resultado: "
					+ matematicas.Matematicas.quitaPorDelante(c, diz));
		}

		System.out.println();
		// Añadir números por detrás /////////////////////////////////////////////////////
		System.out.print("Dime un número:");
		c = s.nextInt();
		System.out.print("Dime un dígito para añadirlo por detrás al número anterior: ");
		ad = s.nextInt();

		System.out.println("El número resultado es: "
				+ matematicas.Matematicas.pegaPorDetras(c, ad));

		System.out.println();
		// Añadir números por delante ////////////////////////////////////////////////////
		System.out.print("Dime un número:");
		c = s.nextInt();
		System.out.print("Dime un dígito para añadirlo por delante al número anterior: ");
		ad = s.nextInt();

		System.out.println("El número resultado es: "
				+ matematicas.Matematicas.pegaPorDelante(ad, c));

		System.out.println();
		// Tomar un trozo de número //////////////////////////////////////////////////////
		System.out.print("Dime un número:");
		c = s.nextInt();
		System.out.print("Dime la primera posición, de la cual comienzas a coger"
				+ " el número: ");
		diz = s.nextInt();
		System.out.print("Dime la segunda posición, de la cual terminas de coger el"
				+ " número:");
		dd = s.nextInt();
		System.out.println("El número comprendido entre la posición " + diz + " y  la "
				+ "posición " + dd + " es: "
				+ matematicas.Matematicas.trozoDeNumero(c, diz, dd));

		System.out.println();
		// Pegar dos números para formar uno /////////////////////////////////////////////
		System.out.println("A continuación, dime dos números, y yo los juntaré para"
				+ " formar sólo uno: ");
		c = s.nextInt();
		ad = s.nextInt();
		System.out.println("El número resultado al pegar los número " + c + " y " + ad
				+ " es: " + matematicas.Matematicas.juntaNumeros(c, ad));
	}
}
