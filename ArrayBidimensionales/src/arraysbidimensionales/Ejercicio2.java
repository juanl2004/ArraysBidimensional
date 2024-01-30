package arraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] tabla = new int[4][5];
		double media = 0;

		for (int fila = 0; fila < 4; fila++) {

			for (int columna = 0; columna < 5; columna++) {
				System.out.println("Introduce la nota " + (columna + 1) + " del alumno " + (fila + 1) + " --> ");
				tabla[fila][columna] = sc.nextInt();

			}
		}

		for (int[] fila : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");

			}
			System.out.println();
		}

		int notaMin = 0;
		int notaMax = 0;

		for (int fila = 0; fila < 4; fila++) {
			System.out.println();
			Arrays.sort(tabla[fila]);
			notaMin = tabla[fila][0];
			notaMax = tabla[fila][4];
			System.out.println("Alumno " + (fila + 1));
			System.out.println("Nota minima --> " + notaMin);
			System.out.println("Nota maxima --> " + notaMax);
			media = 0;
			
			for (int columna = 0; columna < 5; columna++) {
				media += tabla[fila][columna];
				
			}
			System.out.println("Nota media --> " + (media / 5));
		}

		sc.close();
	}

}
