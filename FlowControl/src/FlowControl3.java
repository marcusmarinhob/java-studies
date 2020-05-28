
public class FlowControl3 {
	public static void main(String[] args) {
		byte diaNum = 10;
		String diaName;
		
		
		switch (diaNum){
			case 0: 
				diaName = "Sunday";
				break;
			case 1: 
				diaName = "Monday";
				break;
			case 2: 
				diaName = "Tuesday";
				break;
			case 3: 
				diaName = "Wednesday";
				break;
			case 4: 
				diaName = "Thrusday";
				break;
			case 5: 
				diaName = "Friday";
				break;
			case 6: 
				diaName = "Saturday";
				break;
			default:
				diaName = "Out of range";					
		}
		
		System.out.println(diaName);
	}
}
