package empresa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os nomes e sexos das pessoas Ex[Fernando,M]: ");
		String lista = teclado.next();
		String[] listaNomes = lista.split(",");
		
		ArrayList<String> homens = new ArrayList<>();
		ArrayList<String> mulheres = new ArrayList<>();
		
		System.out.println("=================================");
		
		for(int i = 0; i < listaNomes.length; i += 2) {
			String nome = listaNomes[i];
			String sexo = listaNomes[i + 1];
			
			if(sexo.equalsIgnoreCase("m")) {
				homens.add(nome);
			} else if (sexo.equalsIgnoreCase("F")) {
				mulheres.add(nome);
			} else {
				System.out.println("Sexo inválido");
			}
			
		}
		
		System.out.println("Mulheres: " + mulheres);
		System.out.println("Homens: " + homens);
		
		System.out.println("=================================");
		
		ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Carlos");
        nomes.add("Fernando");
        nomes.add("Ariadny");
        nomes.add("Aureo");
        nomes.add("Cadu");
        nomes.add("Daniel");
        System.out.println("Lista não ordenada: "+ nomes);
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);
        
        System.out.println("=================================");
		
	}

}
