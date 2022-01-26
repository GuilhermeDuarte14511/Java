package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Account;

public class exercicios_construtores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
	
		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.println("Entre com o titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Existe Deposito Inicial S/N?: ");
		char response = sc.next().charAt(0);
		
		if(response =='S') {
			System.out.println("Entre com o valor inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insira o valor do Depósito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados Atualizados da conta: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Insira o valor do saque: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Dados Atualizados da conta: ");
		System.out.println(account);
		
		System.out.println("Gostaria de Continuar usando Nossos Serviços S/N?: ");
		char opcao = sc.next().charAt(0);
		
		if(opcao =='S') {
			System.out.println("Entre com o valor inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
			System.out.println("------------------------Muito Obrigado Por Usar nossos Serviços :) -------------------");
		}
		
		
		sc.close();

	}
	
	
	
}

