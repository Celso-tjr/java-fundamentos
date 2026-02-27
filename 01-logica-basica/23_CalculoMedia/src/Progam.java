import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		float n1, n2, n3, media = 0;

		for (int i = 0; i < N; i++) {

			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			n3 = sc.nextFloat();

			media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

			System.out.printf("%.1f\n", media);

		}

		sc.close();

	}

}

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.
//Exemplo:
//Entrada: Saída:
//3
//6.5 4.3 6.2
//5.1 4.2 8.1
//8.0 9.0 10.0
//5.7
//6.3
//9.3