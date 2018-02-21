/**
 *Ejercicio 12, lectura de datos desde el teclado: Realia un programa
 * que calcule la nota que hace falta sacar en el segundo examen de la
 * asignatura Programación para obtener la media deseada. Hay que tener
 * en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {

		System.out.print("Introduce la nota que sacaste en tu primer"
				+ " examen: ");
		double exuno = Double.parseDouble(System.console().readLine());

		System.out.print("Introduce la nota que quieres tener este"
				+ " trimestre: ");

		double media = Double.parseDouble(System.console().readLine());

		double exdospuro = media - ((double) exuno * 0.4);

		double exdos = exdospuro / 0.6;

		System.out.println("Si quieres que tu nota sea un " + media
				+ "deberás sacar un " + exdos + " en el segundo examen.");
	}
}
