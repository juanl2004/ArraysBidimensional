package arraysbidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tabla[][] = new int[4][5];

		int nota;

		int contadorN = 0;
		int contadorA = 0;

		for (int i = 0; i < 4; i++) {
			contadorN++;
			for (int j = 0; i < 5; j++) {
				contadorA++;
				System.out.println("Introduce la nota " + contadorA + " del alumno " + contadorN + " --> ");
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
