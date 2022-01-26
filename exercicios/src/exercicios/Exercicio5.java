package exercicios;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, qtd1, qtd2;
		double preco1, preco2, total;
		
		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		
		total = preco1 * qtd1 + preco2 * qtd2;
		System.out.printf("Valor a Pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
