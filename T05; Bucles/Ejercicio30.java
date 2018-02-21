/**
 * 
 *Ejercicio 30, bucles: Realiza un programa que calcule las horas
 * transcurridas entre dos horas de dos días de la semana. No se tendrán
 * en cuenta los minutos ni los segundos. El día de la semana se puede
 * pedir como un número (del 1 al 7) o como una cadena (de "lunes" a 
 * "domingo"). Se debe comprobar que el usuario introduce los datos
 * correctamente y que el segundo día es posterior al primero.
 * 
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio30 {
  public static void main(String[] args) {
	
	System.out.println("Dime dos horas de dos días distintos de la " + 
	"semana y yo te diré cuántas horas han pasado desde la primera fecha"
	+ " hasta la segunda indicada. El primer día deberá ser anterior al" 
	+ " segundo, o igual, pero en ese caso la primera hora deberá ser "
	+ "anterior a la segunda.");
	
//Introducción de información del primer día	
	System.out.print("Dime el primer día (introducirlo mediante un" + 
	" número del 1 al 7): ");
	int dia1 = Integer.parseInt(System.console().readLine());
		do {
			System.out.print("El número que has ingresado no corresponde"
			+ " a ningún día. Introduce otro número: ");
			dia1 = Integer.parseInt(System.console().readLine());
		} while ((dia1>7)||(dia1 <1));
		
	System.out.print("Dime la hora del primer día (de 0 a 23): ");
	int hora1 = Integer.parseInt(System.console().readLine());
		do {
			System.out.print("El número que has ingresado no corresponde"
			+ " a ninguna hora. Introduce otro número: ");
			hora1 = Integer.parseInt(System.console().readLine());
		} while ((hora1>23)||(hora1 <0));	
		
//Introducción de información del segundo día		
	System.out.print("Dime el segundo día (introducirlo mediante un" + 
	" número del 1 al 7): ");
	int dia2 = Integer.parseInt(System.console().readLine());
		do {
			System.out.print("El número que has ingresado no corresponde"
			+ " a ningún día. Introduce otro número: ");
			dia2 = Integer.parseInt(System.console().readLine());
		} while ((dia2>7)||(dia2 <1));
		
		do {
			System.out.print("Este día es anterior al día introducido"
			+ " anteriormente. Introduce un día posterior al primero: ");
			dia2 = Integer.parseInt(System.console().readLine());
		} while (dia2<dia1)
		
	System.out.print("Dime la hora del segundo día (de 0 a 23): ");
	int hora2 = Integer.parseInt(System.console().readLine());
		do {
			System.out.print("El número que has ingresado no corresponde"
			+ " a ninguna hora. Introduce otro número: ");
			hora2 = Integer.parseInt(System.console().readLine());
		} while ((hora2>23)||(hora2 <0));	
				
}
}

  
	
