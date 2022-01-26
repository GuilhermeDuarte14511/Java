package condicionais;
import java.util.*;

public class exercicio4_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, duracao;
		
		System.out.println("Digite a quantidade de horas jogadas");
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A < B) {
			duracao = B - A;
		}else {
			duracao = 24 - A + B;
		}
		
		System.out.println("O Jogo Durou" + duracao + "Horas(s)");
	}

}
