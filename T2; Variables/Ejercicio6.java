/**
 *
 *Ejercicio 6, variables: Escribe un programa que calcule el total de
 * una factura a partir de la base imponible (precio sin IVA). La base
 * imponible estará almacenada en una variable.
 *
 *Rocío Matabuena Berdugo
 *
 */
 
public class Ejercicio6 {
 public static void main(String[] args) {
 
  double bI;
  double IVA;
  
  bI = 370;
  IVA = bI * 0.21;
  
  System.out.printf("Base imponible %8.2f\n", bI);
  System.out.printf("IVA            %8.2f\n", IVA);
  System.out.println("┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
  System.out.printf("TOTAL          %8.2f\n", (bI + IVA));
  
  }
 }
  
