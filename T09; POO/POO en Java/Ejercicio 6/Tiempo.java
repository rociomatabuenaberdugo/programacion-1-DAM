package tiempo;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos
 * de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le
 * pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el método
 * toString para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m
 * 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que
 * la clase funciona bien.
 *
 * @author Roframa Matber
 */
public class Tiempo {

  private int hora;
  private int minuto;
  private int segundo;

  Tiempo() {
    hora = 00;
    minuto = 00;
    segundo = 00;
  }

  Tiempo(int a, int b, int c) {
    hora = a;
    minuto = b;
    segundo = c;

    if (segundo > 60) {
      int minResul = segundo / 60;
      int segResul = segundo - 60 * minResul;
      minuto = minuto + minResul;
      segundo = segResul;
    }
    if (minuto > 60) {
      int horResul = minuto / 60;
      int minResul = minuto - 60 * horResul;
      minuto = minResul;
      hora = horResul + hora;
    }
  }
  
  Tiempo(int a, int b) {
    minuto = a;
    segundo = b;

    if (segundo > 60) {
      int minResul = segundo / 60;
      int segResul = segundo - 60 * minResul;
      minuto = minuto + minResul;
      segundo = segResul;
    }
    if (minuto > 60) {
      int horResul = minuto / 60;
      int minResul = minuto - 60 * horResul;
      minuto = minResul;
      hora = horResul + hora;
    }
  }  
  Tiempo(int b) {
    segundo = b;

    if (segundo > 60) {
      int minResul = segundo / 60;
      int segResul = segundo - 60 * minResul;
      minuto = minuto + minResul;
      segundo = segResul;
    }
    if (minuto > 60) {
      int horResul = minuto / 60;
      int minResul = minuto - 60 * horResul;
      minuto = minResul;
      hora = horResul + hora;
    }
  }    

  @Override
  public String toString() {
    return (hora + "h " + minuto + "m " + segundo + 's');
  }
/**
 * Da como resultado la suma de dos horas distintas, expresándole en horas, minutos y segundos. Da 
 * igual el orden en el que se coloquen las horas, pudiendo sumar una hora más pequeña con otra más
 * grande o viceversa.
 * 
 * @param a es un objeto de la clase "Tiempo", con tres datos distintos: x hora, y minuto y
 * z segundo.
 *
 * @author Roframa Matber
 */
  void sumar(Tiempo a) {
    int horaTotal = this.hora + a.hora;
    int minTotal = this.minuto + a.minuto;
    int segTotal = this.segundo + a.segundo;
    if (segTotal > 60) {
      int minResul = segTotal / 60;
      int segResul = segTotal - 60 * minResul;
      minTotal = minTotal + minResul;
      segTotal = segResul;
    }
    if (minTotal > 60) {
      int horResul = minTotal / 60;
      int minResul = minTotal - 60 * horResul;
      minTotal = minResul;
      horaTotal = horResul + horaTotal;
    }
    if (horaTotal <= 0) {
    System.out.println("La suma entre estas dos horas es igual a: " + minTotal + "m " +
            segTotal + "s");
    }
    else if (horaTotal > 0) {
    System.out.println("La suma entre estas dos horas es igual a: " + horaTotal + "h " +
            minTotal + "m " + segTotal + "s");
    }
    else if ((horaTotal < 0)&&(minTotal < 0)) {
    System.out.println("La suma entre estas dos horas es igual a: " + segTotal + "s");
    }    
  }
  
/**
 * Da como resultado la resta de dos horas distintas, expresándole en horas, minutos y segundos. Se
 * deberá poner primero una hora SUPERIOR a la siguiente que se ponga, para que así el resultado que
 * devuelva tenga sentido.
 * 
 * @param a es un objeto de la clase "Tiempo", con tres datos distintos: x hora, y minuto y
 * z segundo.
 *
 * @author Roframa Matber
 */
  void restar(Tiempo b) {
    int horaTotal = this.hora - b.hora;
    int minTotal = this.minuto - b.minuto;
    int segTotal = this.segundo - b.segundo;
    if (segTotal > 60) {
      int minResul = segTotal / 60;
      int segResul = segTotal - 60 * minResul;
      minTotal = minTotal + minResul;
      segTotal = segResul;
    }
    if (minTotal > 60) {
      int horResul = minTotal / 60;
      int minResul = minTotal - 60 * horResul;
      minTotal = minResul;
      horaTotal = horResul + horaTotal;
    }
    if (minTotal < 0){
      horaTotal -= 1;
      minTotal = 60 + minTotal; 
    }
    if (segTotal < 0){
      minTotal -= 1;
      segTotal = 60 + segTotal;
    }
    
    if (horaTotal <= 0) {
    System.out.println("La resta entre estas dos horas es igual a: " + minTotal + "m " +
            segTotal + "s");
    }
    else if (horaTotal > 0) {
    System.out.println("La resta entre estas dos horas es igual a: " + horaTotal + "h " +
            minTotal + "m " + segTotal + "s");
    }
    else if ((horaTotal < 0)&&(minTotal < 0)) {
    System.out.println("La resta entre estas dos horas es igual a: " + segTotal + "s");
    } 
  }  

}
