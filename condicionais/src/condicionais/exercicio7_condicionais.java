package condicionais;
import java.util.*;

public class exercicio7_condicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double renda;
		double imposto;
		System.out.println("Insira Sua Renda: ");
		
		renda = sc.nextDouble();
		
		if(renda <= 2000.00) {
			imposto = 0.0;
		}
		else if(renda <= 3000.00) {
			imposto = (renda - 2000.0) * 00.8;
		}
		else if(renda <= 4500.00) {
			imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.8;
		}
		else {
			imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}if (imposto == 0.0) {
			System.out.println("Você Está isento");
		}
		else {
			System.out.printf("Saida de: R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
