/**
 *Ejercicio 13, sentencia condicional: Escribe un porgrama que ordene
 * tres números enteros introducidos por teclado.
 *
 *Rocío Matabuena Berdugo
 */
 
public class Ejercicio13 {
  public static void main(String[] args) {
   
   System.out.println("Dime tres números enteros (al introducir uno " + 
   "pulse Intro): ");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
   
   if ((a<b)&&(b<c)) {
	System.out.println("Los números ordenados son: " + a + ", " + b + 
	" y " + c);
	}
	if ((a>b)&&(a<c)){
	System.out.println("Los números ordenados son: " + b + ", " + a + 
	" y " + c);		
	}
	if ((a<b)&&(a>c)){
	System.out.println("Los números ordenados son: " + c + ", " + a + 
	" y " + b);		
	}	
	if ((c<b)&&(a>b)){
	System.out.println("Los números ordenados son: " + c + ", " + b + 
	" y " + a);		
	}
	if ((c<a)&&(c>b)){
	System.out.println("Los números ordenados son: " + b + ", " + c + 
	" y " + a);		
	}
	if ((c==a)&&(a==b)){
	System.out.println("Los números que has introducidos son " +
	"todos iguales.");		
	}
	if ((a==b)&&(a<c)){
	System.out.println("Los números ordenados son: " + a + " y " + c);		
	}
	if ((b==c)&&(b<a)){
	System.out.println("Los números ordenados son: " + b + " y " + a);		
	}
	if ((a==c)&&(a<b)){
	System.out.println("Los números ordenados son: " + a + " y " + b);		
	}
	if ((a==b)&&(a>c)){
	System.out.println("Los números ordenados son: " + c + " y " + a);		
	}
	if ((b==c)&&(b>a)){
	System.out.println("Los números ordenados son: " + a + " y " + b);		
	}
	if ((a==c)&&(a>b)){
	System.out.println("Los números ordenados son: " + b + " y " + a);		
	}
}
}
