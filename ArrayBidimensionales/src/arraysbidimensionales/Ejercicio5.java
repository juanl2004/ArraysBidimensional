package arraysbidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		int[][] resultado = Ejercicio5.tablaAletorios();

       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
	}

	public static int[][] tablaAletorios() {

		Random random = new Random();

		int[][] Aleatorio = new int[5][6];

		int suma = 0;
		
		for (int i = 0; i < 4; i++) {
			
			suma = 0;
			for (int j = 0; j < 6; j++) {
				if (j==5) {
					
					Aleatorio[5][i] = suma;
				}
				Aleatorio[i][j] = random.nextInt(900) + 100;
				suma += Aleatorio[i][j];
				
			}
			
		}

		return Aleatorio;

	}
}
