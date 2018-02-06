
/**
 *Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y
 * aplicándole algunos métodos.
 *
 * @author Roframa Matber
 */
public class Caballo {

  private String nombre = "";
  private int edad;
  private String color = "";
//  private String sexo = "";
//  private String raza = "";
//  private double peso;
//  private String propietario = "";
//  private long codIde;

  Caballo(String x, int y, String z) {
    nombre = x;
    edad = y;
    color = z;

  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nom) {
    this.nombre = nom;
  }

  void cabalga() {
    System.out.println("¿Vamos a pasear?");
  }

  void come(String x) {
    if (x.equals("manzana")) {
      System.out.println("Qué ricas.");
    } else {
      System.out.println("Lo siento, sólo como manzanas.");
    }
  }

  void salta() {
    System.out.println();
  }

  void corre() {
    System.out.println("¡Más rápido, más rápido!");
  }

}
