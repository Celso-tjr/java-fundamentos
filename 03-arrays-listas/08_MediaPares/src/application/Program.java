package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int nPares = 0;
		double media, soma = 0;

		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int vetor[] = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {

			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				nPares++;

			}

		}

		media = soma / nPares;

		if (nPares == 0) {

			System.out.println("NENHUM NUMERO PAR");
		} else {

			System.out.println("MEDIA DOS PARES: " + media);
		}

		sc.close();
	}

}

//
//
//Exemplo 1:
//Quantos elementos vai ter o vetor? 6
//Digite um numero: 8
//Digite um numero: 2
//Digite um numero: 11
//Digite um numero: 14
//Digite um numero: 13
//Digite um numero: 20
//MEDIA DOS PARES = 11.0
//Exemplo 2:
//Quantos elementos vai ter o vetor? 3
//Digite um numero: 7
//Digite um numero: 9
//Digite um numero: 11
//NENHUM NUMERO PAR 
