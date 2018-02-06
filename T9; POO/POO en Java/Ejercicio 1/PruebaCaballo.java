
public class PruebaCaballo {

  public static void main(String[] args) {

    //Ingresar el nombre, la edad y el color de los caballos.
    
    Caballo a = new Caballo("Izma", 8, "marrón claro");
    Caballo l = new Caballo("Kronk", 5, "Blanco");
    
    System.out.println();
    System.out.println("Hola, me llamo " + a.getNombre());
    a.cabalga();
    a.come("sopa");
    
    System.out.println();
    System.out.println("Hola, yo soy " + l.getNombre());
    l.corre();
    l.come("manzana");
  }
  }
