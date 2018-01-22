/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author Roframa Matber
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca un número decimal: ");
		long numero = s.nextInt();

		System.out.println(numero + " en decimal es el número " +
				matematicas.Matematicas.decimal2binario(numero) + " en binario.");

	}
	
}
