package fixacao;

import java.util.Scanner;

public class CaixaComNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroImpar = 1;

		System.out.print("Digite um numero ímpar: ");
		numeroImpar = sc.nextInt();

		for (int i = 1; i < numeroImpar; i++) {

			for (int j = 1; j < numeroImpar; j++) {

				if (i == j) {

					System.out.println(j);

				} else if (i == j || i == numeroImpar) {

					System.out.println(" *");

				} else if (j == 1 || j == numeroImpar) {

					System.out.println("* ");

				} else {

					System.out.println("");
				}

			}
		}
	}

}
