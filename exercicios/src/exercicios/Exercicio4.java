package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int identidade, horasT;
		double valor, salario;
		
		identidade = sc.nextInt();
		horasT = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = valor * horasT;
	
		System.out.println("codigo de identidade é " + identidade);
		System.out.printf("Salario = U$ %.2f%n  ", salario); //PrintF para colocar numeros.
		
		
		sc.close();

	}

}
