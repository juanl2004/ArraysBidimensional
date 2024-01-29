package arraysbidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tabla[][] = new int[4][5];

		int nota;

		for (int i = 1; i <5; i++) {
			for (int j = 1; i < 6; j++) {
				System.out.println("Introduce la nota " + j + " del alumno " + i + " --> ");
				nota = sc.nextInt();
				tabla[i][j] = nota;
			}
		}

		for (int[] fila : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		sc.close();
	}

}
