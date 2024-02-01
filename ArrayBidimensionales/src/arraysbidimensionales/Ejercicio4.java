package arraysbidimensionales;
/**
 * Clase con funciones para conseguir representar las tablas de multiplicar del
 * 1 al 10 en un array de 10 x 10.
 */
public class Ejercicio4 {

	/**
	 * En la función main 
	 * @param args
	 */
	public static void main(String[] args) {

		// En la variable resultado llamamos a la función.
		int[][] resultado = Ejercicio4.tablasM();

		// Imprimos la tabla calculada en la función.
		System.out.println("Tabla de Multiplicar del 1 al 10:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Creamos una función llamada tablasM para rellenar un array de 10 filas y 10
	 * columnas, y completarlas con las tablas de multiplicar.
	 */
	public static int[][] tablasM() {

		// Creamos una array llamado tabla de 10 filas y 10 columnas
		int[][] tabla = new int[10][10];

		// Con este for recoremos las filas
		for (int i = 0; i < 10; i++) {
			// Con este for recorremos las columnas
			for (int j = 0; j < 10; j++) {
				// En cada espacio vamos almacenando la multiplicación de la fila y columna en
				// la que esta, le sumamos 1 para evitar multiplicar por 0.
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}

		// Devolvemos el resultado
		return tabla;

	}
}