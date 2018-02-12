import java.util.Scanner;

/**
 * Prueba de la clase Zona
 *
 * @author Roframa Matber
 */
public class PruebaZona {

  public static void main(String[] args) {
    Zona entradas1 = new Zona(1000);
    Zona entradas2 = new Zona(200);
    Zona entradas3 = new Zona(25);
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos al punto de venta de las entradas Expocoches Campanillas."
            + " ¿Qué desea hacer?");
    System.out.println();
    System.out.println("1. Mostrar número de entradas libres");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    System.out.println();
    int op1 = s.nextInt();
    while ((op1 < 1) || (op1 > 3)) {
      System.out.println("Lo siento, ese dato introduccido es incorrecto.");
      System.out.println("Introduzca una opción correcta: ");
      System.out.println();
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println();
      op1 = s.nextInt();
    }

    do {
      switch (op1) {
        case 1:
          System.out.println("Ha seleccionado mostrar el número de entradas libres.");
          System.out.println();
          System.out.println("El número de entradas libres son las siguientes: ");
          System.out.println("Sala principal: " + entradas1.getEntradasPorVender() + " entradas.");
          System.out.println("Zona de compra-venta: " + entradas2.getEntradasPorVender()
                  + " entradas.");
          System.out.println("Zona VIP: " + entradas3.getEntradasPorVender() + " entradas.");
          System.out.println();
          break;
        case 2:
          System.out.println("Ha seleccionado vender entradas.");
          System.out.println();
          System.out.println("¿De qué zona quiere vender la entrada?");
          System.out.println("1. Sala principal.");
          System.out.println("2. Zona de compra-venta.");
          System.out.println("3. Zona VIP.");
          int op2 = s.nextInt();
          while ((op2 < 1) || (op2 > 3)) {
            System.out.println("Lo siento, ese dato introduccido es incorrecto.");
            System.out.println("Introduzca una opción correcta: ");
            System.out.println();
            System.out.println("1. Sala principal.");
            System.out.println("2. Zona de compra-venta.");
            System.out.println("3. Zona VIP.");
            System.out.println();
            op2 = s.nextInt();
          }
          System.out.println("¿Cuántas entradas desea vender de esa zona?");
          int num = s.nextInt();
          switch (op2) {
            case 1:
              entradas1.vender(num);
              break;
            case 2:
              entradas2.vender(num);
              break;
            case 3:
              entradas3.vender(num);
              break;
            default:
          }
          break;
        default:
      }
      System.out.println();
      System.out.println("¿Desea hacer algo más?");
      System.out.println("");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println();
      op1 = s.nextInt();
    } while (op1 != 3);

  }

}
