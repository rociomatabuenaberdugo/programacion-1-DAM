/**
* Ejercicio 23, números aleatorio: Las caras de un dado de poker tienen
* las siguientes figurar: As, K, Q, J, 7 y 8. Escribe un programa que
* genere de forma aleatoria la tirada de cinco dados.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio23 {
  public static void main(String[] args) {
	  
		System.out.print("  Resultado de la tirada de cinco dados: ");
		
		System.out.println();
		
		System.out.print("              ");
		
		for (int i = 0; i < 5; i++) {
			int dado = (int) (Math.random() * 6);

			switch (dado) {
				case 0:
					System.out.print("As ");
					break;
				case 1:
					System.out.print("K ");
					break;
				case 2:
					System.out.print("Q ");
					break;
				case 3:
					System.out.print("J ");
					break;
				case 4:
					System.out.print("7 ");
					break;
				case 5:
					System.out.print("8 ");
					break;					
				default:
			}

		}
	}
}
