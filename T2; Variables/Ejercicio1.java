/**
 *Ejercicio 1, variables: Escribe un programa en el que se declaren las
 * variables enteras x e y. Asignales los valores 144 y 999
 *respectivamente. A continuación, muestra por pantalla el valor de
 * cada variable, la suma, la resta, la división y la multiplicación.
 *
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
   int x = 144;
   int y = 999;
   
   System.out.println("Mi variable x vale" + x);
   System.out.println("Mi variable y vale" + y);
   
   System.out.println("La suma de mis variables es igual a " + (x + y));
   
   System.out.println("La resta de mis variables es igual a " +
   (x - y));
   
   System.out.println("El resultado de dividir mis variables es " +
   ((double)x / (double)y));
   
   System.out.println("El resultado de multiplicar mis variables es " +
   (x * y));
  }
}
