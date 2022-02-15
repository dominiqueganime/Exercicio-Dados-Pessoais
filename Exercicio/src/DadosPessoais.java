
public class DadosPessoais {
	
	String nome;
	int idade;
	double altura;
	
//Contrutor:
	
public DadosPessoais() {
	
}	

public DadosPessoais (String nome, int idade, double altura) {
	this.nome = nome;
	this.idade = idade;
	this.altura = altura;
}
	
// Getters and Setters:
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return nome + " " + idade + " " + altura;
	}
}
