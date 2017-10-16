/**
 *Ejercicio 12, sentencia condicional: Realiza un minicuestionario con
 * 10 preguntas tipo test sobre las asignaturas que se imparten en el 
 * curso. CAda pregunta acertada sumará un punto. El programa mostrará
 * al final la calificación obtenida. Pásale el minicuestionario a tus
 * compañeros y pídeles que lo hagan para ver qué tal andan de
 * de conocimientos en las diferentes asignaturas del curso.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
   
   int puntos = 0;
   
   String respuesta;
   
   System.out.println("Minicuestionario de DAM. ");
   
   
   System.out.println("1) ¿De qué página es mascota un pulpogato?");
    System.out.println("a)programin.com  b)github.com " +
    " c)myrepositories.com");
    
   respuesta = System.console().readLine();
   
   if (respuesta.equals("b")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("2) ¿Qué asignatura es BBDD?");
    System.out.println("a)Programación  b)Banca Buena De Distritos " +
    " c)Base de Datos");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("c")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("3) ¿En qué asignatura programamos con Java?");
    System.out.println("a)Programación  b)Banca Buena De Distritos " +
    " c)Base de Datos");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("a")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("4) ¿Qué dos extensiones son los más habituales "
   + "en Lenguaje de Marcas (por el momento)?");
    System.out.println("a).java y .git  b).html y .ccs " +
    " c).mysql");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("b")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("5) ¿Qué día tenemos FOL " +
   "(Formación Orientación Laboral)?");
    System.out.println("a)Ninguna de las siguientes  b)Lunes y Viernes "
    + " c)Jueves");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("a")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("6) ¿De qué asignatura tenemos más horas?");
    System.out.println("a)de BBDD  b)de Programación " +
    " c)tenemos las mismas horas tanto de Programación como de BBDD.");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("b")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   System.out.println("7) ¿Qué dos extensiones son los más habituales "
   + "en Lenguaje de Marcas (por el momento)?");
    System.out.println("a).java y .git  b).html y .cc " +
    " c).mysql");
    
   respuesta = System.console().readLine();
   
    if (respuesta.equals("b")) {
	   puntos = puntos + 1;
   } else {
	   puntos = puntos;
   }
   
   
   
   System.out.println("Tienes " + puntos + " puntos.");
   
}
}
