/**
* Ejercicio 5, números aleatorio: MUestra 50 números enteros aleatorios
* entre 100 y 199 (ambos incluidos) separados por espacios. Muestra
* también el máximo, el mínimo y la media de esos números.
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("50 números aleatorios entre 100 y 199." +
    " También mostraré el número con el valor máximo, el mínimo, y" +
    " la media de todos los números:");
    
    int numMax = -1000000;
    int numMin = 10000000;
    int suma = 0;
    int numIntro = 0;
    
    for (int i = 0; i != 50; i++) {
		int num = (int)(Math.random()*100 + 100);
		System.out.print(num + " ");
				
		if (num > numMax){
			numMax = num;
			}
		if (num < numMin) {
			numMin = num;
			}
		suma += num;
		numIntro++;
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Número máximo: " + numMax);
	System.out.println("Número mínimo: " + numMin);
	System.out.println("Media: " + (suma/numIntro));		
  }
}
