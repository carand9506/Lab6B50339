// Import para utilizar objetos de tipo Random
import java.util.Random;

// Import para leer datos de la consola
import java.util.Scanner;

/**
 * Esta clase demuestra el uso de m�todos est�ticos y constantes est�ticas.
 * 
 * Adem�s contiene m�todos que realizan funciones �tiles con vectores.
 * 
 * @author Rub�n Jim�nez Go�i adaptaci�n a matrices Carlos Andr�s
 */
public class Util {

	/**
	 * Objeto est�tico de tipo Random que se puede utilizar en cualquier parte
	 * del programa
	 */
	public static Random rand = new Random();
	/**
	 * Objeto est�tico de tipo Scanner que se puede utilizar en cualquier parte
	 * del programa
	 */
	private static Scanner s = new Scanner(System.in);
	/**
	 * M�todo que recibe una matriz de n�meros enteros y aleatoriza cada posici�n
	 * de la matriz
	 * 
	 * @param v
	 *            Matriz que se desea aleatorizar
	 */
	public static void aleatorizar(int v[][]) {
		// Este for recorre todo el vector y...
		for (int i = 0; i < v.length; i++) {
			for(int j = 0; j<v[i].length; j++){
			v[i][j] = rand.nextInt(100);
			}
		}
	}

	public static void pedirDatosUsuario(int v[][]) {

		System.out.println("Ingrese " + v.length
				+ " valores y digite Enter luego de cada valor");

		// Este for recorre toda la matriz y...
		for (int i = 0; i < v.length; i++) {
			for (int j=0 ; j<v[i].length; j++ ){
				System.out.print("Valor para posicion " + i + ","+j+": ");

				// ... solicita al usuario un valor al usuario con s.nextLine()
				v[i][j] = Integer.parseInt(s.nextLine());

				// Integer.parseInt(...) convierte de String a int
			}
		}

	}

	/**
	 * Este m�todo se encarga de cerrar el Scanner.
	 * 
	 * Debe ser llamado si alguien llama al m�todo pedirDatosUsuario
	 * 
	 * Una vez llamado este m�todo en el programa, ya no se puede volver a
	 * llamar al m�todo pedirDatosUsuario
	 */
	public static void cerrarScanner() {
		// Se cierra el Scanner
		s.close();

		// y de paso tambi�n se cierra la entrada de consola
		// System.in
	}

	/**
	 * M�todo que recibe una matriz de n�meros enteros e imprime su contenido en
	 * la consola
	 * 
	 * @param v
	 *            Matriz que se quiere imprimir en la consola
	 */
	public static void imprimir(int v[][]) {

		for (int i = 0; i<v.length ; i++){
			for(int j = 0; j<v[i].length; j++){
				
				if (j==0){
					System.out.print("| ");
				}
				System.out.print(v[i][j]+ " ");
				if (j==(v[i].length-1)){
					System.out.print("|");
				}
			}
			System.out.println();
			
		}
	}

	/**
	 * M�todo que recibe 2 matrices de int y devuelve una matriz con la suma m1 + m2
	 * 
	 * @param m1
	 *            Primera matriz
	 * @param m2
	 *            Segunda matriz
	 * @return Si ambas matrices son del mismo tama�o, devuelve una matriz que
	 *         contiene la suma. Si son de diferentes tama�os, devuelve null.
	 */
	public static int[][] sumar(int m1[][], int m2[][]) {

		// Se crea la matriz para devolver el resultado de la suma
		int resultado[][] = null;

		// Si m1 y m2 tienen el mismo tama�o ...
		if (m1.length == m2.length&& m1[0].length==m2[0].length) {

			// ... se re-inicializa la matriz de resultado
			// con una  matriz del tama�o adecuado
			resultado = new int[m1.length][m1[0].length];

			// Este for recorre la matriz de resultado y ...
			for (int i = 0; i < resultado.length; i++) {
				for(int j = 0; j<resultado[0].length; j++){
					resultado[i][j] = m1[i][j] + m2[i][j];
					
				}
				// ... en cada posici�n coloca la suma correspondiente
			}
		} else {

			// si m1 y m2 tienen tama�os distintos
			// el m�todo imprime un error y devuelve null
			// en vez de una matriz
			System.err
					.println("Util.sumar: Las matrices tienen tama�o diferente");
		}

		return resultado;
	}

	/**
	 * M�todo que recibe 2 matrices de int y devuelve una matriz con la resta m1 - m2
	 * 
	 * @param m1
	 *            Primera matriz
	 * @param m2
	 *            Segunda matriz
	 * @return Si ambas matrices son del mismo tama�o, devuelve una matriz que
	 *         contiene la resta. Si son de diferentes tama�os, devuelve null.
	 */
	public static int[][] restar(int m1[][], int m2[][]) {

		// Se crea la matriz para devolver el resultado de la resta
		int resultado[][] = null;

		// Si m1 y m2 tienen el mismo tama�o ...
		if (m1.length == m2.length&& m1[0].length==m2[0].length) {

			// ... se re-inicializa el vector de resultado
			// con una matriz del tama�o adecuado
			resultado = new int[m1.length][m1[0].length];

			// Este for recorre la matriz de resultado y ...
			for (int i = 0; i < resultado.length; i++) {
				for(int j = 0; j<resultado[0].length; j++){
					resultado[i][j] = m1[i][j] - m2[i][j];
							
				}
				// ... en cada posici�n coloca la resta correspondiente
			}
		} else {

			// si v1 y v2 tienen tama�os distintos
			// el m�todo imprime un error y devuelve null
			// en vez de un vector
			System.err
					.println("Util.sumar: Las matrices tienen tama�o diferente");
		}

			return resultado;
	}

	/**
	 * M�todo que recibe 2 matrices de int y devuelve el producto matricial.
	 * 
	 *El n�mero de columnas de la primer matriz debe igualar el n�mero de filas de la segunda, sino  devuelve un error
	 * 
	 * @param m1 Primer Matriz
	 * @param m2 Segunda Matriz
	 * @return Producto matricial de las matrices.
	 */
	public static int[][] productoMatricial(int m1[][], int m2[][]) {
		
		int resultado[][] = null;
		if (m1[0].length==m2.length){
			resultado = new int[m1.length][m2[0].length];		//Se selecciona la primer fila de la primer matriz y la primer columna de la segunda matriz
			for (int i = 0;i<resultado.length;i++){				// y se multiplican y se suman cada entrada correspondiente
				for (int j = 0; j<resultado[i].length;j++){
					int b=0;
					for (int n = 0; n<m1[0].length; n++){
						int a = m1[i][n]*m2[n][j];
						b+=a;
					}
					
					resultado[i][j]= b;		//Se asigna el valor de la suma a la posici�n correspondiente de la matriz resultado
					
				}
			}
			
		}else{
			System.err
				.println("Util.productoMatricial: La cantidad de columnas de la primer matriz "
						+ "difiere de la cantidad de filas de la segunda");
			
		}
		
		
		return resultado;
	}

}