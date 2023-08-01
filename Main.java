package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTerminal;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Seja bem-vindo ao nosso Banco! ");
		System.out.println("Preencha os dados abaixo ");
		System.out.println("Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Por favor, digite número da sua conta bancária");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite número da sua agência bancária");
		String agencia = sc.nextLine();
		System.out.println("Por favor, digite o valor do seu saldo");
		Double saldo = sc.nextDouble();

		ContaTerminal contaClient = new ContaTerminal (nome, conta, agencia, saldo);
		
		System.out.println(contaClient.toString());
		
		sc.close();
	}

}
