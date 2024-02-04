package arraysbidimensionales;

public class Ejercicio8 {

	public static void main(String[] args) {

		boolean resultado = Ejercicio8.MatrizSimetrica();

		if (resultado == true) {
			System.out.println("La matriz es simétrica");

		} else {
			System.out.println("La matriz no es simétrica");
		}

	}

	public static boolean MatrizSimetrica() {

		int filas = 3;
		int columnas = 3;
		int[][] tabla = new int[filas][columnas];

		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[0][2] = 3;
		tabla[1][0] = 2;
		tabla[1][1] = 4;
		tabla[1][2] = 5;
		tabla[2][0] = 3;
		tabla[2][1] = 5;
		tabla[2][2] = 6;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					return false;
				}
			}
		}

		return true;

	}
}
