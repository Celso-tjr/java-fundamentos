package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int n2 = 1;
		int maisVelho = 0;

		System.out.print("Quantas pessoas voce vai digitar?");
		n = sc.nextInt();

		String vetorNome[] = new String[n];
		int vetorIdade[] = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados da %d pessoa: \n", i + 1);
			System.out.print("Nome: ");
			vetorNome[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {

			if (vetorIdade[i] > vetorIdade[n2]) {
				maisVelho = i;
			} else {
				maisVelho = n2;
			}
			n2++;
			i++;
		}

		System.out.println("PESSOA MAIS VELHA: " + vetorNome[maisVelho]);

		sc.close();
	}

}

//Exemplo:
//Quantas pessoas voce vai digitar? 5
//Dados da 1a pessoa:
//Nome: Joao
//Idade: 16
//Dados da 2a pessoa:
//Nome: Maria
//Idade: 21
//Dados da 3a pessoa:
//Nome: Teresa
//Idade: 15
//Dados da 4a pessoa:
//Nome: Carlos
//Idade: 23
//Dados da 5a pessoa:
//Nome: Paulo
//Idade: 17
//PESSOA MAIS VELHA: Carlos 