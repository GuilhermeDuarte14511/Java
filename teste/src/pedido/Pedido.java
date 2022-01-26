package pedido;
import java.util.Scanner;

public class Pedido {
    
	public static void main(String[] args) {
		System.out.println("Apartir desse momento você vai ter a melhor escolha da sua vida, ou não kk");
		System.out.println("Deseja Continuar?[S/N]");
		Scanner sc = new Scanner(System.in);		
		char response = sc.next().charAt(0);
 
		if(response =='S') {
			System.out.println("Se Prepare para textão: ");
			System.out.println("Bom Carol, você sabe que é incrivel em 2 meses podemos se dizer de conversa, eu ja sei o quão você é especial na minha vida \n"
					+ "eu sei que as vezes dou alguns vacilos bem bostas, que provavelmente você faz perder o interesse em mim, \n"
					+ "mas juro que não é por mal \n"
					+ "é só o medo de te perder que me faz ter essas inseguranças, \n "
					+ "nunca senti algo tão intenso como eu sinto por você, a vontade de querer te ver \n"
					+ "a vontade de ouvir sua voz todo dia, de conversar com você \n"
					+ "ja se tornou algo nescessário no meu dia, peço perdão pelo meus ciumes bestas, com o Adriano, juro que"
					+ "no final, eu só quero ser amigo dele tambem kk: \n"
					+ "espero que isso não quebre o clima, mas continuando, você é a garota mais \n"
					+ "espetacular que conheci na minha vida \n"
					+ "e com certeza é você que eu quero acordar ao lado, é você que me faz querer ter tudo ao lado \n"
					+ "casa, filhos, sonhos todos conquistados lado a lado, sei que sou um porre \n"
					+ "meio meloso as vezes, mas é meu jeito infelizmente, eu te amo demais mesmo, mesmo \n "
					+ "surtando sem motivos alguns, amo sua voz, seu sorriso, amo você por inteiro \n"
					+ "mal vejo a hora de podermos estarmos juntos abraçados, indo para casa um do outro \n "
					+ "saindo juntos com nossas super alianças e eu com minhas cringisse, você é espetacular \n"
					+ "sério, e eu quero você como a mulher da minha vida");
		}else {
			System.out.println("Certeza?");
		}
		System.out.println();
		System.out.println("Ta Preparada?");
		char response1 = sc.next().charAt(0);
		if(response1 == 'S'){
			System.out.println("CERTEZA?");
		}if(response1 == 'S') {
			System.out.println("CAROLINE RODRIGUES DUARTE COF COF, VOCÊ ACEITA SER MINHA NAMORADA?? [S/N]");
			char response2 = sc.next().charAt(0);	
			if(response2 =='S') {
				System.out.println("OOOOOOOOOO VITORIA CHEGOOOOOOOOOU E DEUS ABENÇOOU \n"
						+ "OBRIGADO PELA OPORTUNIDADE DE ESTAR JUNTO NA SUA VIDA, POR COMPARTILHAR COMIGO ELA \n"
						+ "ESSA É A NOSSA MUSICA : https://www.youtube.com/watch?v=Xr6-XzeIrjg&ab_channel=ValescaPopozuda-Topic "
						+ "NOSSA MUSICA: https://www.youtube.com/watch?v=KIK3azN4w34&ab_channel=JustinBieberVEVO");
			}else {
				System.out.println("TO DEPRESSOR");
			}
		}
		System.out.println();
		System.out.println("Aproveitando a Ocasião, porquê não pedir você em casamento tambem né? ");
		System.out.println("Bom, eu espero que você tenha notado o quão você é importante para mim e com certeza \n"
				+ "e com você que quero passar o resto da minha vida, obvio. \n"
				+ "é em você que eu penso quando eu acordo, quando estou fazendo minhas coisas \n"
				+ "é em você junto comigo que penso em nós viajando, conquistanto tudo que queremos \n"
				+ "nossa casa, nosso pato, nossos filhos maravilhosos \n"
				+ "e nada mais do que justo, pedir você em casamento para selarmos esse acordo entre nossas almas até a eternidade"
				+ "eai kk quer casar comigo? prometo te fazer feliz em todos os momentos \n"
				+"fazer você rir, fazer vc se sentir bem \n"
				+ "estar te apoiando em todas as suas decisões da vida \n"
				+ "participar de cada momento possivel junto com você \n"
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