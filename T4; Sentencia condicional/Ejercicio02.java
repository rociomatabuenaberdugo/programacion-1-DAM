/**
 *Ejercicio 2, sentencia condicional: Realiza un programa que pida una
 * hora por teclado y que muestre luego buenos días, buenas tardes o 
 * buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de
 * 13 a 20 y de 21 a 5, respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio02 {
  public static void main(String[] args) {
   
   System.out.println("¿Qué hora es? Solamente la hora, no los " +
   "minutos ni los segundos. ");
   int h = Integer.parseInt(System.console().readLine());
   
   if ((h>=6) && ( h<=12 )) {
	   System.out.print("Buenos días.");
	   
   } else {
	   if ((h>=13) && (h<=20)) {
		   System.out.print("Buenas tardes.");
		   
	        } else {
				 
				System.out.print("Buenas noches.");
			}
		}		
	}	
}
