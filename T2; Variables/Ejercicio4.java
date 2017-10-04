/**
 *
 *Ejercicio 4, variables: Realiza un conversor de euros a pesetas. La
 * cantidad en euros que se quiere convertir deberá estar almacenada en
 * una variable.
 *
 *Rocío Matabuena Berdugo
 *
 */
 
public class Ejercicio4 {
 public static void main(String[] args) {
 
  double e;
  double p;
  
  e = 1; // 1 euro
  p = e * 166.386; //cada euro equivale a 166.386
  
  System.out.println("Cada euro equivale a " + p + " pesetas.");
  
  e = 2.5;
  p = e * 166.386;
  
  System.out.println(e + " euros equivalen a " + p + " pesetas.");
  
  e = 6;
  p = e * 166.386;
  
  System.out.println(e + " euros son " + p + " pesetas.");
  
  }
 }
  
