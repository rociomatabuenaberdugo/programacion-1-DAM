/**
* Ejercicio 1, números aleatorio: Escribe un programa que mueste la
* tirada de tres dados. Se debe mostrar también la suma total (los
* puntos que suman entre los tres dados).
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio01 {
  public static void main(String[] args) {

    System.out.println("A continuación te mostaré la tirada de tres" +
    " dados y la suma total de los números obtenidos.");
    System.out.println(" ");    
    
    int suma = 0;
    int dado = 1;
    
    for (int i = 0; i < 3; i++) {
		int tirada = (int)(Math.random()*6 + 1);
		suma += tirada;
      System.out.println("En el dado " + dado + " ha salido: " +
      tirada);
      
      dado++;
    }

    System.out.println(" "); 

    System.out.println("La suma total de los números obtenidos en" +
    " los dados es " + suma);
  }
}
