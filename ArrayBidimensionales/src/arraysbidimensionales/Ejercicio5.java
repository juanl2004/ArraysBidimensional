package arraysbidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		int[][] resultado = Ejercicio5.tablaAletorios();

		int sumaFilas = 0;
		int sumaColumna = 0;
		int total = 0;

		for (int[] fila : resultado) {
			sumaFilas = 0;

			for (int valor : fila) {
				System.out.print(valor + "\t");
				sumaFilas += valor;
			}
			System.out.println(sumaFilas);
		}
		
		for (int j=0; j<resultado[0].length; j++) {
			sumaColumna = 0;
			for(int i=0; i<resultado.length; i++) {
				sumaColumna += resultado[i][j];
			}
			total += sumaColumna;
			System.out.print(sumaColumna + "\t");
		}
		System.out.println(total);

	}

	public static int[][] tablaAletorios() {

		Random random = new Random();

		int[][] aleatorio = new int[4][5];

		for (int i = 0; i < aleatorio.length; i++) {

			for (int j = 0; j < aleatorio.length + 1; j++) {
				aleatorio[i][j] = random.nextInt(100, 1000);
			}
		}

		return aleatorio;

	}
}
