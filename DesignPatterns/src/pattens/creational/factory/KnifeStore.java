package pattens.creational.factory;

public class KnifeStore {
	
	public Knife orderKnife(String knifeType) {
		Knife knife;
		
		// create Knife object - concrete instantiation
		if (knifeType.equals("steak")) {
			knife = new SteakKnife();

		} else if (knifeType.equals("chefs")) {
			knife = new ChefsKnife();
		
		} else {
			knife = new Knife();
		}		
		
		knife.sharpenKnife();
		knife.polishKnife();
		knife.packageKnife();
		
		return knife;
	}
}
