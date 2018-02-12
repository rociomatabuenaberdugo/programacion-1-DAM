/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el
 * tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida
 * o servida. La clase debe almacenar información sobre el número total de pizzas que se han pedido
 * y que se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 * @author Roframa Matber
 */
public class Pizza {

  private String tamaño = "";
  private String tipo = "";
  private String estado = "";
  private static int totalServidas;
  private static int totalPedidas;

  public Pizza(String a, String b) {
    this.tamaño = a;
    this.tipo = b;
    this.estado = "pedida";
    totalPedidas++;

  }

  public void sirve() {
    if (this.estado.equals("pedida")){
    this.estado = "servida";
    totalServidas++;
    } else {
      System.out.println("Esta pizza ya ha sido servidda con anterioridad.");
    }
  }

  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  @Override
  public String toString() {
    return "Pizza " + tipo + " " + tamaño + ", " + estado;
  }
 
}
