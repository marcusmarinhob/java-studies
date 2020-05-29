package patterns.singleton;

public class TesteAviao {
	public static void main(String[] args) {
		String [] assentos = new String[]{"1A", "1B", "1C", "2A", "2B", "2C"};
		Aviao aviao1 = new Aviao(assentos);
					
		reservar(aviao1, "1A2");
		reservar(aviao1, "1A");
		cancelar(aviao1, "1A");
		cancelar(aviao1, "1A");
		reservar(aviao1, "1A");	} 
	
	public static void printAssentos(Aviao aviao) {
		System.out.println("Assentos Disponníveis: ");
		for( String assento : aviao.consultaAssentos()) {
			System.out.println("  * " + assento);
		}
	}
	
	public static void reservar(Aviao aviao, String assento) {
		if( aviao.reservarAssento(assento)) {
			System.out.println("Assento '" + assento + "' reservado com sucesso!");
		}
		else {
			System.out.println("Assento '" + assento + "' indisponível!");
			printAssentos(aviao);
		}			
	}	
	
	public static void cancelar(Aviao aviao, String assento) {
		if( aviao.liberarAssento(assento)) {
			System.out.println("Assento '" + assento + "' liberado com sucesso!");
		}
		else {
			System.out.println("O assento '" + assento + "' já está livre!");
		}			
	}
}
