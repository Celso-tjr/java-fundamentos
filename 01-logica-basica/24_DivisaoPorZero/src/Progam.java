import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		float n1 = 0, n2 = 0;

		for (int i = 0; i < N; i++) {
			float result;

			n1 = sc.nextFloat();
			n2 = sc.nextFloat();

			result = n1 / n2;

			if (n2 == 0) {
				System.out.println("Divisao impossivel");

			} else {

				System.out.println(result);
			}
		}

		sc.close();
	}

}
