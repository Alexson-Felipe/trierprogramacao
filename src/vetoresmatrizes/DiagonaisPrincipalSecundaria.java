package vetoresmatrizes;

import java.util.Scanner;

public class DiagonaisPrincipalSecundaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[][] { { 10, 11, 12, 13, 14 }, { 10, 11, 12, 13, 14 }, { 10, 11, 12, 13, 14 },
				{ 10, 11, 12, 13, 14 }, { 10, 11, 12, 13, 14 } };

		int secundaria = 4;

		System.out.println("Principal");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (i == j) {

					System.out.print(" " + matriz[i][j] + "");

				}

			}

		}
		System.out.println();

		System.out.println("Secundária");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (j == secundaria) {

					System.out.print(" " + matriz[i][j]);

					secundaria--;
				}

			}

		}

	}
}
