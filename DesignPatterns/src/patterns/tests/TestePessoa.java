package patterns.tests;

import patterns.classes.Pessoa;
import patterns.classes.PessoaBuilder;

public class TestePessoa {
	public static void main(String[] args) {
		// Criando Pessoa sem Builder
		Pessoa p1 = new Pessoa("William", "Queiroz", "Suane", "DevTop"); 
		printPessoa(p1);	
		
		// Criando Pessoa com Builder
		Pessoa p2 = new PessoaBuilder().nome("William").nomeDoMeio("Suane").ultimoNome("Queiroz").apelido("DevTop").criarPessoa();
		printPessoa(p2);
	}
	
	static void printPessoa(Pessoa p){
		System.out.println("Pessoa:");
		System.out.println("******************************");
		System.out.println("nome: "       + p.getNome());
		System.out.println("nomeDoMeio: " + p.getNomeDoMeio());
		System.out.println("ultimoNome: " + p.getUltimoNome());
		System.out.println("apelido: "    + p.getApelido());
		System.out.println();
	}	
}
