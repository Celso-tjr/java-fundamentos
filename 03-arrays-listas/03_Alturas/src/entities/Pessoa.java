package entities;

public class Pessoa {

	public static double media(double[] vetorAltura) {
		double soma = 0;
		for (int i = 0; i < vetorAltura.length; i++) {
			soma += vetorAltura[i];
		}
		return soma / vetorAltura.length;
	}

	public static double porcentagemMenores(int[] vetorIdade) {
		int contador = 0;
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] < 16) {
				contador++;
			}
		}
		return contador * 100.0 / vetorIdade.length;
	}

	public static void listarMenores(int[] vetorIdade, String[] vetorNome) {
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] < 16) {
				System.out.println(vetorNome[i]);
			}
		}
	}
}
