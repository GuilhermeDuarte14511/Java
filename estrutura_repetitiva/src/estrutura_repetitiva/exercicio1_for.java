package estrutura_repetitiva;
import java.util.*;
import java.util.Scanner;

public class exercicio1_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
				if(i % 2 !=0) {
					System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
