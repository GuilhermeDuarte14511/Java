package pedido;
import java.util.Scanner;

public class Pedido {
    
	public static void main(String[] args) {
		System.out.println("Apartir desse momento voc� vai ter a melhor escolha da sua vida, ou n�o kk");
		System.out.println("Deseja Continuar?[S/N]");
		Scanner sc = new Scanner(System.in);		
		char response = sc.next().charAt(0);
 
		if(response =='S') {
			System.out.println("Se Prepare para text�o: ");
			System.out.println("Bom Carol, voc� sabe que � incrivel em 2 meses podemos se dizer de conversa, eu ja sei o qu�o voc� � especial na minha vida \n"
					+ "eu sei que as vezes dou alguns vacilos bem bostas, que provavelmente voc� faz perder o interesse em mim, \n"
					+ "mas juro que n�o � por mal \n"
					+ "� s� o medo de te perder que me faz ter essas inseguran�as, \n "
					+ "nunca senti algo t�o intenso como eu sinto por voc�, a vontade de querer te ver \n"
					+ "a vontade de ouvir sua voz todo dia, de conversar com voc� \n"
					+ "ja se tornou algo nescess�rio no meu dia, pe�o perd�o pelo meus ciumes bestas, com o Adriano, juro que"
					+ "no final, eu s� quero ser amigo dele tambem kk: \n"
					+ "espero que isso n�o quebre o clima, mas continuando, voc� � a garota mais \n"
					+ "espetacular que conheci na minha vida \n"
					+ "e com certeza � voc� que eu quero acordar ao lado, � voc� que me faz querer ter tudo ao lado \n"
					+ "casa, filhos, sonhos todos conquistados lado a lado, sei que sou um porre \n"
					+ "meio meloso as vezes, mas � meu jeito infelizmente, eu te amo demais mesmo, mesmo \n "
					+ "surtando sem motivos alguns, amo sua voz, seu sorriso, amo voc� por inteiro \n"
					+ "mal vejo a hora de podermos estarmos juntos abra�ados, indo para casa um do outro \n "
					+ "saindo juntos com nossas super alian�as e eu com minhas cringisse, voc� � espetacular \n"
					+ "s�rio, e eu quero voc� como a mulher da minha vida");
		}else {
			System.out.println("Certeza?");
		}
		System.out.println();
		System.out.println("Ta Preparada?");
		char response1 = sc.next().charAt(0);
		if(response1 == 'S'){
			System.out.println("CERTEZA?");
		}if(response1 == 'S') {
			System.out.println("CAROLINE RODRIGUES DUARTE COF COF, VOC� ACEITA SER MINHA NAMORADA?? [S/N]");
			char response2 = sc.next().charAt(0);	
			if(response2 =='S') {
				System.out.println("OOOOOOOOOO VITORIA CHEGOOOOOOOOOU E DEUS ABEN�OOU \n"
						+ "OBRIGADO PELA OPORTUNIDADE DE ESTAR JUNTO NA SUA VIDA, POR COMPARTILHAR COMIGO ELA \n"
						+ "ESSA � A NOSSA MUSICA : https://www.youtube.com/watch?v=Xr6-XzeIrjg&ab_channel=ValescaPopozuda-Topic "
						+ "NOSSA MUSICA: https://www.youtube.com/watch?v=KIK3azN4w34&ab_channel=JustinBieberVEVO");
			}else {
				System.out.println("TO DEPRESSOR");
			}
		}
		System.out.println();
		System.out.println("Aproveitando a Ocasi�o, porqu� n�o pedir voc� em casamento tambem n�? ");
		System.out.println("Bom, eu espero que voc� tenha notado o qu�o voc� � importante para mim e com certeza \n"
				+ "e com voc� que quero passar o resto da minha vida, obvio. \n"
				+ "� em voc� que eu penso quando eu acordo, quando estou fazendo minhas coisas \n"
				+ "� em voc� junto comigo que penso em n�s viajando, conquistanto tudo que queremos \n"
				+ "nossa casa, nosso pato, nossos filhos maravilhosos \n"
				+ "e nada mais do que justo, pedir voc� em casamento para selarmos esse acordo entre nossas almas at� a eternidade"
				+ "eai kk quer casar comigo? prometo te fazer feliz em todos os momentos \n"
				+"fazer voc� rir, fazer vc se sentir bem \n"
				+ "estar te apoiando em todas as suas decis�es da vida \n"
				+ "participar de cada momento possivel junto com voc� \n"
				+ "Aceita? S/N");
		char response2 = sc.next().charAt(0);
		if(response2 =='S') {
			System.out.println("MEUDEUS, MUITO OBRIGADO, POR ME DAR ESSA GRANDE CHANCE SOCORRO, ME FODE, ME COME AAAAAA TE AMO DEMAIS");
			try {
				Thread.sleep(900000);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		}else {
			System.out.println("To Triste");
		}
		sc.close();
  	}	
	
}