public class Coche extends Vehiculo {
  
  /**
   * Hace que el coche pueda quemar rueda.
   * 
   */  
  public void quemaRueda() {
    System.out.println("Ten cuidado de no quemar demasiado la rueda.");
  }  

  public String toString() {
    return "Coche{" + "kilometraje=" + this.getKilometraje() + '}';
  }


  
  
}
