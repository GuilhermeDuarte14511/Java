package estrutura_repetitiva;
import java.util.*;
import java.util.Locale;
import java.util.Scanner;

public class tentativas {

	public static void main(String[] args) {
		
		System.out.println("Digite a Senha para entrar no programa");
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int tentativas =3;
		
		while(senha != 2015) {
			System.out.println("Digite a Senha Novamente");
			senha = sc.nextInt();
			tentativas --;
			System.out.printf("Numero de tentativas é : %d \n ", tentativas);
				if(tentativas == 0) {
					System.out.println("O Sistema Foi Bloqueado");break;
				}
		}
		sc.close();
	}

}