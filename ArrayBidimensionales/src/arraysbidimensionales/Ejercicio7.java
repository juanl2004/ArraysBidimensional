package arraysbidimensionales;

public class Ejercicio7 {

	public static void main(String[] args) {

		int[][] resultado = Ejercicio7.ordenarT();

		for (int[] fila : resultado) {
			for (int valor : fila) {
				System.out.print(valor + "\t");

			}
			System.out.println();
		}

	}

	public static int[][] ordenarT() {

		int[][] tabla = new int[4][4];
		int[][] tablaOrd = new int[4][4];

		int valor = 1;

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = valor++;
			}
		}

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {
				tablaOrd[i][j] = tabla[j][i];
			}
		}

		return tablaOrd;

	}

}
