package condicionais;
import java.util.Scanner;

public class exercicio1_condicionais {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o Numero");
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("O Numero é positivo");
		}else {
			System.out.println("O Numero é Negativo");
		}
		
	}

}
