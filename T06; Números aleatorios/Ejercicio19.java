/**
* Ejercicio 19, números aleatorio: Escribe un programa que muestre 50
* numeros enteros aleatorios comprendidos entre el -100 y el 200 ambos
* incluídos y separados por espacios. Muestra luego el
* máximo de los pares, el mínimo de los impares y la media de todos los
* números generados.
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio19 {
  public static void main(String[] args) {
	  
	  int maxNumPar = -200;
	  int minNumImpar = 299;
	  int numIntro = 0; 
	  int suma = 0;
	  
	  for (int i = 0; i < 50; i++) {
		  int muesNum =(int)(Math.random()*301 - 100);
		  
		  System.out.print(muesNum + " ");

		  if ((muesNum % 2 == 1)||(-muesNum % 2 == 1)) {
			  if ( minNumImpar > muesNum) {
				  minNumImpar = muesNum;
			  }
		  }
		  if ((muesNum % 2 == 0)||(-muesNum % 2 == 0)) {
			  if (maxNumPar < muesNum) {
				  maxNumPar = muesNum;
			  }
		  }
		  numIntro++;
		  suma += muesNum;
	  }		  
	  
	  double media = (double)suma / (double)numIntro;
	  
	  System.out.println(" ");
	  System.out.println(" ");
	  System.out.println("El número máximo par que ha salido ha " +
	  "sido el: " + maxNumPar);
	  System.out.println("El número mínimo impar que ha salido ha " +
	  "sido el: " + minNumImpar);	  
	  System.out.println("La media de los números introducidos ha" +
	  " sido: " + media );	  	  			    			  																  
 }
}
