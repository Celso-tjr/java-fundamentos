package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Employee x;
		x = new Employee();

		System.out.print("Name:");
		x.name = sc.nextLine();
		System.out.print("Gross Salary:");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		x.tax = sc.nextDouble();

		double salario = x.netSalary();

		System.out.printf("Employee: %s, $%.2f\n", x.name, salario);
		System.out.printf("Which percentage to increase salary?\n");
		double p = x.increaseSalary(sc.nextDouble());
		System.out.printf("Updated data: %s, $ %.2f", x.name, p);

		sc.close();
	}

}
