package condicionais;
import java.util.Scanner;

public class exercicio3_condicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, Multiplo;
		
		System.out.println("Digite o Valor e veja se s�o multiplos");
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0){
			System.out.println("S�o Multiplos");
		}else {
			System.out.println("N�o s�o Multiplos");
		}
		
		
		sc.close();
	}

}
