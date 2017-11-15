/**
* Ejercicio 16, números aleatorio: Realiza un simulador de máquina 
* tragaperras simplificada que cumpla los siguientes requisitos:
*   a)El ordenador mostrará una tirada que consiste en mostrar 3 figuras.
*     Hay 5 figuras posibles: corazón, diamante, herradura, campana y
*     limón.
*   b)Si las tres figuras son diferentes se debe mostrar el mensaje "Lo
*     siento, ha perdido."
*   c)Si hay dos figuras iguales y una diferente se debe mostrar el
*     mensaje "Bien, ha recuperado su moneda."
*   d) Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha
*     ganado 10 monedas."* 
* 
* Rocío Matabuena Berdugo
*/

public class Ejercicio16 {
  public static void main(String[] args) {
	  
    int figura;
    int fig1 = 0;
    int fig2 = 0;
    int fig3 = 0;
    
    for (int cuenta = 0; cuenta < 3; cuenta++) {
      figura = (int)(5 * Math.random());

      switch(figura) {
        case 0:
          System.out.print("corazón ");
          break;
        case 1:
          System.out.print("diamante ");
          break;
        case 2:
          System.out.print("herradura ");
          break;
        case 3:
          System.out.print("campana ");
          break;
        case 4:
          System.out.print("limón ");
          break;
        default:
      }
      
      switch(cuenta) {
        case 0:
          fig1 = figura;
          break;
        case 1:
          fig2 = figura;
        break;
        case 2:
          fig3 = figura;
        break;
        default:
      }
    }

	System.out.println(" ");
    if ((fig1 != fig2) && (fig2 != fig3) && (fig1 != fig3)) {
      System.out.println("Lo siento, ha perdido.");
    } else if ((fig1 == fig2) && (fig2 == fig3)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else {
      System.out.println("Bien, ha recuperado su moneda.");
    } 	
 }
}
