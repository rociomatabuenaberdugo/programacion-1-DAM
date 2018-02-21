/**
* Ejercicio 3, números aleatorio: Igual que el ejercicio anterior pero
* con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 
* 5, 6, 7, sota, caballo, rey y as.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("Carta aleatoria de una baraja española.");
    System.out.println(" ");
        
    String pertenece = "palo";
    String es = "cartas";
	int palo = (int)(Math.random()*4 + 1);
	int carta = (int)(Math.random()*10 + 1);
	
	switch (palo) {
		case 1:
		  pertenece = "oros";
		  break;
		case 2:
		  pertenece = "copas";
		  break;
		case 3:
		  pertenece = "espadas";
		  break;
		case 4:
		  pertenece = "bastos";
		  break;
		default:		 
	}
	
	switch (carta) {
		case 1:
		  es = " As";
		  break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		 es = String.valueOf(carta);
		  break;
		case 8:
		  es = " Sota";
		  break;
		case 9:
		  es = " Caballo";
		  break;	
		case 10:
		  es = " Rey";
		  break;		  	  		  
		default:		 
	}

    System.out.println(" "); 

    System.out.println(" " + es + " de " + pertenece);
  }
}
