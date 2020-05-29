package patterns.singleton;

import java.util.ArrayList;

public class Aviao {
	private ArrayList<String> assentosDisponiveis;
	
	public Aviao(String... assentos) {
		this.assentosDisponiveis = new ArrayList<String>();			
		
		for(int index=0; index < assentos.length; index++ ) {
			this.assentosDisponiveis.add(assentos[index]);			
		}		
	}
	
	public String[] consultaAssentos() {
		String [] assentos = new String[this.assentosDisponiveis.size()];
		
		for(int index=0; index < this.assentosDisponiveis.size(); index++ ) {
			assentos[index] = this.assentosDisponiveis.get(index);			
		}
		
		return assentos;
	}
	
	public boolean liberarAssento(String assento) {		
		if( assentosDisponiveis.contains(assento)) {			
			return false;
		}
		else {
			assentosDisponiveis.add(assento);
			return true;
		}	
	}
	
	public boolean reservarAssento(String assento) {
		if( assentosDisponiveis.contains(assento)) {
			assentosDisponiveis.remove(assento);
			return true;
		}
		else {
			return false;
		}		
	}
}
