/**
* Ejercicio 11, números aleatorio: Realiza un programa que muestre 20
* notas generadas al azar. Las notas deben aparecer de la forma:
* suspenso, bien, notable o sobresaliente. Al final aparecerá el número
* de suspensos, el número de suficientes, etc.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  
  int sus = 0;
  int bn = 0;
  int not = 0;
  int sobsal = 0;
  
  for (int i= 0; i < 20; i++) {
	 int nota = (int)(Math.random()*10 + 1);
	 if (nota < 5) {
		System.out.println("Suspenso.");
		sus++;
	 }
	 if ((nota > 4)&&(nota < 7)) {
		System.out.println("Bien.");
		bn++;
	 }
	 if ((nota > 6)&&(nota < 9)) {
		System.out.println("Notable.");
		not++;
	 }
	 if ((nota > 8)&&(nota < 11)) {
		 System.out.println("Sobresaliente.");
		 sobsal++;
	 }
  }

  System.out.println(" ");  
  System.out.println("Suspensos: " + sus);
  System.out.println("Bienes: " + bn);
  System.out.println("Notables: " + not);
  System.out.println("Sobresalientes: " + sobsal);
    
 }
}
