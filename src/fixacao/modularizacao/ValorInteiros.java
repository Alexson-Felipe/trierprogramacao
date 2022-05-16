package fixacao.modularizacao;

import java.util.Scanner;

public class ValorInteiros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, valor3;

		System.out.print("Digite o primeiro valor inteiro: ");
		valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor inteiro: ");
		valor2 = sc.nextInt();

		System.out.print("Digite o terceiro valor inteiro: ");
		valor3 = sc.nextInt();

		ordenacao(valor1, valor2, valor3);
	}

	public static void ordenacao(int valor1, int valor2, int valor3) {

		if (valor1 < valor2 && valor1 < valor3) {

			if (valor2 < valor3) {

				System.out.println("Ordenação: " + valor1 + " " + valor2 + " " + valor3);
			} else {

				System.out.println("Ordenação: " + valor1 + " " + valor3 + " " + valor2);
			}
		}

		if (valor2 < valor1 && valor2 < valor3) {

			if (valor1 < valor3) {

				System.out.println("Ordenação: " + valor2 + " " + valor1 + " " + valor3);

			} else {
				System.out.println("Ordenação: " + valor2 + " " + valor3 + " " + valor1);

			}
		}

		if (valor3 < valor1 && valor3 < valor2) {

			if (valor2 < valor1) {

				System.out.println("Ordenação: " + valor3 + " " + valor2 + " " + valor1);

			} else {
				System.out.println("Ordenação: " + valor3 + " " + valor1 + " " + valor2);
			}

		}

	}
}
