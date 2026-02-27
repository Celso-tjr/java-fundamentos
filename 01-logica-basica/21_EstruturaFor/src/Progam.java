import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		if (1 <= X && X <= 1000) {

			for (int i = 1; i < X; i++) {

				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		}

		sc.close();

	}

}

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.
//Exemplo:
//Entrada: Saída:
//8 1
//3
//5
//7