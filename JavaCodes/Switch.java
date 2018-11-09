public class  Switch{
	public static void main(String[] args) {
		int day = 2;	
		String DayString;
		switch (day){
			case 1: DayString = "sunday";
				break;
			case 2: DayString = "Monday";
				break;
			case 3: DayString = "tuesday";
				break;
			case 4: DayString = "Wednesday";
				break;
			case 5: DayString = "Thursday";
				break;
			case 6: DayString = "Friday";
				break;
			case 7: DayString = "Satuarday";
				break;
			default: DayString = "Invalid Day";
		}
		System.out.println(DayString);
	}
}