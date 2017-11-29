/**
* Ejercicio 22, números aleatorio: Realiza un programa que pinte por
* pantalla una serpiente con un "serpenteo" aleatorio. La cabeza se
* representará con el carácter @ y se debe colocar exactamente en la
* posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá
* serpenteando de la siguiente manera: se generará de forma aleatoria un
* valor entre tres posibles que hará que el siguiente carácter se
* coloque una posición a la izquierda del anterior, alienado con el
* anterior o una posición a la derecha del anterior. La longitud de la
* serpiente se pedirá por teclado y se supone que el usuario introducirá
* un dato correcto.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio22 {
  public static void main(String[] args) {
	  
		System.out.print("Por favor, introduzca la longitud de la"
				+ " serpiente en caracteres contando la cabeza: ");
		int lon = Integer.parseInt(System.console().readLine());

		int esp = 12;
		int j;

		System.out.println("            @");

		for (int i = 1; i < lon; i++) {
			int sig = (int) (Math.random() * 3);

			switch (sig) {
				case 0:
					for (j = 0; j < esp * 2 - 2; j++) {
						System.out.print(" ");
						j++;
					}
					System.out.println("*");
					esp -= 1;
					break;
				case 1:
					for (j = 0; j < esp * 2; j++) {
						System.out.print(" ");
						j++;
					}
					System.out.println("*");
					break;
				case 2:
					for (j = 0; j < esp * 2 + 2; j++) {
						System.out.print(" ");
						j++;
					}
					System.out.println("*");
					esp += 1;
					break;
				default:
			}

		}
	}
}
