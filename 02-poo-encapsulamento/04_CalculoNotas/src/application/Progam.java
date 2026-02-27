package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student x;
		x = new Student();

		x.name = sc.next();
		x.nota = sc.nextDouble();
		x.nota2 = sc.nextDouble();
		x.nota3 = sc.nextDouble();

		double soma = x.calcSoma();

		if (soma >= 60) {
			System.out.printf("FINAL GRADE = %.2f\nPASS", soma);

		} else {

			System.out.printf("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", soma, 60 - soma);
		}

		sc.close();
	}

}
