/**
 * 
 *Ejercicio 27, bucles: Escribe un programa que muestre, cuente y sume
 * los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio27 {
  public static void main(String[] args) {
	  
	System.out.println("Dime un número y yo te mostraré, sumaré " + 
	" y contaré los múltiplos del número 3 que hay entre el número 1 " +
	" y el número que me introduzcas.");
	System.out.print("Dime un número (positivos, entero y mayor que uno): ");
	int num = Integer.parseInt(System.console().readLine());

	int cuenta = 0;
	int suma = 0;

	 
	System.out.print("Los números que se encuentran entre el 1 y el " +
	"número que me has introducido son: " );
	
	for (int i = 1; i < num; i++) {
		if ((i % 3) == 0) {
				System.out.print(i + " ");
				cuenta++;
				suma += i;
		}
	}
	
	System.out.println("                                            ");	
	System.out.print("Entre el número 1 y el número " + num + " hay " +
	cuenta + " números. Suman un total de " + suma + ".");	
}
}
