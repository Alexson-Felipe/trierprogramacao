package vetoresmatrizes;

import java.util.Scanner;

public class VetorReal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] notasAlunos = new double[10];
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Digite a nota do aluno: ");
			notasAlunos[i] = sc.nextDouble();
		}
		double media = calculaMedia(notasAlunos);
		mostrarMedia(media, notasAlunos);

	}

	public static double calculaMedia(double[] notasAlunos) {

		double mediaAlunos = 0;

		for (int i = 0; i < notasAlunos.length; i++) {

			mediaAlunos += notasAlunos[i];

		}
		mediaAlunos /= notasAlunos.length;

		return mediaAlunos;
	}

	private static void mostrarMedia(double media, double[] notasAlunos) {
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			if(notasAlunos[i] >= media) {
				
			System.out.println("Nota acima da média: " + notasAlunos[i]);
			}
			
		}
		
		
	}
}
