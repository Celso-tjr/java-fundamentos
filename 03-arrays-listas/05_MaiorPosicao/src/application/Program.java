package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		double[] num = new double[N];
		int maiorNum = 0;

		for (int i = 0; i < N; i++) {

			System.out.println("Digite um numero:");
			num[i] = sc.nextDouble();

		}

		for (int i = 0; i < N; i++) {
			if (num[i] > num[maiorNum]) {
				maiorNum++;

			}

		}
		System.out.println("MAIOR VALOR = " + num[maiorNum]);
		System.out.println("POSICAO DO MAIOR VALOR = " + maiorNum);
		sc.close();
	}
}

//
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//Digite um numero: 13.0
//Digite um numero: 7.0
//MAIOR VALOR = 14.0
//POSICAO DO MAIOR VALOR = 3