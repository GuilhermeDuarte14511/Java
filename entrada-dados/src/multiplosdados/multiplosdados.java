package multiplosdados;
import java.util.Locale;
import java.util.Scanner;

public class multiplosdados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();//Ler Somente Strings
		y = sc.nextInt(); //Ler Somente Int
		z = sc.nextDouble(); //Somente Double 
		
		System.out.println("Dados digitados" );
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("Obrigado pelas informações");
		sc.close();
	}

}
