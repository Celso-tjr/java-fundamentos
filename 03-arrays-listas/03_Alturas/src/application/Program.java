package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];
        double[] vetorAltura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);

            System.out.print("Nome: ");
            vetorNome[i] = sc.next();

            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();

            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();
        }

        System.out.printf("%nAltura media: %.2f%n", 
                Pessoa.media(vetorAltura));

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", 
                Pessoa.porcentagemMenores(vetorIdade));

        System.out.println("Nomes das pessoas com menos de 16 anos:");
        Pessoa.listarMenores(vetorIdade, vetorNome);

        sc.close();
    }
}
