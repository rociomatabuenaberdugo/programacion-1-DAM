
public class Mamifero extends Animal {

  public Mamifero() {
    super();
  }
  
  public void amamanta() {
    if ("Macho".equals(this.getSexo())) {
      System.out.println("Soy macho, no puedo amamantar.");
    } else {
      System.out.println("Estoy amamantando a mis crías.");
    }
  }

  public Mamifero(int e, String n, String c, double p, String s) {
    super();
  }

  public void cuidaCrias() {
    System.out.println("Estoy cuidando de mis crias");
  }

  public void anda() {
    System.out.println("Estoy andando");
  }
}
