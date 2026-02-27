package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double media = 0;
		int n;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		sc.nextLine();
		String nomeAluno[] = new String[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			nomeAluno[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if (media >= 6) {
				System.out.printf("nomes: %s", nomeAluno[i]);
			}
		}

		sc.close();
	}

}

//
//Quantos alunos serao digitados? 4
//Digite nome, primeira e segunda nota do 1o aluno:
//Joao Silva
//7.0
//8.5
//Digite nome, primeira e segunda nota do 2o aluno:
//Maria Teixeira
//9.2
//6.5
//Digite nome, primeira e segunda nota do 3o aluno:
//Carlos Carvalho
//5.0
//6.0
//Digite nome, primeira e segunda nota do 4o aluno:
//Teresa Pires
//5.5
//6.5
//Alunos aprovados:
//Joao Silva
//Maria Teixeira
//Teresa Pires 