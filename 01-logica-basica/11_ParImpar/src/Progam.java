import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		if (a % 2 == 0) {

			System.out.println("PAR");

		} else {

			System.out.println("IMPAR");

		}

		sc.close();

	}

}

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//Exemplos:
//Entrada: Saída:
//12 PAR
//Entrada: Saída:
//-27 IMPAR
//Entrada: Saída:
//0 PAR