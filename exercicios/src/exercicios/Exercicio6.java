package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		circulo =  3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("A Area do Triangulo é = %.3f%n", triangulo);
		System.out.printf("A Area do circulo é = %.3f%n", circulo);
		System.out.printf("A Area do Trapezio é = %.3f%n", trapezio);
		System.out.printf("A Area do Quadrado é = %.3f%n", quadrado);
		System.out.printf("A area do retangulo é = %.3f%n", retangulo);
		
		sc.close();
	}

}
