package vetoresmatrizes;

import java.util.Scanner;

public class MatrizOriginal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 9, 8, 7, 6, 5, 4, 3, 2, 1 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 9, 8, 7, 6, 5, 4, 3, 2, 1 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

				mostrarOriginal(matriz);
	}
				
		public static void mostrarOriginal(int matriz[][]) {
				
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

			}

		}

		String matrizOriginal = "";

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				matrizOriginal = matrizOriginal + matriz[i][j];
			}
			matrizOriginal = matrizOriginal + "\n";
		}
		System.out.println(matrizOriginal);
	}
}
