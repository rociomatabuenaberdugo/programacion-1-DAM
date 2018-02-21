/**
 *Ejercicio 7, bucles: Realiza el control de acceso a una caja fuerte.
 * La combinación será un número de 4 cifras. El programa nos pedirá la
 * combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
 * "Lo siento, esa no es la combinación" y si acertamos se nos dirá "La
 * caja fuerte se ha abierto satisfactoriamente". Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 *
 *Rocío Matabuena Berdugo
 */

public class Ejercicio07 {
  public static void main(String[] args) {
        
    int clave = 1298; 
    int i = 1;
    int num;
    
    do {
    System.out.println("Si quieres abrir esta caja fuerte, " + 
        "deberás introducir la clave correcta. Sólo tienes 4 intentos.");
    num = Integer.parseInt(System.console().readLine());
    
    if (num == clave) {
		System.out.println("La caja fuerte se ha abierto " +
		"satisfactoriamente.");
	} else {
		System.out.println("Lo siento, esa no es la combinación." +
		"Llevas " + i + " intentos.");
	}
	
	i++;
	
	}
	
	while ((i<5) && (num != clave));
	
	
	
    }
  }
