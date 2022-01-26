package estrutura_repetitiva;
import java.util.*;
import java.util.Scanner;


public class for_para {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("A Soma de todos os numeros são: " + soma);
		
		sc.close();
	}

}
