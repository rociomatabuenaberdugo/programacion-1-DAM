/**
* Ejercicio 8, números aleatorio: Modifica el programa anterior para
* que la posibilidad de que salga un 1 sea de 1/2, la probabilidad de 
* que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6.
* Pista: 1/2 = 3/6 y 1/3 = 2/6
* 
*
* Rocío Matabuena Berdugo
*/

public class Ejercicio08 {
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
        resulPar = (int)(Math.random() * 6);
        switch(resulPar) {
          case 0:
            System.out.print("1    |");
            break;
          case 1:
            System.out.print("    2|");
            break;
          case 2:
            System.out.print("  X  |");
            break;
          case 3:
            System.out.print("  X  |");
            break;
          case 4:
            System.out.print("1    |");
            break;
          case 5:
            System.out.print("1    |");
          default:
        }
      }
      System.out.println();
    }
  }
}
