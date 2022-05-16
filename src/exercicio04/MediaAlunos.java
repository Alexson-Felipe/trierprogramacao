package exercicio04;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3;
		double media = 0;
		double soma = 0;

		for (int i = 0; i <= 5; i++) {

			System.out.print("Digite a primeira nota: ");
			nota1 = sc.nextDouble();

			System.out.print("Digite a segunda nota: ");
			nota2 = sc.nextDouble();

			System.out.print("Digite a terceira nota: ");
			nota3 = sc.nextDouble();

			soma = nota1 + nota2 + nota3;

			media += soma / 3;

			System.out.println("A média do aluno é de: " + media);

		}

	}

}
