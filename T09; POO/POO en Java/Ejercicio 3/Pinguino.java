public class Pinguino extends Ave {

  public Pinguino() {
    super();
  }
  public Pinguino(int e, String n, String c, double p, String s) {
    super();
  }
  public void deslizo() {
    System.out.println("Me gusta deslizarme por el hielo.");
  }

  public void andar() {
    System.out.println("¿Vamos a dar un paseo?");
  }

  @Override
  public void vuelo() {
    System.out.println("Yo no puedo volar");
  }
}
