package condicionais;
import java.util.*;

public class tern?rria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double preco = 14.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		
		System.out.printf("o desconto ? de %.2f%n", desconto);
		
		

	}

}
