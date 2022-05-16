package vetoresmatrizes;

import java.util.Scanner;

public class VetorParesImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		int vetorPar = 0;
		int vetorImpar = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Entre com um vetor: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {

				vetorPar++;

			} else {

				vetorImpar++;

			}

		}

		System.out.println("Vetores pares: " + vetorPar + "\nVetores ímpares: " + vetorImpar);

	}

}
