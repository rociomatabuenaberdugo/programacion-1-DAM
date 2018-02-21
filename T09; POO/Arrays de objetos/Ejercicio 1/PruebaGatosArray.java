import java.util.Scanner;

/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de
 * ellos mediante un bucle. Muestra a continuación los datos de todos los gatos utilizando también
 * un bucle.
 *
 * @author Roframa Matber
 */
public class PruebaGatosArray {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Gato[] gato = new Gato[4];
    int i;
    System.out.println("Piensa en cuatro gatos distintos:");
    System.out.println();

    for (i = 0; i < 4; i++) {
      gato[i] = new Gato();
      System.out.println("Dime el nombre del gato " + (i + 1) + ": ");
      String nom = s.nextLine();
      gato[i].setNombre(nom);
      System.out.println("Dime el color del gato " + (i + 1) + ": ");
      String col = s.nextLine();
      gato[i].setColor(col);
      System.out.println("Dime la raza del gato " + (i + 1) + ": ");
      String raz = s.nextLine();
      gato[i].setRaza(raz);
      System.out.println();
    }
    System.out.println("Los datos que has introducido son los siguientes: ");
    System.out.println();
    
    for (i = 0; i < 4; i++){
      System.out.println("El nombre del gato " + (i + 1) + " es: " + gato[i].getNombre());
      System.out.println("El color del gato " + (i + 1) + " es: " + gato[i].getColor());
      System.out.println("La raza del gato " + (i + 1) + " es: " + gato[i].getRaza());
      System.out.println();
      
    }
  }

}
