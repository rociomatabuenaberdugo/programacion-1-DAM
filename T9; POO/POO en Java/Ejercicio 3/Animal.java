public class Animal {

  private int edad;
  private String nombre = "";
  private String color = "";
  private double peso;
  private Sexo sexo;
  
  public Animal(int e, String n, String c, double p, String s) {
    edad = e;
    nombre = n;
    color = c;
    peso = p;
    sexo = s;
  }  

  public Animal() {
    this.sexo = "Macho";
  }

  public Animal(String s) {
    this.sexo = s;
  }

  public String getSexo() {
    return this.sexo;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public Animal(int s) {
    this.edad = s;
  }

  public int getEdad() {
    return this.edad;
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }

}
