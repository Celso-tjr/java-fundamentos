import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int a = 0, d = 0, g = 0;

		while (x != 4) {
			switch (x) {
			case 1:
				a += 1;
				break;
			case 2:
				g += 1;
				break;
			case 3:
				d += 1;
				break;
			}
			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", a, g, d);

		sc.close();
	}

}
