/**
 * Clase Main
 * @author Carlos Andrés
 *
 */
public class Main {
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int m1[][] = new int[2][3];		//Se crean las matrices para probar los métodos
		int m2[][] = new int[3][2];
		int m3[][] = new int[2][3];
		int m4[][] = new int[3][2];
		
		Util.aleatorizar(m1);
		Util.aleatorizar(m2);	//Se aleatorizan 
		Util.aleatorizar(m3);
		Util.pedirDatosUsuario(m4);		//Se piden datos de usuario
		Util.cerrarScanner();			//Se cierra
		
		System.out.println("Se imprime la matriz m1:");
		Util.imprimir(m1);
		System.out.println("\nSe imprime la matriz m2:");
		Util.imprimir(m2);
		System.out.println("\nSe imprime la matriz m3:");
		Util.imprimir(m3);
		System.out.println("\nSe imprime la matriz m4 que fue rellenada por datos del usuario:");
		Util.imprimir(m4);
		
		System.out.println("Se imprime la matriz que da el producto de m1 y m2");
		int resultado1[][] = Util.productoMatricial(m1, m2);	
		Util.imprimir(resultado1);
		
		System.out.println("Se imprime la matriz que da la resta de m1 y m3");
		int resultado2[][] = Util.restar(m1, m3);	
		Util.imprimir(resultado2);
	
		System.out.println("Se imprime la matriz que da la suma de m2 y m4");
		int resultado3[][] = Util.sumar(m2, m4);		
		Util.imprimir(resultado3);

		System.out.println("Se intenta realizar el producto entre m1 y m3");
		int resultado4[][] = Util.productoMatricial(m1, m3);
		Util.imprimir(resultado4);
	}
}
