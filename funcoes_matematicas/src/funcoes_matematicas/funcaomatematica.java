package funcoes_matematicas;
import java.math.*;
public class funcaomatematica {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; //receber os resultados
		
		
		A = Math.sqrt(x); //A recebe raiz quadrada
		B = Math.sqrt(y); //B raiz quadrada de 4
		C = Math.sqrt(25.0); //raiz quadradad de 25
		System.out.println("Raiz Quadrada de a " + x + " =  " + A);
		System.out.println("Raiz Quadrada de " + y + " = " + B);		
		System.out.println("Raiz Quadrada de 25 = "  + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println(" 5 elevado ao quadrado =  " + C);
		
		A = Math.abs(y); //tirar Sinal Negativo caso exista.
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
