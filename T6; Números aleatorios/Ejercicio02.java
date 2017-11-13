/**
* Ejercicio 2, números aleatorio: Realiza un programa que muestre al
* azar el nombre de una carta de la baraja francesa. Esta baraja está
* dividida en cuatro palos: picas, corazones, diamantes y tréboles.
* Cada palo está formado por 13 cartas, de las cuales 9 cartas son 
* numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
* sería el 1). Para convertir un número en una cadena de caracteres
* podemos usar String.valueOf(n).
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.println("Carta aleatoria de una baraja francesa.");
    System.out.println(" ");
        
    String pertenece = "palo";
    String es = "cartas";
	int palo = (int)(Math.random()*4 + 1);
	int carta = (int)(Math.random()*13 + 1);
	
	switch (palo) {
		case 1:
		  pertenece = "picas";
		  break;
		case 2:
		  pertenece = "corazones";
		  break;
		case 3:
		  pertenece = "diamantes";
		  break;
		case 4:
		  pertenece = "tréboles";
		  break;
		default:		 
	}
	
	switch (carta) {
		case 1:
		  es = " A";
		  break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		 es = String.valueOf(carta);
		  break;
		case 11:
		  es = " J";
		  break;
		case 12:
		  es = " Q";
		  break;	
		case 13:
		  es = " K";
		  break;		  	  		  
		default:		 
	}

    System.out.println(" "); 

    System.out.println(" " + es + " de " + pertenece);
  }
}
