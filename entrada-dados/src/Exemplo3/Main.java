package Exemplo3;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		
		
		//System.out.println("O Valor Digitado � %f" + x ); //Println pega localidade independente
		System.out.printf("O Valor Digitado �: %.2f%n", + x );
		sc.close(); //Comando Para fechar a inser��o de dados
	}

}
