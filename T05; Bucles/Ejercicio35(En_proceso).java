/**
 * Ejercicio 35
 *
 * Rocío Matabuena Berdugo
 */

public class Ejercicio35 {
    
  public static void main(String[] args) {
        
	System.out.print("Introduzca la altura: ");
	int altura = Integer.parseInt(System.console().readLine());
	int espacio = altura - 2;
	int ancho = 0;

//Se controla que la altura introducida sea correcta

	while ((altura <= 3)||((altura % 2) == 0)) {
		System.out.println("La altura introducida debe ser un número impar mayor o igual a 3.");
		System.out.print("Introduzca la altura: ");
		altura = Integer.parseInt(System.console().readLine());
		}
	
	int espaciosDelanteros = 4; //Son espacios por la izquierda
	int espaciosInteriores = altura - 2; //Son espacios interiores de la X
	
//Parte superior en forma de V

	int alturaSuperior = (altura / 2) + 1;

	for (int i = 0; i < alturaSuperior; i++) {
	
		//Pinta los espacios de la izquierda
		for (int j = 0; j < espaciosDelanteros; j++) {
			System.out.print(" ");
		}
		
		//Parte izquierda superior de la X
		System.out.print("*");
		
		//Espacios Interiores
		System.out.print(espaciosInteriores);
		
	
		if (i < alturaSuperior - 1) {
			//Espacios Interiores
			for (int k = 0; k < espaciosInteriores; k++) {
				System.out.print(" ");
			}
			
			//Parte derecha superior de la X
			System.out.println("*"); 
		}
				
		espaciosDelanteros++;
		espaciosInteriores -= 2;
		
//Parte inferior en forma de V

	espaciosDelanteros -= 2;
	espaciosInteriores = 0;

	int alturaInferior = (altura / 2);

	for (i = 0; i < alturaInferior; i++) {
	
		//Pinta los espacios de la izquierda
		for (int k = 0; k < espaciosDelanteros; k++) {
			System.out.print(" ");
		}
		
		//Parte izquierda superior de la X
		System.out.print("*");
		
		//Espacios Interiores
		System.out.print(espaciosInteriores);
		
			
			//Parte derecha superior de la X
			System.out.println("*"); 
		}
				
		espaciosDelanteros--;
		espaciosInteriores += 2;		
	}
  }
}
