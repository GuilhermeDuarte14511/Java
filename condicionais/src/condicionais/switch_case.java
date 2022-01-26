package condicionais;
import java.util.*;

public class switch_case {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "terça";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Dia " + dia);
		 
	}

}
