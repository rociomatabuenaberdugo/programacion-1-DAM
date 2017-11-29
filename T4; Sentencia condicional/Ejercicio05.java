/**
 *Ejercicio 5, sentencia condicional: Realiza un programa que resuelva
 * una ecuación de primer grado (del tipo ax+b=0)
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
 
		System.out.println("Dime tu constante a: ");
		int a = Integer.parseInt(System.console().readLine());

		System.out.println("Dime tu constante b: ");
		int b = Integer.parseInt(System.console().readLine());

		if (a == 0) {
			System.out.println("Como a=0, x no tiene solución real.");
		} else {
			System.out.println("x = " + (-b / a));
		}
	}
}
