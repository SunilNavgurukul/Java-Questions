import java.util.Scanner;
public class OddEven{
	public static void main(String[] args) {
		int input;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number input");
		input = obj.nextInt();
		int index = 0;
		int copy = input;
		int s = 0;
		int v=0;
		int b=0;
		String boss=" ";
		while (input>=index){
			input-=1;
			if (input%2==0) {
				String str1 = Integer.toString(input);
				boss = boss + str1 + ", ";
				s+=1;
				if (s==3) {
					System.out.println("Pehle 3 Even Number: ");
					System.out.println(boss);
					break;
				}
			}
		}while (copy>=v){
			copy+=1;
			if(copy%2!=0){
				System.out.println(copy);
				b+=1;
				if (b==3) {
					break;
				}
			}
		}
	}
}