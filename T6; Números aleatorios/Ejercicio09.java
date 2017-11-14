/**
* Ejercicio 9, números aleatorio: Realiza un programa que vaya generando
* números aleatorios pares entre 0 y 100 y que no termine de generar
* números hasta que no saque el 24. El programa deberá decir al final
* cuántos números se han generado.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("Números aleatorios pares entre 0 y 100, los cuales" +
    " que se detendrá al salir el 24:");
	 
	 int intros = 0;
	 int num = (int)(Math.random()*101);
	
	do {
		if (num % 2 == 0) {
			System.out.println(num);
			intros++;
		}
		num = (int)(Math.random()*101);
			
	} while (num != 24);

	System.out.print("Han aparecido " + intros + " antes de" + 
		" que aparezca el número 24");
  }
}
