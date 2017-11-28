/**
* Ejercicio 2, array: Define un array de 10 caracteres con el nombre
* simbolo y asigna valores a los elementos según la tabla que se muestra
* a continuación. Muestra el contenido de todos los elementos del array.
* ¿Qué sucede con los valores de los elementos que no han sido
* inicializados?
* 
* índice	0		1		2		3		4		5		6		7	
* valor		'a'		'x'						'@'				' '		'+'	
* 
* índice	8		9		10
* valor		'Q'					
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio02 {
  public static void main(String[] args) {
	  
		char[] simbolo = new char [10];

		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';

		for (int i = 0; i < 10; i++) {
			System.out.println("Para el hueco " + i + " se tiene el" +
			" caracter: " + simbolo[i]);
		}	  
 }
}
