package dinamica;

import java.util.Scanner;

public class Dinamica {
	static int[] valor = new int[10];

	static int[] mPares;
	static int controle;
	static int[] fatorial = new int[valor.length];
	static int[] inverta;
	static int[] mMaiores;
	static int[] quadrado;
	static int[] soma;
	static int[] sValor;
	static int novoValor;
	static int[] repetiu = new int[valor.length];
	static String mensagem;
	static String recebeuMensagem;

	public static void main(String[] args) {

		preencha(valor);

		inverta(valor);
		mostraPares(valor);
		mostraMaiores(valor);
		mostraSemRepeticao(valor);
		mostraQuadrados(valor);
		mostraFatoriais(valor);
		mostreSomaVetores(valor);

	}

	private static void mostreSomaVetores(int[] valor) {

		sValor = new int[valor.length];
		soma = new int[valor.length];
		novoValor = 1;
		preencha(valor);

		for (int i = 0; i < valor.length; i++) {

			soma[i] = valor[i] + sValor[i];

		}

		controle = 7;

		mostre();

	}

	private static void mostraFatoriais(int[] valor) {

		for (int i = 0; i < valor.length; i++) {
			fatorial[i] = valor[i];
		}
		System.out.println();
		for (int i = 0; i < valor.length; i++) {
			for (int j = valor[i]; j > 1; j--) {

				fatorial[i] = fatorial[i] * (j - 1);
			}

		}

		controle = 6;
		mostre();
	}

	public static void mostraQuadrados(int[] valor) {

		quadrado = new int[valor.length];
		for (int i = 0; i < valor.length; i++) {

			quadrado[i] = valor[i] * valor[i];

		}
		controle = 5;
		mostre();

	}

	// NAO CONSEGUI
	public static void mostraSemRepeticao(int[] valor) {

		for (int i = 0; i < valor.length; i++) {
			repetiu[i] = valor[i];

		}

		controle = 4;
		mostre();

	}

	public static void mostraMaiores(int[] valor) {

		mMaiores = new int[valor.length];

		for (int i = 0; i < valor.length; i++) {

			if (valor[i] >= 5) {

				mMaiores[i] = valor[i];

			}

		}
		controle = 3;
		mostre();

	}

	public static void mostraPares(int[] valor) {

		mPares = new int[valor.length];

		for (int i = 0; i < valor.length; i++) {

			if (valor[i] % 2 == 0) {

				mPares[i] = valor[i];

			}

		}

		controle = 1;

		mostre();

	}

	public static void inverta(int[] valor) {

		inverta = new int[valor.length];

		for (int i = 0; i < valor.length; i++) {

			inverta[i] = valor[i];

		}
		controle = 2;
		mostre();
	}

