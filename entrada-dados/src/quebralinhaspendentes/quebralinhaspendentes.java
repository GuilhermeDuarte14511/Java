package quebralinhaspendentes;
import java.util.Scanner;


public class quebralinhaspendentes {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();//imprimi um string vazio, enter da um quebra de linha
		s1 = sc.nextLine(); //NextLine L� a Linha Inteira
		s2 = sc.nextLine();
		s3= sc.nextLine();
		
		
		System.out.println("Dados Digitados"); 
		System.out.println(x); 
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
