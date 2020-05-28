
public class FlowControl {
	public static void main(String[] args) {
		int age = 20;
				
		System.out.println("AGE: " + age);
		System.out.print("VOTE STATUS: ");
		if( age < 16 ){
			System.out.println("Can not vote!");			
		}
		else if( age < 18 || age >= 70  ) {
			System.out.println("Optional vote!");
		}
		else
		{
			System.out.println("Obrigatory vote!");
		}
	}
}
