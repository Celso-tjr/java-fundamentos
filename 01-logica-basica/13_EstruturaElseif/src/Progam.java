import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {

			c = 24 - a + b;

			System.out.println("O JOGO DUROU " + c + " HORAS");

		} else if (a < b) {

			c = b - a;

			System.out.println("O JOGO DUROU " + c + " HORAS");
			
		} else {
			
			System.out.println("O JOGO DUROU 24 HORAS");

		}
		
		
		
		sc.close();
	}

}
