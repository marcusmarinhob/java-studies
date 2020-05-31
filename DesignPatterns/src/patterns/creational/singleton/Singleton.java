package patterns.creational.singleton;

public class Singleton {
	// The class variable is null if no instance is instantiated
	private static Singleton uniqueInstance = null;
	
	private Singleton() {

	}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
}
