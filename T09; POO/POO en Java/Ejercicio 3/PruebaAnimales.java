public class PruebaAnimales {

  public static void main(String[] args) {
    // Prueba de Gato, Perro, Canario, Pingüino y Lagarto.

    Gato garldfield = new Gato(8, "Gardlfield", "blanco", 15, "Hembra");
    Perro bonzo = new Perro(8, "Bonzo", "blanco", 30, "Macho");
    Canario piolin = new Canario(8, "Piolín", "amarillo", 5, "Macho");
    Pinguino pingu = new Pinguino(8, "Pingü", "blanco y negro", 20, "Macho");
    Lagarto rox = new Lagarto(8, "Rox", "verde oscuro", 5, "Macho");

    System.out.println();
    garldfield.ronronea();
    garldfield.duerme();

    System.out.println();
    bonzo.juegaConPelota();
    bonzo.come("pienso");

    System.out.println();
    piolin.picotear();
    piolin.duerme();

    System.out.println();
    pingu.deslizo();
    pingu.come("pescado");

    System.out.println();
    rox.esconderse();
    rox.duerme();

  }

}
