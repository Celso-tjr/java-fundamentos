package entities;

public class Student {

	public String name;
	public double nota, nota2, nota3;

	public double calcSoma() {
		double soma = nota + nota2 + nota3;
		return soma;

	}

}
