package arraysbidimensionales;

public class Ejercicio9 {

	public static void main(String[] args) {
		int filas = 3;
		int columnas = 3;
		int[][] tabla = new int[filas][columnas];

		tabla[0][0] = 8;
		tabla[0][1] = 1;
		tabla[0][2] = 6;
		tabla[1][0] = 3;
		tabla[1][1] = 5;
		tabla[1][2] = 7;
		tabla[2][0] = 4;
		tabla[2][1] = 9;
		tabla[2][2] = 2;

		boolean resultado = Ejercicio9.esMagica(tabla);

		System.out.println("¿Es una matriz mágica? --> " + resultado);
	}

	public static boolean esMagica(int tabla[][]) {

		int sumaFila = 0;

		for (int j = 0; j < tabla.length; j++) {
			sumaFila += tabla[0][j];
		}

		for (int i = 1; i < tabla.length; i++) {
			int sumaFilaActual = 0;
			for (int j = 0; j < tabla.length; j++) {
				sumaFilaActual += tabla[i][j];
			}
			if (sumaFilaActual != sumaFila) {
				return false;
			}
		}

		for (int j = 0; j < tabla.length; j++) {
			int sumaColumna = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
			}
			if (sumaColumna != sumaFila) {
				return false;
			}
		}

		return true;

	}
}
