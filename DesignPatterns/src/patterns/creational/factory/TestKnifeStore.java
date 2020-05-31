package patterns.creational.factory;

public class TestKnifeStore {
	public static void main(String[] args) {
		KnifeStore kstore = new KnifeStore();
				
		printKnife(kstore.orderKnife("steak"));
		printKnife(kstore.orderKnife("chefs"));
		printKnife(kstore.orderKnife("general"));		
	}
	
	public static void printKnife(Knife knife) {
		System.out.println("Knife Type: " + knife.getKnifeType());
		System.out.println("Is sharpenned? " + (knife.isSharpenned()? "YES":"NO"));
		System.out.println("Is polished? " + (knife.isPolished()? "YES":"NO"));
		System.out.println("Is packaged? " + (knife.isPackaged()? "YES":"NO"));
		System.out.println();
	}
}
