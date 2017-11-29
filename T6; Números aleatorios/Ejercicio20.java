/**
* Ejercicio 20, números aleatorio: Realiza un programa que pinte por
* pantalla una cuba con cierta cantidad de agua. La capacidad será
* indicada por el usuario. La cuba se llenará con una cantidad aleatoria
* de agua que puede ir entre 0 y la capacidad máxima que pueda admitir.
* El ancho de la cuba no varía.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio20 {
  public static void main(String[] args) {
	  
		System.out.print("Dime la capacidad máxima de tu cuba en"
				+ " litros: ");
		int cap = Integer.parseInt(System.console().readLine());

		int agua = (int) (Math.random() * cap + 1);

		System.out.println();
		
			//Formo los laterales aprovechando los espacios o el agua///
			for (int j = 0; j < cap; j++) {
				System.out.print("   ");
				if (j < (cap - agua)) {
					System.out.println("*    *");
				} else {
					System.out.println("*%%%%*");
				}
			}
			//Parte de abajo////////////////////////////////////////////
			System.out.println("   ******");
	}
}
