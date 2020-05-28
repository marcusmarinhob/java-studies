
public class Arrays4 {
	public static void main(String[] args) {
		int [][] days = new int[12][31];
		
		for( int month = 0; month < 12; month++) {
			for( int day = 0; day < 31; day++) {
				days[month][day] = day+1;
				System.out.printf("days[%d][%d] = %d\n", month, day, day+1); 
				// TODO: Complete logic to process the correct number of
				//       day per month.
			}
			System.out.println();
		}
	}
}
