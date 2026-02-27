package application;
import java.util.Scanner;
import entities.Rectangle;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
			
		System.out.println("Enter rectangle width and height:");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();	
		
		System.out.printf("AREA: %.2f\n", x.area());
		System.out.printf("PERIMETRO: %.2f\n", x.perimeter());
		System.out.printf("DIAGONAL: %.2f\n", x.perimeter());
		
		
		sc.close();
	}

}
