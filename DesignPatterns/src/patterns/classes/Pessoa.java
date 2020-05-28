package patterns.classes;

public class Pessoa {
	private String nome;
	private String ultimoNome;
	private String nomeDoMeio;
	private String apelido;	
	
	public Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido) {
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.nomeDoMeio = nomeDoMeio;
		this.apelido = apelido;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public String getNomeDoMeio() {
		return nomeDoMeio;
	}
	
	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
