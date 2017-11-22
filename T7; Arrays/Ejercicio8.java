/**
* Ejercicio 8, array: Realiza un programa que pida la temperatura media
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
	  
	  
 }
}
