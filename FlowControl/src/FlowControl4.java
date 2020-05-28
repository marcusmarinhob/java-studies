
public class FlowControl4 {
	public static void main(String[] args) {
		int count = 0;
		
		System.out.println("Begin of while!");
		while(count < 10) {
			System.out.println("Count = " + count++);			
		}
		System.out.println("End of while!");
		System.out.println();
		
		
		System.out.println("Begin of do-while!");
		do{
			System.out.println("Count = " + count--);			
		} while(count > 0);
		System.out.println("End of do-while!");
	}
}
