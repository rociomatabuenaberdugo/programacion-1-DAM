/**
 * 
 *Ejercicio 18, bucles: Escribe un programa que obtenga los números
 * enteros comprendidos entre dos números introducidos por teclado y
 * validados como distintos, el programa debe empezar por el menor de 
 * los enteros introducidos e ir incrementando de 7 en 7
 *
 * 
 * Rocío Matabuena Berdugo
 * 
 */
public class Ejercicio18 {
  public static void main(String[] args) {
	  
	  
		int num1;
		int num2;
		
         System.out.println("Dime dos números enteros diferentes y yo " +
         "te diré los números enteros que se comprenden entre estos de 7 en 7.");
    
		do { 
			System.out.println("Dime un número entero: ");
			num1 = Integer.parseInt(System.console().readLine());
			System.out.println("Dime otro número entero: ");
			num2 = Integer.parseInt(System.console().readLine());
			
		 if (num1 == num2) {
			 System.out.println("Te pedí dos números distintos. A " +
			 "continuación, introduce dos números enteros distintos: ");
		 }
	 } while (num1 == num2);
	 
	 if (num1 < num2) {
		 System.out.println("                                    ");
		 System.out.println("Los números comprendidos entre los " +
		"números dados son:");
		 for (int i = num1; i < num2; i+=7) {
			 System.out.print(i + " ");
	 }
	 } else {
		 System.out.println("                                    ");		 
		 System.out.println("Los números comprendidos entre los " +
		"números dados son:");
		for (int i = num2; i < num1; i+=7 ) {	
		System.out.print(i + " ");
	}
}
}
}
