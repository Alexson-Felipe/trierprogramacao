package exercicio04;

import java.util.Scanner;

public class MediaGeralTurma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double media = 0;
		int qtdAlunos = 1;

		do {

			System.out.print("Entre com a nota do aluno: ");
			nota = sc.nextInt();

			qtdAlunos++;

			media += nota;

		} while (nota != 0);

		media = media / qtdAlunos;

		System.out.println("A média geral da turma é de: " + media);
	}
}
