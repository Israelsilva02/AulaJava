package aula1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtra, descontosColaborador;
		float salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extra: ");
		horasExtra = leia.nextFloat();
		
		System.out.println("Qual é o desconto do colaborador: ");
		descontosColaborador = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra*5)- descontosColaborador;
		
		System.out.println("Seu liquido é: "+ salarioLiquido);
		

	}

}
