package patterns.builder;

public class PessoaBuilder{
	private String nome;
	private String ultimoNome;
	private String nomeDoMeio;
	private String apelido;	
	
	public PessoaBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public PessoaBuilder ultimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
		return this;
	}
	
	public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
		return this;
	}
	
	public PessoaBuilder apelido(String apelido) {
		this.apelido = apelido;
		return this;
	}
	
	public Pessoa build() {
		return new Pessoa(nome, ultimoNome, nomeDoMeio, apelido);
	}	
}	
