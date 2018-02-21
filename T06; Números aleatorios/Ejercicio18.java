/**
* Ejercicio 18, números aleatorio: Sinestesio y Casilda van a pintar los
* tres dormitorios de su casa, quieren sustituir el color blanco por
* colores más alegres. Realiza un programa que genere de forma aleatoria
* una secuencia de tres colores aleatorios (uno para cada dormitorio) de
* tal forma que no se repita ninguno. Los colores entre los que debe
* elegir el programa son los siguientes: rojo, azul, verde, amarillo, 
* violeta y naranja.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio18 {
  public static void main(String[] args) {
	  
	  System.out.println("Deberían pintar los dormitorios de los " +
	  "siguientes colores, para hacerlos más alegres: ");
	  
	  int color1;
	  int color2;
	  int color3; 
	  
	  do {
		  color1 = (int)(Math.random()*6);
		  color2 = (int)(Math.random()*6);
		  color3 = (int)(Math.random()*6);
	  } while ((color1==color2)||(color1==color3)||(color2==color3));
	  
	  switch (color1) {
		  case 0:
			System.out.print("Rojo, ");
			break;
		  case 1:
			System.out.print("Azul, ");
			break;			
		  case 2:
			System.out.print("Verde, ");
			break;
		  case 3:
			System.out.print("Amarillo, ");
			break;
		  case 4:
			System.out.print("Violeta, ");
			break;
		  case 5:
			System.out.print("Naranja, ");
			break;
		  default:
	  }		  	
	  switch (color2) {
		  case 0:
			System.out.print("rojo, ");
			break;
		  case 1:
			System.out.print("azul, ");
			break;			
		  case 2:
			System.out.print("verde, ");
			break;
		  case 3:
			System.out.print("amarillo, ");
			break;
		  case 4:
			System.out.print("violeta, ");
			break;
		  case 5:
			System.out.print("naranja, ");
			break;
		  default:
	  }		
	  switch (color3) {
		  case 0:
			System.out.print("rojo.");
			break;
		  case 1:
			System.out.print("azul.");
			break;			
		  case 2:
			System.out.print("verde.");
			break;
		  case 3:
			System.out.print("amarillo.");
			break;
		  case 4:
			System.out.print("violeta.");
			break;
		  case 5:
			System.out.print("naranja.");
			break;
		  default:
	  }		  			    			  																  
 }
}
