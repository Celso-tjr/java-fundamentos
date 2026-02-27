package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();

		double vetor1[] = new double[n];
//		double vetorMedia[] = new double[n];
		double soma = 0;

		for (int i = 0; n > i; i++) {

			System.out.print("Digite um numero: ");
			vetor1[i] = sc.nextDouble();
		}

		for (int i = 0; n > i; i++) {

			soma += vetor1[i];

		}

		double media = soma / n;

		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < n; i++) {

			if (vetor1[i] < media) {
				
				System.out.println(vetor1[i]);
			}

		}

		sc.close();
	}

}

//Exemplo:
//Quantos elementos vai ter o vetor? 4
//Digite um numero: 10.0
//Digite um numero: 15.5
//Digite um numero: 13.2
//Digite um numero: 9.8
//MEDIA DO VETOR = 12.125
//ELEMENTOS ABAIXO DA MEDIA:
//10.0
//9.8 
