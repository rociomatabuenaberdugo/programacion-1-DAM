/**
 *Ejercicio 6, sentencia condicional: Realiza un programa que calcule el
 * tiempo que tardará en caer un objeto desde una altura h. Aplica la
 * fórmula t = √(2h/g) siendo g = 9.81m/s²
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio06 {
  public static void main(String[] args) {
 
		System.out.println("Dime la altura desde la cual cae tu objeto: ");
		double h = Double.parseDouble(System.console().readLine());

		if (h == 0) {
			System.out.println("Como la altura es cero, el tiempo es cero.");
		} else {
			System.out.println("El tiempo que tarda en caer tu objeto son "
					+ Math.sqrt(2 * h / 9.81) + " segundos.");
		}
	}
}
