/**
* Ejercicio 10, números aleatorio: Realiza un programa que pinte por
* pantalla diez líneas formadas por caracteres. EL carácter con el que
* se pinta cada línea se elige de forma aleatoria entre uno de los
* siguientes: *,-,=,.,|,@. Las líneas deben tener una longitud aleatoria
* entre 1 y 40 caracteres.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio10 {
  public static void main(String[] args) {
  
  int carac = (int)(Math.random()*6 + 1);
  int longi = (int)(Math.random()*40 + 1);
  
  for (int i= 0; i <10; i++) {
	for ( int j= 0; j < longi; j++) {
		switch (carac) {
		case 1:
			System.out.print("*");
		break;
		case 2:
			System.out.print("-");
		break;
		case 3:
			System.out.print("=");
		break;
		case 4:
			System.out.print(".");
		break;	
		case 5:
			System.out.print("|");
		break;
		case 6:
			System.out.print("@");
		break;	
		}	
	}
	switch (carac) {
		case 1:
			System.out.println("*");
		break;
		case 2:
			System.out.println("-");
		break;
		case 3:
			System.out.println("=");
		break;
		case 4:
			System.out.println(".");
		break;	
		case 5:
			System.out.println("|");
		break;
		case 6:
			System.out.println("@");
		break;	
	}
  }  
 }
}
