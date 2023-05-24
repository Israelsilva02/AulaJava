package aula1;

import java.util.Scanner;


public class Exercicio1Java {

	public static void main(String[] args) {
		float salario;
		float abono;
		float soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do seu abono: ");
		abono = leia.nextFloat();
		
		soma = salario + abono;
		
		System.out.println("O valor do seu Novo Salario é " + soma);
		
		
	}

}
