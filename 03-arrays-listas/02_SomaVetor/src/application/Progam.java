package application;

import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero:");
			vetor[i] = sc.nextInt();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		double media = soma / n;

		System.out.print("VALORES: ");

		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.printf("\nSOMA: %.2f\n", soma);
		System.out.printf("MEDIA: %.2f", media);

		sc.close();
	}

}

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
//Exemplo:
//Quantos numeros voce vai digitar? 4
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//VALORES = 8.0 4.0 10.0 14.0
//SOMA = 36.00
//MEDIA = 9.00 
