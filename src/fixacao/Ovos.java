package fixacao;

import java.util.Scanner;

public class Ovos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdOvos = 0;
		double valorPago = 0;
		int ovos = 0;

		System.out.print("Digite a quantidade de ovos que gostaria de comprar: ");
		ovos = sc.nextInt();

		if (qtdOvos == 1) {

			valorPago = 1.50;

			System.out.println("O valor a ser pago é de " + "R$:" + valorPago);
		}
		if (qtdOvos >= 6) {
			valorPago = 6;
			
			if (qtdOvos <= 11) {

			valorPago = valorPago + qtdOvos * 10;
			ovos = ovos - (qtdOvos * 6);

			System.out.println("O valor a ser pago é de " + "R$:" + ovos + " reais");

		}
		if (qtdOvos == 12) {

			valorPago = 10;

			System.out.println("O valor a ser pago é de " + "R$:" + valorPago + " reais");

		}
		if (qtdOvos == 30) {

			valorPago = 21;

			System.out.println("O valor a ser pago é de " + "R$:" + valorPago + " reais");
		}
	}
	}
}

