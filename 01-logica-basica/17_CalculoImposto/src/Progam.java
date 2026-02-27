import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double renda, imposto = 0, impostoret;
		
		renda = sc.nextDouble();
		
		if (renda > 0 && renda < 2000) {
			
		System.out.println("ISENTO");	
			
		}else if (renda > 2000 && renda <= 3000) {
			
			imposto = (renda - 2000) * 0.08;
			
		}else if (renda > 3000 && renda <= 4500) {
			
			imposto = (renda - 3000) * 0.18;
			impostoret = (renda - imposto / 0.18 - 2000) * 0.08;
			imposto = imposto + impostoret;
			
		}else {
			
			imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18+ 1000.0 * 0.08;
			
		}
		
		
			System.out.printf("R$: %.2f", imposto);
		
		
		sc.close();

	}
}
