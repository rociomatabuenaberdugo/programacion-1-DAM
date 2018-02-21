/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera. Para
 * la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el
 * atributo de instancia kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú como el que se muestra
 * a continuación: VEHÍCULOS ========= 1. Anda con la bicicleta 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche 4. Quema rueda con el coche 5. Ver kilometraje de la bicicleta 6. Ver
 * kilometraje del coche 7. Ver kilometraje total 8. Salir Elige una opción (1-8):
 *
 * @author Roframa Matber
 */
public class Vehiculo {

  private static int kilometrajeTotal = 0;
  private static int vehiculosCreados = 0;
  private int kilometraje;

  // método de clase
  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public void recorre(int km) {
    this.kilometraje += km;
    Vehiculo.kilometrajeTotal += km;
    System.out.println("¿Ya estás cansado?");
  }

  public int getKilometraje() {
    return this.kilometraje;
  }

}
