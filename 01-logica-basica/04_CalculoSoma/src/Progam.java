import java.util.Scanner;

public class Progam {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.printf("SOMA = %d ",num1+num2);
		
		
		
		
		sc.close();
	}
	
	
}

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
//Exemplos:
//Entrada: Saída:
//10
//30
//SOMA = 40
//Entrada: Saída:
//-30
//10
//SOMA = -20
//Entrada: Saída:
//0
//0
//SOMA = 0