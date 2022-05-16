package vetoresmatrizes;

import java.util.Scanner;

public class QuantidadeLetras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		String frase = sc.nextLine();

		int qtdLetras = 0;

		for (char c : frase.toCharArray()) {

			if (c == 'a' || c == 'A') {

				qtdLetras++;

			}
		}

		System.out.println(qtdLetras);

	}

}
