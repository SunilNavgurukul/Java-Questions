import java.util.Scanner;
public class Leap{
	public static void main(String[] args) {
		int Year;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the Year");
		Year = obj.nextInt();
		if (Year%4==0 && Year%100==0 && Year%400==0) {
			System.out.println("Yes it is Leap Year");
		}else if (Year%4==0 && Year%100==0 && Year%400!=0) {
			System.out.println("Yes it is not Leap Year");
		}
		else if (Year%4==0) {
			System.out.println("Yes it is Leap Year");
		}
		else{
			System.out.println("No it is not Leap Year");
		}
	}
}