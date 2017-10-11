/**
 *Ejercicio 3, sentencia condicional: Escribe un programa en que dado
 * un número del 1 al 7 escriba el correspondiente nombre del día de la
 * semana.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio03 {
  public static void main(String[] args) {
   
   System.out.print("Dime un número y yo te diré con qué día de la  "
   + "semana corresponde: ");
   
   int l = Integer.parseInt(System.console().readLine());
   
   switch (l) {
	   
	   case 1:
	   System.out.print("El día 1 es el Lunes.");
	   break;
	     
	   case 2:
	   System.out.print("El día 2 es el Martes.");
	   break;
	   
	   case 3:
	   System.out.print("El día 3 es el Miércoles.");
	   break;
	   
	   case 4:
	   System.out.print("El día 4 es el Jueves.");
	   break;
	   
	   case 5:
	   System.out.print("El dia 5 es el Viernes.");
	   break;
	   
	   case 6:
	   System.out.print("El día 6 es Sábado.");
	   break;
	   
	   case 7:
	   System.out.print("El día 7 es Domingo.");
	   break;
	   
	   default:
	   System.out.print("Te he pedido un número para decirte el día" + 
	   " de la semana con el cual corresponde, por lo que el número" + 
	   " no puede ser menor que 0 ni mayor que 7.");
	 }
	   
  }
 }
