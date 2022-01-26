package construtores;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);

		product.setName("Computador");
		System.out.println("Nome Atualizado: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Preco Atualizado " + product.getPrice());

		System.out.println();
		System.out.println("Nome do Produto " + product);
		System.out.println();
		System.out.print("Produtos Adicionados : ");

		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Atualizacao	 " + product);
		System.out.println();
		System.out.print("Numero de Produtos a ser removidos ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Atualizacao: " + product);
		sc.close();
	}
}