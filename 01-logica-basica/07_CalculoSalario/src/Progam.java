import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner (System.in);
		
		float horas, valor, salario;
		int numero;
		
		numero = sc.nextInt();
		horas = sc.nextFloat();
		valor = sc.nextFloat();
		
		salario = valor * horas;
		
		System.out.printf("NUMBER = %d\n",numero);
		System.out.printf("SALARY = U$ %.2f ",salario);
		
		sc.close();
		
	}
	
}



//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
//Exemplos:
//Entrada: Saída:
//25
//100
//5.50
//NUMBER = 25
//SALARY = U$ 550.00
//Entrada: Saída:
//1
//200
//20.50
//NUMBER = 1
//SALARY = U$ 4100.00
//Entrada: Saída:
//6
//145
//15.55
//NUMBER = 6
//SALARY = U$ 2254.75