package estrutura_repetitiva;
import java.util.*;


public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja Bem Vindo, Digite sua senha para obter acesso ao Sistema");
		int senha = sc.nextInt();
		
		while( senha != 2002) {
			System.out.println("Senha Incorreta, Tente Novamente!!");
			senha = sc.nextInt();
		}
		
		System.out.println("SEJA BEM VINDO AO SISTEMA");
		
		sc.close();
		
		
	}

}
