/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Roframa Matber
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		System.out.println("Los números capicuas comprendidos entre 1 y 99999 son: ");
		
		for (int i = 1; i < 99999; i++) {
			if (matematicas.Matematicas.esCapicua(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
}
