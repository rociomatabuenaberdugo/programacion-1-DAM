/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

public class Matematicas {

	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en
	 * caso contrario.
	 *
	 * @param n un número entero positivo de hasta cinco cifras.
	 * @return <b>true</b> en caso de que el número sea capicuo o <b>false</b> si no lo
	 * es.
	 */
	public static boolean esCapicua(int n) {

		boolean capicua = false;

		if (n < 10) {
			capicua = true;
		}

		// Para comprobar un número de dos cifras
		if ((n >= 10) && (n < 100)) {
			if ((n / 10) == (n % 10)) {
				capicua = true;
			}
		}

		// Para comprobar un número de tres cifras
		if ((n >= 100) && (n < 1000)) {
			if ((n / 100) == (n % 10)) {
				capicua = true;
			}
		}

		// Para comprobar un número de cuatro cifras
		if ((n >= 1000) && (n < 10000)) {
			if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
				capicua = true;
			}
		}

		// Para comprobar un número de cinco cifras
		if (n >= 10000) {
			if (((n / 10000) == (n % 10)) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
				capicua = true;
			}
		}

		return capicua;
	}

	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso
	 * contrario.
	 *
	 * @param x un número entero positivo
	 * @return <b>true</b> en caso de que el número sea primo o <b>false</b> si no lo es.
	 */
	public static boolean esPrimo(int x) {

		boolean esPri = true;
		int i;

		for (i = 2; i < x; i++) {
			if (x % i == 0) {
				esPri = false;
			}
		}

		return esPri;
	}

	/**
	 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 *
	 * @param s un número entero positivo, primo, mayor al número que se introduce como
	 * parámetro.
	 * @return un <b>int</b> primo mayor al parámetro introducido.
	 */
	@SuppressWarnings("empty-statement")
	public static int sigPrimo(int s) {

		while (!esPrimo(++s)) {
		};
		return s;

	}

	/**
	 * Dada una base y un exponente devuelve la potencia.
	 *
	 * @param b un número entero, que actúa como base.
	 * @param e un número entero, que actúa como exponente de la base.
	 * @return un <b>int</b> que es el resultado de la potencia.
	 */
	public static int potencia(int b, int e) {

		int poten = 1;

		if (e == 0) {
			poten = 1;
		}

		if (e > 0) {
			for (int i = 0; i < e; i++) {
				poten *= b;
			}
		}

		if (e < 0) {
			for (int i = 0; i < -e; i++) {
				poten *= b;
			}

			poten = 1 / poten;
		}

		return poten;
	}

	/**
	 * Cuenta el número de dígitos de un número entero.
	 *
	 * @param d un número entero positivo.
	 * @return un <b>int</b> que es el número de dígitos que presenta el número entero.
	 */
	public static int digitos(int d) {

		if (d == 0) {
			return 1;
		} else {
			int n = 0;
			while (d > 0) {
				d = d / 10;
				n++;
			}
			return n;
		}
	}

	public static int digitos(long x) {
		if (x < 0) {
			x = -x;
		}

		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10; 
				n++; 
			}
			return n;
		}
	}

	/**
	 * Le da la vuelta a un número.
	 *
	 * @param v un número entero positivo.
	 * @return un <b>int</b> que es el número volteado.
	 */
	public static int voltea(int v) {

		int vuelta = 0;

		while (v > 0) {
			vuelta = (vuelta * 10) + (v % 10);
			v /= 10;
		}

		return vuelta;
	}

	/**
	 * Devuelve el dígito que está en la posición n de un número entero. Se empieza
	 * contando por el 0 y de izquierda a derecha.
	 *
	 * @param n un número entero positivo.
	 * @param dp posición de la cual se solicita conocer el número que contiene.
	 * @return un <b>int</b> que es el número que se encuentra en la posición solicitada.
	 */
	public static int digitoN(long n, int dp) {

		for (int i = 0; i < digitos((int) n) - dp; i++) {
			n /= 10;
		}
		return (int) (n % 10);
	}

	public static int digitoN(int n, int dp) {

		return digitoN((long) n, dp);

	}

	/**
	 * Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si
	 * no se encuentra, devuelve -1.
	 *
	 * @param ne número entero que se introduce.
	 * @param di digito que se introduce.
	 * @return un <b>int</b> que es la primera posición en la que se encuentra el dígito
	 * que se ha introducido anteriormente por teclado.
	 */
	public static int posicionDeDigito(int ne, int di) {

		int numero = ne;
		int volt = 0;
		int lond = 0;
		int posic = 1;
		int noPosic = -1;

		if (numero == 0) {
			lond = 1;
		}

		while (numero > 0) {
			volt = (volt * 10) + (numero % 10);
			numero /= 10;
			lond++;
		}

		while (volt > 0) {
			if ((volt % 10) == di) {
				return posic;
			}
			volt /= 10;
			posic++;
		}

		return noPosic;

	}

	/**
	 * Le quita a un número n dígitos por detrás (por la derecha).
	 *
	 * @param q número introducido por el usuario.
	 * @param dd número de dígitos que se quitarán por el lado derecho del número.
	 * @return un <b>int</b> que es el número resultado de quitarle el número de dígitos
	 * solicitados.
	 */
	public static int quitaPorDetras(int q, int dd) {

		int copiaNum = q;
		int copiaDig = dd;
		if (copiaDig > 0) {
			for (int i = 0; i < copiaDig; i++) {
				copiaNum /= 10;
			}
			return copiaNum;
		}
		if (copiaDig == 0) {
			return q;
		}

		return -1;
	}

	/**
	 * Le quita a un número n dígitos por delante (por la izquierda).
	 *
	 * @param q2 número introducido por el usuario.
	 * @param diz número de dígitos que se quitarán por el lado izquierdo del número.
	 * @return un <b>int</b> que es el número resultado de quitarle el número de dígitos
	 * solicitados.
	 */
	public static int quitaPorDelante(int q2, int diz) {
		int vueltaNum = voltea(q2);
		int vueltaNumMenos = quitaPorDetras(vueltaNum, diz);
		int num = voltea(vueltaNumMenos);
		return num;
	}

	/**
	 * Añade un dígito a un número por detrás.
	 *
	 * @param o número introducido por el usuario.
	 * @param ad dígito que se añadirá por detrás al número introducido.
	 * @return un <b>int</b> que es el número resultado de añadirle el dígito indicado.
	 */
	public static int pegaPorDetras(long o, int ad) {
		return (int) juntaNumeros(o, ad);
	}

	/**
	 * Añade un dígito a un número por delante.
	 *
	 * @param w número introducido por el usuario.
	 * @param ad dígito que se añadirá por delante al número introducido.
	 * @return un <b>int</b> que es el número resultado de añadirle el dígito indicado.
	 */
	public static long pegaPorDelante(long w, int ad) {
		return juntaNumeros(w, ad);
	}

	/**
	 * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve
	 * el trozo correspondiente.
	 *
	 * @param x número introducido por el usuario.
	 * @param poi número introducido que indica la primera posición solicitada.
	 * @param pof número introducido que indica la segunda posición solicitada.
	 * @return un <b>int</b> que es el número comprendido entre las dos posiciones
	 * solicitadas.
	 */
	public static long trozoDeNumero(long x, int poi, int pof) {
		int longitud = (int) digitos(x);
		x = quitaPorDelante((int) x, poi - 1);
		x = quitaPorDetras((int) x, longitud - pof);
		return x;
	}

	/**
	 * Pega dos números para formar uno.
	 *
	 * @param nu1 primer número introducido por el usuario.
	 * @param nu2 segundo número introducido por el usuario.
	 * @return un <b>int</b> que es el número resultado de juntar los dos números
	 * introducidos por el usuario.
	 */
	public static int juntaNumeros(int nu1, int nu2) {
		return (nu1 * potencia(10, digitos(nu2))) + nu2;
	}

	public static long juntaNumeros(long nu1, long nu2) {
		return (long) (nu1 * potencia(10, digitos((int) nu2))) + nu2;
	}

	/**
	 * Pasa un número binario a decimal.
	 *
	 * @param num número introducido por el usuario en binario.
	 * @return un <b>int</b> que es el número resultado de pasar el número binario a
	 * decimal.
	 */
	public static long binario2decimal(long num) {

		int suma = 0;

		int copia = (int) num;
		int resto = 0;
		for (int i = 0; i < Matematicas.digitos(copia); ++i) {
			resto = (int) num % 10;

			suma += ((Matematicas.potencia(2, i)) * resto);
			num /= 10;
		}
		return suma;
	}
	
	/**
	 * Pasa un número decimal a binario.
	 *
	 * @param num número introducido por el usuario en decimal.
	 * @return un <b>int</b> que es el número resultado de pasar el número decimal a
	 * binario.
	 */
	public static String decimal2binario(long num) {

		int copia = (int) num;
		String binario = "";
		int resto;
		
		do {
			resto = copia % 2;
			
			if (resto == 1){
				binario += "1";
			} else {
				binario += "0";
			}
			
			copia /= 2;
		} while (copia > 0);
		
		binario = new StringBuilder(binario).reverse().toString();
	//Da la vuelta al String "binario".
		return binario;
	}	
}
