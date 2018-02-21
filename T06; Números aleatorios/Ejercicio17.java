/**
* Ejercicio 17, números aleatorio: Realiza un programa que pinte por
* pantalla una pecera con un pececito dentro. Se dene pedir al usuario
* el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.
* No hay que comprobar que los datos se introducen correctamente:
* podemos suponer que el usuario los introduce bien. Dentro de la pecera
* hay que colocar de forma aleatoria un pececito, que puede estar
* situado en cualquiera de las posiciones que quedan en el hueco que
* forma el rectángulo.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio17 {
  public static void main(String[] args) {
	  
	  System.out.print("Introduce la altura de tu pecera" +
	  " (deberá ser mayor que 4): ");
	  int h = Integer.parseInt(System.console().readLine());
	  System.out.print("Introduce el ancho de tu pecera" +
	  " (también deberá ser mayor que 4): ");
	  int an = Integer.parseInt(System.console().readLine());
	  
	  int posicion = 0;
	  int posPez = (int)(Math.random()*(h-2)*(an-2));
	  
	  //Primera línea ////////////////////////
	  
	  for (int i = 0; i < an - 2; i++) {
	    System.out.print("* ");
	  }
	  
	  //AlturaDer //////////////////////////////
	  
	  for (int j = 1; j < h ; j++) {
	    System.out.print("*");
	    //Espacios + Pez //////////////////////////////
	   if (j != 1) {
		   for (int esp = 1; esp < an - 1; esp++) {
			 posicion++;
			 if (posicion == posPez) {
				 System.out.print("& ");
			 } else {
				 System.out.print("  ");
			 }
			}
		}
		System.out.println(" *");
		//System.out.println();
	  }
	  
	  //Última línea /////////////////////////
	  
	  for (int k = h; k < h + an; k++) {
	    System.out.print("* ");
	  }
	  

	  
 }
}
