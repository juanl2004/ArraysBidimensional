package arraysbidimensionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int longitud;
		int valor = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud de tu array --> ");
		longitud = sc.nextInt();

		int[][] tablaInicio = new int[longitud][longitud];

		for (int i = 0; i < tablaInicio.length; i++) {

			for (int j = 0; j < tablaInicio.length; j++) {
				tablaInicio[i][j] = valor++;
			}
		}

		int[][] resultado1 = Ejercicio10.gira90(tablaInicio);

		for (int[] fila : resultado1) {
			for (int valor1 : fila) {
				System.out.print(valor1 + "\t");

			}
			System.out.println();
		}

	}

	public static int[][] gira90(int tablaInicio[][]) {

		 int n = tablaInicio.length;
	        int[][] resultado = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                resultado[j][n - 1 - i] = tablaInicio[i][j];
	            }
	        }
		
		return resultado;
	}
}
