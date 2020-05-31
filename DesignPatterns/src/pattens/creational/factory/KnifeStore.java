package pattens.creational.factory;

public class KnifeStore {
	
	public Knife orderKnife(String knifeType) {
		Knife knife;
		
		// create Knife object - concrete instantiation
		if (knifeType.equals("steak")) {
			knife = new SteakKnife();

			knife.polishKnife();
			
		} else if (knifeType.equals("chefs")) {
			knife = new ChefsKnife();
			
			knife.sharpenKnife();
			knife.polishKnife();
		
		} else {
			knife = new Knife("general");
		}		
		
		knife.packageKnife();
		
		return knife;
	}
}
