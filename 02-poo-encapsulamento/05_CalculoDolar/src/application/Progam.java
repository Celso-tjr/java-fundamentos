package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price?");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double may = sc.nextDouble();
		double result = CurrencyConverter.calculator(dolar, may);
		System.out.printf("Amount to be paid in reais = %.2f", result);

		sc.close();
	}
}
