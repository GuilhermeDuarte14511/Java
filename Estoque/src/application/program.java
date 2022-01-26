package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {
	
	
	//Toda classe em java é uma subclasse em Object, tipo triangulo, tipo product
	//Object possui GetClass, equals, hashcode, toString
	
	

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
	
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println();
		System.out.println("Entre com o numero para ser adicionado ao estoque");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + product);
		
		System.out.println();
		System.out.println("Entre com o numero para remover do estoque");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		
		System.out.println();
		System.out.println("Dados Atualizados: " + product);
		
		
		sc.close();

	}

}
