package arraysbidimensionales;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[][] resultado = Ejercicio4.tablasM();

        System.out.println("Tabla de Multiplicar del 1 al 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] tablasM() {

        int[][] tabla = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        return tabla;

    }
}