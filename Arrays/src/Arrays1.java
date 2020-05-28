public class Arrays1 {
	public static void main(String[] args) {
		int [] ages = new int[3];
	
		ages[0] = 20;
		ages[1] = 15;
		ages[2] = 45;
		
		for( int index = 0; index < ages.length; index++) {
			System.out.printf("ages[%d] = %d\n", index, ages[index]);
		}
	}
}