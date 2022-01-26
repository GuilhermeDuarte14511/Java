package memorias_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_exercicios {

	public static void main(String[] args) {

		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Maria");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		System.out.println("Index of Bob" + list.indexOf("Bob"));
		
		System.out.println("--------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Stream aceita operacoes lambda
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	}

}
