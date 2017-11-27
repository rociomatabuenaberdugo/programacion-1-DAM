/**
* Ejercicio 8, arrays: Realiza un programa que pida la temperatura media
* que ha hecho en cada mes de un determinado año y que muestre a
* continuación un diagrama de barras horizontales con esos datos. Las
* barras del diagrama se pueden dibujar a base de asteriscos o cualquier
* otro carácter.
* 						 
* Rocío Matabuena Berdugo
*/

public class Ejercicio8 {
  public static void main(String[] args) {
	  
	  double [] tem = new double [12];
	  int i;
	  int j;
	  int anio;
	  String [] mes = {
		  "enero","febrero","marzo","abril","mayo","junio",
		  "julio","agosto","septiembre","octubre","noviembre",
		  "diciembre"
		  };
	  
	  System.out.print("Indica un año del cual conozcas las" +
	  " temperaturas medias que hubo cada mes: ");	  
	  anio = Integer.parseInt(System.console().readLine());
	  System.out.println();
	  		  
	  for (i = 0; i < 12; i++) {
		  
		  System.out.print("Indica la temperatura media de " + mes [i]
		  + " de " + anio + ": ");
		  tem [i] = Double.parseDouble(System.console().readLine());

	  }
	  System.out.println();
	  System.out.println();
	  
	  //Barra lateral /////////////////
	  System.out.println("MESES:");
	  for (i = 0; i < 37; i++) {
		  if (i == 2){
			System.out.printf("%-10s *",mes[0]); 
			for (j = 1; j < tem [0]; j++) {
			  System.out.print("*");
			}
			System.out.println();
		  
		  }
		  if (i == 5){
			System.out.printf("%-10s *",mes[1]); 
			for (j = 1; j < tem [1]; j++) {
			  System.out.print("*");
			}
			System.out.println();			
		  }
		  if (i == 8){
			System.out.printf("%-10s *",mes[2]); 
			for (j = 1; j < tem [2]; j++) {
			  System.out.print("*");
			}
			System.out.println();			
		  }		  
		  if (i == 11){
			System.out.printf("%-10s *",mes[3]); 
			for (j = 1; j < tem [3]; j++) {
			  System.out.print("*");
			}
			System.out.println();			
		  }	
		  if (i == 14){
			System.out.printf("%-10s *",mes[4]);
			for (j = 1; j < tem [4]; j++) {
			  System.out.print("*");
			}
			System.out.println();			 
		  }	
		  if (i == 17){
			System.out.printf("%-10s *",mes[5]);
			for (j = 1; j < tem [5]; j++) {
			  System.out.print("*");
			}
			System.out.println();			 
		  }	
		  if (i == 20){
			System.out.printf("%-10s *",mes[6]); 
			for (j = 1; j < tem [6]; j++) {
			  System.out.print("*");
			}
			System.out.println();
		  }	
		  if (i == 23){
			System.out.printf("%-10s *",mes[7]); 
			for (j = 1; j < tem [7]; j++) {
			  System.out.print("*");
			}
			System.out.println();		  
		  }
		  if (i == 26){
			System.out.printf("%-10s *",mes[8]);
			for (j = 1; j < tem [8]; j++) {
			  System.out.print("*");
			}
			System.out.println();			 
		  }			
		  if (i == 29){
			System.out.printf("%-10s *",mes[9]);
			for (j = 1; j < tem [9]; j++) {
			  System.out.print("*");
			}
			System.out.println();			 
		  }	
		  if (i == 32){
			System.out.printf("%-10s *",mes[10]);
			for (j = 1; j < tem [10]; j++) {
			  System.out.print("*");
			}
			System.out.println();		   
		  }	
		  if (i == 35){
			System.out.printf("%-10s *",mes[11]);
			for (j = 1; j < tem [11]; j++) {
			  System.out.print("*");
			}
			System.out.println();			 
		  }		
		 	  		  		  		  		  		  
	  }
 }
}
