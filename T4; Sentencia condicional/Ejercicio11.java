50/**
 *Ejercicio 11, sentencia condicional: Escribe un porgrama que dada una
 * hora determinada (horas y minutos), calcule los segundos que faltan
 * para llegar a medianoche.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
   
   System.out.println("Dime una hora (sólo hora, no minutos): ");
   int hora = Integer.parseInt(System.console().readLine());
   
   System.out.println("Dime los minutos: ");
   int min = Integer.parseInt(System.console().readLine());
   
   int segunhechos = (3600 * hora) + (60 * min);
   
   int segunfalta = (24 * 3600);
   
   int total = segunfalta - segunhechos;
   
   if (total == 0) {
	System.out.println("Ya es medianoche.");
	} else {
		System.out.println("Faltan " + total + " segundos para " +
		"medianoche.");
	}
}
}
