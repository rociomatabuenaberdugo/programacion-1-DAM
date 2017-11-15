/**
* Ejercicio 7, números aleatorio: Escribe un programa que muestre tres
* apuestas de la quiniela en tres columnas para los 14 partidos y el
* pleno al quince (15 filas).
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println("Quiniela aleatoria:");
	
    int resulPar;
    int colum
     = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        colum = 1;
      }
      
      for (int apu = 1; apu <= colum; apu++) {
        resulPar = (int)(Math.random() * 3);
        switch(resulPar) {
          case 0:
            System.out.print("1    |");
            break;
          case 1:
            System.out.print("    2|");
            break;
          case 2:
            System.out.print("  X  |");
          default:
        }
      }
      System.out.println();
    }
  }
}
