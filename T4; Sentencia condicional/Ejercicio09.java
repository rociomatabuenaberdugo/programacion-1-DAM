/**
 *Ejercicio 9, sentencia condicional: Realiza un programa que resuelva
 * una ecuación de segundo grado (del tipo ax² + bx + c = 0)
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {
   
   System.out.println("Dime tu primera constante: ");
   double a = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu segunda constante: ");
   double b = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu tercera constante: ");
   double c = Double.parseDouble(System.console().readLine());
   
   // todos valen 0. 0x² + 0x + 0 = 0
   if ( (a == 0) && (b == 0) && (c == 0)) {
	   System.out.println("La ecuación tiene muchas soluciones.");
	   
	}
	
	//a y b valen 0 mientras que c tiene otro valor. x² + 0x + c = 0
	
	if ( (a == 0) && (b == 0) && (c != 0)) {
	   System.out.println("La ecuación no tiene solución.");
	   
	}
	
	//a vale 0, mientras que b y c tienen otro valor. x² + bx + c = 0
	
	if ( (a == 0) && (b != 0) && (c != 0)) {
	   System.out.println("x es igual a= " + (-c/b));
	   
	}
	
	//c vale 0, mientras que a y b tienen otros valores. ax² + bx = 0
	
	if ( (a != 0) && (b != 0) && (c == 0)) {
	   System.out.println("Tu x puede tener dos valores; el primero " +
	   " es x = 0 y tu segundo valor de x = " + (-b/a));
	}
	
	//todos valen distinto de 0
	
	if ( (a != 0) && (b != 0) && (c != 0)) {
	   double raiz = b*b - (4 * a * c);
	   
		if (raiz < 0) {
			System.out.println("La ecuación no tiene solución real.");
		} else {
	   
	   System.out.println("Tu x puede tener dos valores; el primero " +
	   " es x = " + ((-b + Math.sqrt(raiz)/2*a)) + " y tu segundo " + 
	   "valor puede ser x = " + ((-b - Math.sqrt(raiz)/2*a)));
		}
	}
}
}
