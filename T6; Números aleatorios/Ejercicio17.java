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
	  
	  String pez = "";
	  
	  //Primera línea ////////////////////////
	  
	  for (int i = 1; i < an - 1; i++) {
	    System.out.print("* ");
	  }
	  
	  //AlturaDer //////////////////////////////
	  
	  for (int j = 1; j < h ; j++) {
	    System.out.print("*");
	    //Espacios //////////////////////////////
	   if (j != 1) {
		   for (int esp = 0; esp < an - 2; esp++) {
		     System.out.print("  ");
//		     int espaciosPez = (int)(Math.random() * (an-3 + h-2));
			
//			 for (int y = 0; y < espaciosPez; y++){
//				 System.out.print(" ");
//			 }
//		     System.out.print(espaciosPez + "&");
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
