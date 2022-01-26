package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha um ótimo passeio");
		Comment c2 = new Comment("Caraca, Demais");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para nova zelandia",
				"Vou Viajar para esse pais maravilhoso", 12);
		
		p1.addComment(c1); //nao Tem metodo toString
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
