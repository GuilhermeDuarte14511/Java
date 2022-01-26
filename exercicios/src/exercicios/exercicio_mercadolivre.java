package exercicios;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class exercicio_mercadolivre {

	public static void main(String[] args) {
	
			int maximoDigitos = 6;
			int vetor[] = new int[4];
			int soma = 0;
			boolean concluido = false;
			maximoDigitos++;
			
			
			do{
				for(int i = 0; i < 4 ; i++){
					vetor[i] = (int) (Math.random() * maximoDigitos); //v[i] = (int) (Math.random() * n);
					System.out.printf("|%d|", vetor[i]);
					soma = soma + vetor[i];
					if(i == 3){
						System.out.printf(" =  %d\n", soma);
						if(soma == 21){
							concluido = true;
							break;
						}else{
							soma = 0;
						}
					}
				}	
			}while(!concluido);

			System.out.printf("O Valor e: ");
			for(int j = 0; j < 4 ; j++){
				System.out.printf("%d", vetor[j]);
			}
		}
	}