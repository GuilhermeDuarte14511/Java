package condicionais;
import java.util.Scanner;
public class exercicio2_condicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Voc� Digitou");
		numero = sc.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O Numero � par");
		}else {
			System.out.println("O Numero � Impar");
		}
		
		sc.close();
	}

}
