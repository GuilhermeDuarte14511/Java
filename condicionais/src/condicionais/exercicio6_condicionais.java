package condicionais;
import java.util.*;


public class exercicio6_condicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		System.out.println("Insira o valor: ");
		valor = sc.nextDouble();
		
		if(valor > 100 || valor < 0) {
			
			System.out.println("Fora do Intervalo");
		}
		else if(valor <= 20.0) {
			System.out.println("Intervalo de [0,25]");
		}
		else if(valor <= 75) {
			System.out.println("Intervalo de [50,75]");
		}
		else if(valor <=100) {
			System.out.println("Intervalo de [50,100]");
		}
		
		sc.close();
	}

}
