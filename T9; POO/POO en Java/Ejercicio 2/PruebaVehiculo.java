import java.util.Scanner;

public class PruebaVehiculo {

  public static void main(String[] args) {

    Bicicleta bici = new Bicicleta();
    Coche coche = new Coche();

    Scanner s = new Scanner(System.in);
    System.out.println("VEHICULOS");
    System.out.println("==========");
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    System.out.println("Elige una opción (1-8):");
    int opcion = s.nextInt();
    System.out.println();

    while ((opcion < 1) || (opcion > 8)) {
      System.out.println("La opción escogida no es correcta. Seleccione otra: ");
      opcion = s.nextInt();
      System.out.println();
    }

    while (opcion != 8) {

      switch (opcion) {
        case 1:
          System.out.println("Dime cuántos kilómetros quieres recorrer: ");
          int a = s.nextInt();
          bici.recorre(a);
          System.out.println();
          break;
        case 2:
          bici.caballito();
          System.out.println();
          break;
        case 3:
          System.out.println("Dime cuántos kilómetros quieres recorrer: ");
          int b = s.nextInt();
          coche.recorre(b);
          System.out.println();
          break;
        case 4:
          coche.quemaRueda();
          System.out.println();
          break;
        case 5:
          System.out.println("Con la bicicleta llevas recorrido un total de "
                  + bici.getKilometraje() + " km");
          System.out.println();
          break;
        case 6:
          System.out.println("Con el coche llevas recorrido un total de "
                  + coche.getKilometraje() + " km");
          System.out.println();
          break;
        case 7:
          System.out.println("Llevas recorrido un total de "
                  + Vehiculo.getKilometrajeTotal() + " km");
          System.out.println();
          break;
        case 8:
        default:
      }

      System.out.println("¿Quieres hacer algo más?");
      System.out.println("VEHICULOS");
      System.out.println("==========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8):");
      opcion = s.nextInt();
      System.out.println();

    }
  }

}
