/**
 *Ejercicio 5, lectura de datos desde el teclado: Escribe un programa
 * que calcule el área de un rectángulo.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {

		System.out.print("Dime la base de tu rectángulo: ");
		double b = Double.parseDouble(System.console().readLine());

		System.out.print("Dime la altura de tu rectángulo: ");
		double h = Double.parseDouble(System.console().readLine());

		System.out.println("El área de un rectángulo con base " + b
				+ " y con altura " + h + " es igual a " + (b * h));
	}
}
