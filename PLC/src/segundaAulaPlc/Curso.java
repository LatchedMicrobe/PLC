package segundaAulaPlc;

public class Curso {
	private String codigo, nome;
	
	public Curso(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getCod() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCod(String codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
