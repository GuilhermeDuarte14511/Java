package estrutura_repetitiva;
import java.util.Locale;
import java.util.Scanner;

public class enquanto_while {

	public static void main(String[] args) {  //Quando não se sabe a quantidade de vezes que será usado
		Locale.setDefault(Locale.US);		//SE A CONDIÇÃO FOR VERDADEIRA
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma =0;
		
		while (x != 0) {
			soma = soma + x; // = soma pode ser usado +=
			System.out.println("Digite Novamente:");
			x = sc.nextInt();
		}
		
		System.out.println("O Valor Total Digitado Por Você é: " + soma);
		
		sc.close();

	}

}
