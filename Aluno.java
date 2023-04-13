package entities;
//classe aluno, para fazer as operações 
public class Aluno {

	public String nome;//atributos de alunos
	public String cpf;
	public Aluno() {
	}
	public Aluno(String nome, String cpf) {
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
