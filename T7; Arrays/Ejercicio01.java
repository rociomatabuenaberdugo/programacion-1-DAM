/**
* Ejercicio 1, array: Define un array de 12 números enteros con nombre
* num y asigna los valores según la tabla que se muestra a continuación.
* Muestra el contenido de todos los elementos del array. ¿Qué sucede con
* los valores de los elementos que no han sido inicializados?
* 
* Índice	0		1		2		3		4		5		6		7	
* Valor		39		-2						0				14			
* 
* Índice	8		9		10			11			12
* Valor		5		120			
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio01 {
  public static void main(String[] args) {
	  
		int[] n = new int[12];

		n[0] = 39;
		n[1] = -2;
		n[4] = 0;
		n[6] = 14;
		n[8] = 5;
		n[9] = 120;

		for (int i = 0; i < 12; i++) {
			System.out.printf("Para el número [%2d] se tiene el valor "
			+ ": %d\n", i, n[i]);
		}	  
 }
}
