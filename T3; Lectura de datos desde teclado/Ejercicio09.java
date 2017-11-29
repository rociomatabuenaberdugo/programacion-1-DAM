/**
 *Ejercicio 9, lectura de datos desde el teclado: Escribe un programa
 * que calcule el volumen de un cono según la fórmula V=1/3πr2h.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {

		System.out.print("Dime el radio de tu cono (en cm): ");
		double r = Double.parseDouble(System.console().readLine());

		System.out.print("Dime la altura de tu cono (en cm): ");

		double h = Double.parseDouble(System.console().readLine());

		double v = (3.14 * r * r * h) / 3;

		System.out.println("El volumen de su cono es " + v + " cm².");
	}
}
