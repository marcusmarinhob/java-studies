
public class FlowControl2 {
	public static void main(String[] args) {
		int age = 20;
		String status;
		
		status = (age >= 18) ? "Can be arrested!" : "Can not be arrested!";
		
		System.out.println("AGE: " + age);
		System.out.println("STATUS: " + status);
	}
}
