package fixacao.modularizacao;

import java.util.Scanner;

public class ValorInteiroPositivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorInteiro;
		int resultado;

		System.out.print("Digite um valor inteiro e positivo: ");
		valorInteiro = sc.nextInt();
		resultado = fatorial(valorInteiro);

		System.out.println(resultado);

	}

	public static int fatorial(int valorInteiro) {

		int valor = valorInteiro;

		for (int i = valor; i > 1; i--) {

			valorInteiro = valorInteiro * (i - 1);

		}

		return valorInteiro;

	}

}
