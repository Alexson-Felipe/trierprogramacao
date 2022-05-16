package exercicio04;

import java.util.Scanner;

public class IdadePessoaMaisVelha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;
		int maisVelha = 0;
		int qtdPessoas = 1;

		do {

			System.out.print("Digite a idade: ");
			idade = sc.nextInt();

			qtdPessoas++;

			if (idade > maisVelha) {

				 maisVelha = idade;

			}
		} while (idade != 0);
		

		System.out.println("A idade da pessoa mais velha é " + maisVelha + " " + "anos");

	}
}
