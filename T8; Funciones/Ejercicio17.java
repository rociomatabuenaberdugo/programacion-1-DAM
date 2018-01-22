/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Roframa Matber
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca un número binario: ");
		long numero = s.nextInt();

		System.out.println(numero + " en binario es el número " +
				matematicas.Matematicas.binario2decimal(numero) + " en decimal.");

	}

}
