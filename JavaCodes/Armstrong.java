import java.util.Scanner;
public class Armstrong 
{

	public static void main(String[] args) 
	{
		int num,rem,sum = 0;
		int input;
		Scanner obj = new Scanner(System.in);
		input = obj.nextInt();
		System.out.print("Armstrong numbers from 1 to N:");
		for (int i = 1; i <= input; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}

	}

}