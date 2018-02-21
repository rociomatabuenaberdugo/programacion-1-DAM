/**
 *Ejercicio 1, sentencia condicional: Escribe un programa que pida por
 * teclado un día de la semana y diga qué asignatura toca a primera hora
 * ese día.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio01 {
  public static void main(String[] args) {

		String día;

		System.out.print("Dime un día de la semana y yo te diré qué toca a "
				+ "primera hora ese día: ");
		día = System.console().readLine();

		día = día.toUpperCase();

		switch (día) {

			case "LUNES":
				System.out.print("Los Lunes a primera hora hay Programación.");
				break;
			case "MARTES":
				System.out.print("Los Martes a primera hora hay Sistemas"
						+ " Informáticos.");
				break;
			case "MIÉRCOLES":
				System.out.print("Los Miércoles a primera hora hay "
						+ "Programación.");
				break;
			case "JUEVES":
				System.out.print("Los Jueves a primera hora hay Entornos de"
						+ " desarrollo.");
				break;
			case "VIERNES":
				System.out.print("Los Viernes a primera hora hay Sistemas"
						+ " Informáticos.");
				break;
			case "SÁBADO":
				System.out.print("Los Sábados no hay clase.");
				break;
			case "DOMINGO":
				System.out.print("Los Domingos no hay clase.");
				break;
			default:
				System.out.print("Te he pedido un día de la semana.");
		}
	}
}
