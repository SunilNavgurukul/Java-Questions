import java.util.Scanner;
public class Divisible{
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the any number");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		int ind = 1;
		while (ind <= num){
			if (ind%3==0 || ind%5==0) {
				System.out.println(ind);
			}
			ind+=1;
		}
	}
}