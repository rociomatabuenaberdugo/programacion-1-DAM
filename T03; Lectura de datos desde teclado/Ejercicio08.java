/**
 *Ejercicio 8, lectura de datos desde el teclado: Escribe un programa
 * que calcule el salario semanal de un empleado en base a las horas
 * trabajadas, a razón de 12 euros la hora.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio08 {
  public static void main(String[] args) {
 
		System.out.print("Dime la cantidad de horas a la semana que"
				+ " trabajas: ");
		double h = Double.parseDouble(System.console().readLine());

		double salario = h * 12;

		System.out.println("Su salario semanal es de " + salario
				+ " euros.");
	}
}