	public static void mostre() {

		switch (controle) {

		case 1:// MOSTRA PARES
			recebeuMensagem = preencheADireita(mensagem);

			System.out.print(recebeuMensagem + ":[");

			for (int i = 0; i < mPares.length; i++) {

				if (mPares[i] != 0) {

					System.out.print(mPares[i] + ",");
				}
			}
			System.out.print("]");

			break;
		case 2: // INVERTA
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = inverta.length - 1; i >= 0; i--) {

				if (i == inverta.length) {

					System.out.print(inverta[i]);
				} else {
					System.out.print(inverta[i] + ",");
				}

			}
			System.out.print("]");
			break;

		case 3: // MOSTRA MAIORES
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = 0; i < mMaiores.length; i++) {
				if (mMaiores[i] != 0) {
					if (i == mMaiores.length - 1) {

						System.out.print(mMaiores[i]);
					} else {
						System.out.print(mMaiores[i] + ",");
					}
				}
			}
			System.out.print("]");
			break;
		case 4: // MOSTRA SEM REPETICAO
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = 0; i < valor.length; i++) {
				boolean repetir = false;
				for (int j = 0; j < valor.length; j++) {

					if ((valor[i] == valor[j] && i != j)) {
						repetir = true;
						break;

					}

				}
				if (!repetir) {
					if (i == valor.length - 1) {

						System.out.print(repetiu[i]);
					} else {

						System.out.print(repetiu[i] + ",");
					}
				}
			}
			System.out.print("]");

			break;
		case 5: // MOSTRAR QUADRADO
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = 0; i < quadrado.length; i++) {

				if (i == quadrado.length - 1) {
					System.out.print(quadrado[i]);
				} else {
					System.out.print(quadrado[i] + ",");
				}
			}
			System.out.print("]");
			break;
		case 6: // MOSTRA FATORIAIS
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = 0; i < fatorial.length; i++) {

				if (i == fatorial.length - 1) {
					System.out.print(fatorial[i]);
				} else {
					System.out.print(fatorial[i] + ",");
				}

			}
			System.out.print("]");
			System.out.println();

			break;

		case 7: // MOSTRE SOMA VETORES
			recebeuMensagem = preencheADireita(mensagem);
			System.out.print(recebeuMensagem + ":[");
			for (int i = 0; i < soma.length; i++) {
				if (i == valor.length - 1) {
					System.out.print(soma[i]);
				} else {
					System.out.print(soma[i] + ",");

				}
			}
			System.out.print("]");
			break;
		default:
			break;
		}
	}

	public static String preencheADireita(String texto) {

		switch (controle) {
		case 1:
			System.out.println();
			texto = "mPares";
			String textoMpares = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textoMpares = textoMpares + " ";

				}
				texto += textoMpares;

				return texto;
			}
			break;
		case 2:
			System.out.println();
			texto = "inverta";
			String textoinverta = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textoinverta = textoinverta + " ";

				}
				texto += textoinverta;

				return texto;
			}

			break;
		case 3:
			System.out.println();
			texto = "mostraMaiores";
			String textomostraMaiores = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textomostraMaiores = textomostraMaiores + " ";

				}
				texto += textomostraMaiores;

				return texto;
			}

			break;
		case 4:
			System.out.println();
			texto = "mostraSemRepeticao";
			String textomostraSemRepeticao = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textomostraSemRepeticao = textomostraSemRepeticao + " ";

				}
				texto += textomostraSemRepeticao;

				return texto;
			}
			break;
		case 5:
			System.out.println();
			texto = "mostraQuadrado";
			String textomostraQuadrado = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textomostraQuadrado = textomostraQuadrado + " ";

				}
				texto += textomostraQuadrado;

				return texto;
			}
			break;
		case 6:
			System.out.println();
			texto = "mostraFatoriais";
			String textomostraFatoriais = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textomostraFatoriais = textomostraFatoriais + " ";

				}
				texto += textomostraFatoriais;

				return texto;
			}

			break;
		case 7:
			System.out.println();
			texto = "mostreSomaVetores";
			String textomostreSomaVetores = "";
			if (texto.length() <= 15) {

				for (int i = 0; i < 15 - texto.length(); i++) {

					textomostreSomaVetores = textomostreSomaVetores + " ";

				}
				texto += textomostreSomaVetores;

				return texto;
			}

			break;

		default:
			break;
		}
		return texto;

	}

	public static void preencha(int[] valor) {
		Scanner sc = new Scanner(System.in);

		switch (novoValor) {
		case 0:
			for (int i = 0; i < valor.length; i++) {
				do {
					System.out.print("Insira um valor na " + (i + 1) + "º posição: ");
					valor[i] = sc.nextInt();

					if (valor[i] == 0 || valor[i] > 15) {

						System.err.println("Erro valor abaixo de 1 ou acima de 15");
					}

				} while (valor[i] == 0 || valor[i] > 15);

			}

			// System.out.print("Insira uma mensagem: \"");
			// mensagem = sc.next();

			break;

		case 1:
			for (int i = 0; i < sValor.length; i++) {
				do {
					System.out.print("Insira um valor novo para um novo vetor " + (i + 1) + "º posição: ");
					sValor[i] = sc.nextInt();

					if (sValor[i] == 0 || sValor[i] > 15) {

						System.err.println("Erro valor abaixo de 1 ou acima de 15");
					}

				} while (sValor[i] == 0 || sValor[i] > 15);

			}

			break;

		default:
			break;
		}

	}

}
