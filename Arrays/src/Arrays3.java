
public class Arrays3 {
	public static void main(String[] args) {
		int[] numbers1 = new int[5];
		int[] numbers2 = {1, 2, 3, 4, 5};
		int[] numbers3 = new int[]{1, 2, 3, 4, 5};
		
		String[] names = new String[] {"Jonh", "Paul", "George", "Ringo"};
		
		for(int num : numbers2) {
			System.out.println(num);
		}		
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
