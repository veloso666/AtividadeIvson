package entities;
//classe professor, para fazer as operações
public class Professor {

	public String nome;//atributos de professor
	public String cpf;
	public Professor() {
	}
	public Professor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
