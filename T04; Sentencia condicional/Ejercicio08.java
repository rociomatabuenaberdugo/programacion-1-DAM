/**
 *Ejercicio 8, sentencia condicional: Amplía el programa anterior para
 * que diga la nota del boletín (insuficiente, suficiente, bien, notable
 * o sobresaliente).
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio08 {
  public static void main(String[] args) {
   
   System.out.println("Dime tu primera nota: ");
   double uno = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu segunda nota: ");
   double dos = Double.parseDouble(System.console().readLine());
   
   System.out.println("Dime tu tercera nota: ");
   double tres = Double.parseDouble(System.console().readLine());
   
   double media = (uno + dos + tres) / 3;
   
   if (media < 5) {
	   System.out.println("Lo siento, has suspendido con un " + media + 
	   ". Insuficiente.");
	   
   } else {
	   
	   if (media == 5) {
	   
	   System.out.println("Felicidades, has aprobado con un " + media +
	   ". Suficiente.");
	   
	   } else {
		   if (media < 7) {
			System.out.println("Felicidades, has aprobado con un " +
			media + ". Bien.");   
	   
			} else {
				if (media < 9) {
			System.out.println("Felicidades, has aprobado con un " +
			media + ". Notable."); 
				
				} else {
				System.out.println("Felicidades, has aprobado con un " +
			media + ". Sobresaliente.");
		}
				
	}	
}
}
}
}
