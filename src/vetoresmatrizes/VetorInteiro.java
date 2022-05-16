package vetoresmatrizes;


import java.util.Scanner;

public class VetorInteiro {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int[] vetorRetorno = verificador(vetor);

		for (int i = 0; i < vetorRetorno.length; i++) {
			System.out.println(vetorRetorno[i] + " ");

		}

	}

	private static int[] verificador(int[] vetor) {
		Scanner sc = new Scanner(System.in);

		int vazio = 1;
		int valor = 0;
		int posicao = 0;

		do {
			for (int i = 0; i < vetor.length; i++) {

				if (vetor[i] == 0) {

					System.out.println("A posição " + i + " está vazia");

					vazio = 0;
				}

				if (i == vetor.length - 1 && vazio == 0) {

					System.out.print("Digite um valor: ");
					valor = sc.nextInt();
					System.out.print("Digite a posição: ");
					posicao = sc.nextInt();

					vetor[posicao] = valor;
				} else {

					vazio = 1;
				}
				for (int j = 0; j < vetor.length; j++) {

					if (vetor[i] == 0) {

						vazio = 0;
					}

				}
			}

		} while (vazio == 0);

		return vetor;
	}

}
