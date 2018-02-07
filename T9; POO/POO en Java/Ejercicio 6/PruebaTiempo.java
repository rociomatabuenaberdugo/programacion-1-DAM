
package tiempo;

public class PruebaTiempo {
  public static void main(String[] args) {
    
   Tiempo hoy =  new Tiempo(13,30,30);
   Tiempo fak =  new Tiempo(12,40,40);
   Tiempo prueba = new Tiempo (12, 40);
   Tiempo prueba2 = new Tiempo (50);
   
   System.out.println(hoy);
   System.out.println(fak);
   System.out.println(prueba);
   System.out.println(prueba2);
   
   hoy.sumar(fak);
   hoy.restar(fak);
   prueba.sumar(prueba2);
   prueba.restar(prueba2);
  }
  
}
