/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio15;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Roframa Matber
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		System.out.println("Los números primos comprendidos entre 1 y 1000 son: ");
		
		for (int i = 1; i < 1000; i++) {
			if (matematicas.Matematicas.esPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}
}

