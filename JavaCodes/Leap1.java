import java.util.Scanner;
public class Leap1{
	public static void main(String[] args) {
		int input;
		int index = 0;
		String sava1=" ";
		String sava2=" ";
		int s = 0;
		int v=0;
		int b=0;
		System.out.println("Enter the an year: )");
		Scanner obj = new Scanner(System.in);
		input = obj.nextInt();
		int copy = input;
		while (input>= index){
			input+=1;
			if (input%4==0) {
			sava1=sava1+ Integer.toString(input)+ ", ";
			s=s+1;
			if (s==3) {
				System.out.println("Aage ke tin leap year : ) " + sava1);
				break;
			}
		}
			}
			while (copy>=index){
				copy-=1;
				if (copy%4==0) {
					sava2 = sava2 + Integer.toString(copy) +", ";
					v+=1;
					if (v==3) {
						System.out.println("Piche ke Leap year :) " + sava2);
						break;
					}
				}
			}
		}
	}
