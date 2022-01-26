package memorias_arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Product_vetor;

public class vetores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product_vetor [] vect = new Product_vetor[n];
		
		for(int i=0; i<n; i++) { //vect.length mexer no tamanho do vetor
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_vetor(name, price);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("Media do preco é:  %.2f%n", media);
		
		sc.close();

	}

}
