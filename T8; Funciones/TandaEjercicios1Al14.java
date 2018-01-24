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

    //Capicua //////////////////////////////////////////////////////////////////////////////////////
    System.out.print("Introduzca un n�mero entero positivo (de hasta cinco cifras) y"
            + " te dir� si es o no capicuo: ");
    c = s.nextInt();

    if (matematicas.Matematicas.esCapicua(c)) {
      System.out.println("El " + c + " es capicuo.");
    } else {
      System.out.println("El " + c + " no es capicuo.");
    }

    System.out.println();
    // Primo ///////////////////////////////////////////////////////////////////////////////////////
    System.out.print("Introduce otro n�mero y te dir� si es o no es primo: ");
    c = s.nextInt();

    if (matematicas.Matematicas.esPrimo(c)) {
      System.out.println("El " + c + " es primo.");
    } else {
      System.out.println("El " + c + " no es primo.");
    }

    System.out.println();
    // Siguiente primo /////////////////////////////////////////////////////////////////////////////
    System.out.print("Ahora dime un n�mero y yo te dir� el menor primo siguiente"
            + " a �l: ");
    c = s.nextInt();

    System.out.println("El siguiente n�mero primo mayor al n�mero " + c + " es "
            + matematicas.Matematicas.sigPrimo(c));

    System.out.println();
    // Potencia ////////////////////////////////////////////////////////////////////////////////////
    System.out.println("A continuaci�n, calcularemos una potencia.");
    System.out.print("Dime la base: ");
    c = s.nextInt();
    System.out.print("Dame un exponente: ");
    e = s.nextInt();

    System.out.println(c + "^" + e + " = " + matematicas.Matematicas.potencia(c, e));

    System.out.println();
    // Digitos /////////////////////////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero y yo te dir� el n�mero de d�gitos que tiene: ");
    c = s.nextInt();

    System.out.println("El n�mero " + c + " presenta "
            + matematicas.Matematicas.digitos(c) + " digitos.");

    System.out.println();
    // Voltea //////////////////////////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero y yo le dar� la vuelta: ");
    c = s.nextInt();

    System.out.println("Si damos la vuelta al n�mero " + c + " quedar� el n�mero "
            + matematicas.Matematicas.voltea(c));

    System.out.println();
    // Digito en posici�n //////////////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero: ");
    c = s.nextInt();
    System.out.print("Dime la posici�n de la cual quieres averiguar el n�mero(no"
            + " puede ser una posici�n superior al n�mero de d�gitos que contiene el"
            + " n�mero introducido anteriormente): ");
    dp = s.nextInt();

    System.out.println("El d�gito que se encuentra la posici�n " + dp
            + " en el n�mero " + c + " es el n�mero "
            + matematicas.Matematicas.digitoN(c, dp));

    System.out.println();
    // Primera posici�n de un d�gito ///////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero: ");
    c = s.nextInt();
    System.out.print("Dime el d�gito del cual quieres saber la primera posici�n en"
            + " la cual se pueda encontrar: ");
    dp = s.nextInt();

    if ((matematicas.Matematicas.posicionDeDigito(c, dp)) == -1) {
      System.out.println("El d�gito " + dp + " no se encuentra en el n�mero " + c);
    } else {
      System.out.println("El d�gito " + dp + " se encuentra por primera vez en"
              + " la posici�n " + matematicas.Matematicas.posicionDeDigito(c, dp));
    }

    System.out.println();
    // Quitar n�meros por detr�s ///////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero:");
    c = s.nextInt();
    System.out.print("Dime cu�ntos d�gitos quieres quitarle al n�mero por la"
            + " derecha: ");
    dd = s.nextInt();

    if (matematicas.Matematicas.quitaPorDetras(c, dd) == -1) {
      System.out.println("Has intentado quitar m�s d�gitos de los que hay en el"
              + " n�mero " + c);
    } else {
      System.out.println("Al quitarle " + dd + " d�gito/s al n�mero " + c
              + " queda como resultado: "
              + matematicas.Matematicas.quitaPorDetras(c, dd));
    }

    System.out.println();
    // Quitar n�meros por delante //////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero:");
    c = s.nextInt();
    System.out.print("Dime cu�ntos d�gitos quieres quitarle al n�mero por la"
            + " izquierda: ");
    diz = s.nextInt();

    if (matematicas.Matematicas.quitaPorDelante(c, diz) == -1) {
      System.out.println("Has intentado quitar m�s d�gitos de los que hay en el"
              + " n�mero " + c);
    } else {
      System.out.println("Al quitarle " + diz + " d�gito/s al n�mero " + c
              + " queda como resultado: "
              + matematicas.Matematicas.quitaPorDelante(c, diz));
    }

    System.out.println();
    // A�adir n�meros por detr�s ///////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero:");
    c = s.nextInt();
    System.out.print("Dime un d�gito para a�adirlo por detr�s al n�mero anterior: ");
    ad = s.nextInt();

    System.out.println("El n�mero resultado es: "
            + matematicas.Matematicas.pegaPorDetras(c, ad));

    System.out.println();
    // A�adir n�meros por delante //////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero:");
    c = s.nextInt();
    System.out.print("Dime un d�gito para a�adirlo por delante al n�mero anterior: ");
    ad = s.nextInt();

    System.out.println("El n�mero resultado es: "
            + matematicas.Matematicas.pegaPorDelante(ad, c));

    System.out.println();
    // Tomar un trozo de n�mero ////////////////////////////////////////////////////////////////////
    System.out.print("Dime un n�mero:");
    c = s.nextInt();
    System.out.print("Dime la primera posici�n, de la cual comienzas a coger"
            + " el n�mero: ");
    diz = s.nextInt();
    System.out.print("Dime la segunda posici�n, de la cual terminas de coger el"
            + " n�mero:");
    dd = s.nextInt();
    System.out.println("El n�mero comprendido entre la posici�n " + diz + " y  la "
            + "posici�n " + dd + " es: "
            + matematicas.Matematicas.trozoDeNumero(c, diz, dd));

    System.out.println();
    // Pegar dos n�meros para formar uno //////////////////////////////////////////////////////////
    System.out.println("A continuaci�n, dime dos n�meros, y yo los juntar� para"
            + " formar s�lo uno: ");
    c = s.nextInt();
    ad = s.nextInt();
    System.out.println("El n�mero resultado al pegar los n�mero " + c + " y " + ad
            + " es: " + matematicas.Matematicas.juntaNumeros(c, ad));
  }
}
