package exercicio5.modularizacao;

import java.util.Scanner;

public class MultipliquePorEleMesmo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int multiplicacao;

		System.out.print("Entre com o primeiro número: ");
		num1 = sc.nextInt();

		System.out.print("Entre com o segundo número: ");
		num2 = sc.nextInt();

		multiplicacao = multiplica(num1, num2);

		System.out.println(multiplicacao);
	}

	public static int multiplica(int num1, int num2) {

		int resultado = 0;

		for (int i = 0; i < num2; i++) {

			resultado += num1 + num1;

		}

		return resultado;

	}


	}


