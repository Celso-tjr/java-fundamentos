package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int number;
		String holder;
		double balance = 0, deposito = 0, saque = 0;
		char initial;

		System.out.println("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter account holder: ");
		holder = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)?");
		initial = sc.next().charAt(0);
		

		if (initial == 'y') {

			System.out.println("Enter initial deposit value:");
			balance = sc.nextDouble();

		}

		Account account = new Account(number, holder, balance);
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println("Enter a deposit value: ");
		deposito = sc.nextDouble();
		account.Deposito(deposito);

		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println("Enter a withdraw value:");
		saque = sc.nextDouble();
		account.Saque(saque);

		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
