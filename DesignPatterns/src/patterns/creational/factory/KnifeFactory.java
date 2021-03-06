package patterns.creational.factory;

public class KnifeFactory {
	
	public Knife createKnife(String knifeType) {
		Knife knife = null;
		
		// create Knife object
		if (knifeType.equals("steak")) {
			knife = new SteakKnife();

		} else if (knifeType.equals("chefs")) {
			knife = new ChefsKnife();
		
		} else {
			knife = new Knife();
		}	
		
		return knife;
	}
}
