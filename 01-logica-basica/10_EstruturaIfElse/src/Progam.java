import java.util.Scanner;

public class Progam {

	void main() {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();		
		
		if(a>=0) {
			
			System.out.println("NAO NEGATIVO ");
			
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
		
	}

}

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//Exemplos:
//Entrada: Saída:
//-10 NEGATIVO
//Entrada: Saída:
//8 NAO NEGATIVO
//Entrada: Saída:
//0 NAO NEGATIVO