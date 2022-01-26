package membros_estátiticos;

import java.util.Locale;
import java.util.Scanner;

import util.Calculador;

public class estatico {
	
	public static final double PI = 3.14159; //final não muda, constante TUDO MAIUSCULO

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculador calc = new Calculador();
		
		
		System.out.println("Digite o Valor do Raio: ");
		
		double raio = sc.nextDouble();
		
		double c = calc.circumferência(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI valor: %.2f%n", calc.PI);


		sc.close();
				
	}
	
}
