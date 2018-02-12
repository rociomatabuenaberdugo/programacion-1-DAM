public class Bicicleta extends Vehiculo {
  
  
  /**
   * Permite hacer al usuario el caballito en la bicicleta.
   * 
   */  
  public void caballito() {
    System.out.println("Ten cuidado de no caerte haciendo el caballito.");
  }  

  public String toString() {
    return "Bicicleta{" + "kilometraje=" + this.getKilometraje() + '}';
  }

}
