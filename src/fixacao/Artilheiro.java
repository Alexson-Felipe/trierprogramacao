package fixacao;

import java.util.Scanner;

public class Artilheiro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdPartidas = 1;
		int qtdChutesGol = 0;
		int qtdGols = 0;
		double mediaChutes, mediaGols, partidasSemGols = 0;

		System.out.print("Digite a quantidade de partidas Deyvinho jogou este ano: ");
		qtdPartidas = sc.nextInt();

		for (int i = 0; i < qtdPartidas; i++) {

			System.out.print("Quantos chutes a gol Deyvinho chutou na partida? ");
			qtdChutesGol = sc.nextInt();

			System.out.print("Quantos gols Deyvinho fez na partida? ");
			qtdGols = sc.nextInt();

			mediaChutes = qtdChutesGol / qtdPartidas;

			mediaGols = qtdGols / qtdPartidas;

			System.out.println("A média de chutes a gol por partida é de: " + mediaChutes);
			System.out.println("A média de gols por partida é de: " + mediaGols);

			if (qtdGols == 0) {

				partidasSemGols += 1;

			} else {
				partidasSemGols = 0;
			}

		}
		System.out.println("A maior sequencia de jogos sem gol foi de: " + partidasSemGols);

	}
}
