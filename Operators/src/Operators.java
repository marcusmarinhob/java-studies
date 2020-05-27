
public class Operators {
	public static void main(String[] args){
		
		int num1 = 50, num2 = 11; 
		int sum, sub, mult, rem;
		float div;
											
		/** Arithmetic Operations **/
		sum = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;
				
		/** Print Operations **/
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println();
		
		System.out.println("Arithmetic Operations ##################");						
		System.out.println("sum = " + sum);
		System.out.println("sub = " + sub);
		System.out.println("mult = " + mult);
		System.out.println("div = " + div);
		System.out.println("rem = " + rem);		
		System.out.println();
		
		System.out.println("Comparison Operations ##################");
		System.out.println("(num1 >  num2) ? " + (num1 >  num2));
		System.out.println("(num1 >= num2) ? " + (num1 >= num2));
		System.out.println("(num1 <  num2) ? " + (num1 <  num2));
		System.out.println("(num1 <= num2) ? " + (num1 <= num2));
		System.out.println("(num1 == num2) ? " + (num1 == num2));
		System.out.println("(num1 != num2) ? " + (num1 != num2));
	}
}
