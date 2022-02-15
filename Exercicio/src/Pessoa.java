import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
	
	public static void main(String[] args) {
		
	ArrayList <DadosPessoais> pessoa = new ArrayList();   
	
	DadosPessoais pessoa1 = new DadosPessoais("Dominique", 28, 1.63 );
	
	DadosPessoais pessoa2 = new DadosPessoais("Leticia", 24, 1.53 );
	
	DadosPessoais pessoa3 = new DadosPessoais("Gualdina", 25, 1.70 );
	
	DadosPessoais pessoa4 = new DadosPessoais("Nikolay", 29, 1.85 );
	
	DadosPessoais pessoa5 = new DadosPessoais("Edvaldo", 28, 1.82 );
	
	pessoa.add(pessoa1);
	pessoa.add(pessoa2);
	pessoa.add(pessoa3);
	pessoa.add(pessoa4);
	pessoa.add(pessoa5);
	

	for (DadosPessoais p : pessoa) {
		System.out.print(p);
	}
	
	
	
	}
	}
		
		
		
		
	
	
	
	
	


