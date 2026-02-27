package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		int[] vect = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < N; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}

		}

		sc.close();
	}

}
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
//Exemplo:
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//Digite um numero: -2
//Digite um numero: 9
//Digite um numero: 10
//Digite um numero: -3
//Digite um numero: -7
//NUMEROS NEGATIVOS:
//-2 
