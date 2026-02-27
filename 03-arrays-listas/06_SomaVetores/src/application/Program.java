package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.printf("Quantos valores vai ter cada vetor?");
		n = sc.nextInt();

		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetSoma[] = new int[n];
		System.out.println("Digite os valores do vetor A:");

		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");

		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}

		System.out.println("VETOR RESULTANTE:");

		for (int i = 0; i < n; i++) {

			vetSoma[i] = vetorA[i] + vetorB[i];

		}

		for (int i = 0; i < n; i++) {

			System.out.println(vetSoma[i]);

		}

		sc.close();
	}

}

//
//Quantos valores vai ter cada vetor? 6
//Digite os valores do vetor A:
//8
//2
//11
//14
//13
//20
//Digite os valores do vetor B:
//5
//10
//3
//1
//10
//7
//VETOR RESULTANTE:
//13
//12
//14
//15
//23
//27
