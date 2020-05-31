package pattens.creational.factory;

public class KnifeStore {
	
	public Knife orderKnife(String knifeType) {
		Knife knife = new KnifeFactory()
				.createKnife(knifeType);		
		
		knife.sharpenKnife();
		knife.polishKnife();
		knife.packageKnife();
		
		return knife;
	}
}
