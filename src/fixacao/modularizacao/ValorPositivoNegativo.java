package fixacao.modularizacao;

import java.util.Scanner;

public class ValorPositivoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorInteiro = 0;
		boolean resultado;

		System.out.print("Digite um valor inteiro: ");
		valorInteiro = sc.nextInt();

		if (valor(valorInteiro)) {

			System.out.println("O valor � POSITIVO: " + valorInteiro);

		} else {

			System.out.println("O valor � NEGATIVO: " + valorInteiro);
		}
	}

	public static boolean valor(int valorInteiro) {

		boolean variavel;

		if (valorInteiro >= 0) {

			variavel = true;

		} else {

			variavel = false;
		}

		return variavel;

	}

}
