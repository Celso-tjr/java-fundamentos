import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int cod, qntd;
		float total;

		cod = sc.nextInt();
		qntd = sc.nextInt();

		switch (cod) {
		case 1:
			total = 4 * qntd;
			break;
		case 2:
			total = (float) 4.5 * qntd;
			break;
		case 3:
			total = 5 * qntd;
			break;
		case 4:
			total = 2 * qntd;
			break;
		default:
			total = (float) 1.5 * qntd;

		}
//
//		if (cod == 1) {
//
//			total = 4 * qntd;
//
//		} else if (cod == 2) {
//
//			total = (float) 4.5 * qntd;
//
//		} else if (cod == 3) {
//
//			total = 5 * qntd;
//
//		} else if (cod == 4) {
//
//			total = 2 * qntd;
//
//		} else {
//
//			total = (float) 1.5 * qntd;
//
//		}

		System.out.printf("Total: R$ %.2f", total);

		sc.close();

	}
}
