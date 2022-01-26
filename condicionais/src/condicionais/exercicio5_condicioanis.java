package condicionais;
import java.util.*;

public class exercicio5_condicioanis {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
		}else if(codigo == 2) {
			total = quantidade * 4.50;
		}else if(codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.00;
		}else{
			total = quantidade * 1.50;
		}
		
		System.out.printf("Valor Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
