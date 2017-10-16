/**
 *Ejercicio 10, sentencia condicional: Escribe un programa que nos diga
 * el horóscopo a partir del día y el mes de nacimiento.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
   
   System.out.println("Dime únicamente el día en el que naciste: ");
   int dia = Integer.parseInt(System.console().readLine());
   
   System.out.println("Dime el mes en el cual naciste (en número): ");
   int mes = Integer.parseInt(System.console().readLine());
   
   switch (mes) {
	   case 1:
	   if (dia < 20) {
		   System.out.println("Tu horóscopo es el de Capricornio.");
	   } else {
		   System.out.println("TU horóscopo es el de Acuario.");
	   }
	   break;
	   case 2: 
		if (dia < 19) {
		   System.out.println("Tu horóscopo es el de Acuario.");
	   } else {
		   System.out.println("TU horóscopo es el de Piscis.");
	   }
	   break;
	   case 3:
	   if (dia < 21) {
		   System.out.println("Tu horóscopo es el de Piscis.");
	   } else {
		   System.out.println("TU horóscopo es el de Aries.");
	   }
	   break;
	   case 4:
	   if (dia < 20) {
		   System.out.println("Tu horóscopo es el de Aries.");
	   } else {
		   System.out.println("TU horóscopo es el de Tauro.");
	   }
	   break;
	   case 5:
	   if (dia < 21) {
		   System.out.println("Tu horóscopo es el de Tauro.");
	   } else {
		   System.out.println("TU horóscopo es el de Géminis.");
	   }
	   break;
	   case 6:
	   if (dia < 21) {
		   System.out.println("Tu horóscopo es el de Géminis.");
	   } else {
		   System.out.println("TU horóscopo es el de Cáncer.");
	   }
	   break;
	   case 7:
	   if (dia < 23) {
		   System.out.println("Tu horóscopo es el de Cáncer.");
	   } else {
		   System.out.println("TU horóscopo es el de Leo.");
	   }
	   break;
	   case 8:
	   if (dia < 23) {
		   System.out.println("Tu horóscopo es el de Leo.");
	   } else {
		   System.out.println("TU horóscopo es el de Virgo.");
	   }
	   break;
	   case 9:
	   if (dia < 23) {
		   System.out.println("Tu horóscopo es el de Virgo.");
	   } else {
		   System.out.println("TU horóscopo es el de Libra.");
	   }
	   break;
	   case 10:
	   if (dia < 23) {
		   System.out.println("Tu horóscopo es el de Libra.");
	   } else {
		   System.out.println("TU horóscopo es el de Escorpio.");
	   }
	   break;
	   case 11:
	   if (dia < 22) {
		   System.out.println("Tu horóscopo es el de Escorpio.");
	   } else {
		   System.out.println("TU horóscopo es el de Sagitario.");
	   }
	   break;
	   case 12:
	   if (dia < 22) {
		   System.out.println("Tu horóscopo es el de Sagitario.");
	   } else {
		   System.out.println("TU horóscopo es el de Capricornio.");
	   }
	   break;
}
}
}
