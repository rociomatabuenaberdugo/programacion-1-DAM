/**
 *
 *Ejercicio 5, variables: Realiza un conversor de pesetas a euros. La
 * cantidad en pesetas que se quiere convertir deberá estar almacenada
 * en una variable.
 *
 *Rocío Matabuena Berdugo
 *
 */
 
public class Ejercicio5 {
 public static void main(String[] args) {
 
  double e;
  double p;
  
  p = 1; // 1 euro
  e = p / 166.386; //cada euro equivale a 166.386
  
  System.out.println("Cada peseta equivale a " + e + " euros.");
  
  p = 998.316;
  e = p / 166.386;
  
  System.out.println(p + " pesetas equivalen a " + e + " euros.");
  
  p = 166.386;
  e = p / 166.386;
  
  System.out.println(p + " pesetas son " + e + " euros.");
  
  }
 }
  
