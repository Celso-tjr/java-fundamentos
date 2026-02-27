package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		int[] num = new int[N];
		int i = 0;
		int qntd = 0;

		for (i = 0; i < N; i++) {

			System.out.println("Digite um numero:");
			num[i] = sc.nextInt();

		}

		System.out.println("NUMEROS PARES ");

		for (i = 0; i < N; i++) {
			if (num[i] % 2 == 0) {
				qntd++;
				System.out.print(num[i] + " ");
			}
		}

		System.out.println("\nQUANTIDADE DE PARES:" + qntd);

		sc.close();
	}
}

//
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//Digite um numero: 2
//Digite um numero: 11
//Digite um numero: 14
//Digite um numero: 13
//Digite um numero: 20
//NUMEROS PARES:
//8 2 14 20
//QUANTIDADE DE PARES = 4 